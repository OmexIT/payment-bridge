package com.omexit.paymentbridge.components.mifos;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.omexit.paymentbridge.components.mifos.api.MifosApiInterface;
import com.omexit.paymentbridge.core.channel.Channel;
import com.omexit.paymentbridge.core.channel.ChannelService;
import com.omexit.paymentbridge.components.mifos.portfolio.loan.Loan;
import com.omexit.paymentbridge.components.mifos.portfolio.loan.Transaction;
import com.omexit.paymentbridge.components.mifos.portfolio.loanHook.LoanHook;
import com.omexit.paymentbridge.core.payment.OutgoingPayment;
import com.omexit.paymentbridge.core.payment.PaymentService;
import com.omexit.paymentbridge.core.payment.PaymentStatus;
import com.omexit.paymentbridge.core.payment.PaymentType;
import com.omexit.paymentbridge.core.util.DateUtil;
import com.omexit.paymentbridge.core.util.exception.ResourceNotFoundException;
import com.omexit.paymentbridge.core.util.exception.ValidationException;
import com.omexit.paymentbridge.core.util.externalApi.ExternalApiServiceGenerator;
import com.omexit.paymentbridge.core.util.types.ErrorCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Antony on 5/27/2016.
 */
@Service
public class LoanHookHandler implements HookHandler {
    private final PaymentService paymentService;
    private final ChannelService channelService;
    private final ExternalApiServiceGenerator externalApiServiceGenerator;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${mifosPaymentBridge.mifos.baseUrl}")
    private String mifosBaseUrl;
    @Value("${mifosPaymentBridge.mifos.username}")
    private String mifosUsername;
    @Value("${mifosPaymentBridge.mifos.password}")
    private String mifosPassword;

    /**
     * Constructor to initialize global variables
     *
     * @param externalApiServiceGenerator - Retrofit api service generator helper
     * @param channelService - Spring service that help interaction with Payment Channels
     * @param paymentService - Spring Service for Payment interaction
     */
    @Autowired
    public LoanHookHandler(ChannelService channelService,
                           PaymentService paymentService,
                           ExternalApiServiceGenerator externalApiServiceGenerator) {
        this.channelService = channelService;
        this.paymentService = paymentService;
        this.externalApiServiceGenerator = externalApiServiceGenerator;
    }


    /**
     * Handle mifos hook request. This method provide first contact for mifos hook event.
     * @param request - JSON String payload from mifos
     * @throws ValidationException - Exception thrown when the request does not pass certain threshhold of sanity
     */
    @Transactional
    @Override
    public void handleHook(String request) throws ValidationException {
        logger.debug("handleHook({})", request);

        ObjectMapper mapper = new ObjectMapper();
        try {

            MifosApiInterface mifosApiService =
                    externalApiServiceGenerator.createService(MifosApiInterface.class, mifosBaseUrl, mifosUsername, mifosPassword);


            // Convert payload json string to java object
            LoanHook loanHook = mapper.readValue(request, LoanHook.class);

            String action = loanHook.getAction();
            logger.info("get hook action: - {}", action);

            Map<String, String> loanQueryParams = new HashMap<>();
            loanQueryParams.put("tenantIdentifier", loanHook.getTenantId());
            loanQueryParams.put("pretty", "false");
            loanQueryParams.put("associations", "all");
            loanQueryParams.put("exclude", "guarantors");

            logger.info("Mifos.getLoan({},{})", loanHook.getLoanId(), loanQueryParams);
            //Get Loan details from mifos
            Call<Loan> loanCall = mifosApiService.getLoan(loanHook.getLoanId(), loanQueryParams);
            Response<Loan> loanResponse = loanCall.execute();

            logger.info(String.format("getLoan() - response {:isSuccess %s :statusCode %s, :message %s}",
                    loanResponse.isSuccessful(), loanResponse.code(), loanResponse.message()));

            if (loanResponse.isSuccessful()) {
                Loan loan = loanResponse.body();

                //Check if the loan is aready created
                logger.info("findPaymentIfExist({},{},{},{})", loanHook.getLoanId(), loanHook.getTenantId(),
                        loanHook.getClientId(), loanHook.getEntity());
                OutgoingPayment payment = (OutgoingPayment) paymentService.findPaymentIfExist(
                        loanHook.getLoanId(), loanHook.getTenantId(),
                        loanHook.getClientId(), loanHook.getEntity());

                if (payment == null) {
                    logger.info(String.format("findPaymentIfExist(LoanId-%s,TenantId-%s,ClientId-%sEntity-%s) - Not found, system will create new object",
                            loanHook.getLoanId(), loanHook.getTenantId(),
                            loanHook.getClientId(), loanHook.getEntity()));
                    payment = new OutgoingPayment();
                } else {
                    logger.info(String.format("findPaymentIfExist(LoanId-%s,TenantId-%s,ClientId-%sEntity-%s) - Found.",
                            loanHook.getLoanId(), loanHook.getTenantId(),
                            loanHook.getClientId(), loanHook.getEntity()));
                }


                // Get loan details from mifos if action is DISBURSE
                if (action.equals("DISBURSE")) {
                    logger.info("running action - {}", "DISBURSE");

                    // Check if disbursal is complete or processing, if so throw
                    // Exception
                    // We don't want duplicate transactions
                    if (payment.getPaymentStatus().isPaymentComplete()) {
                        throw new ValidationException("Duplicate transaction already processed!",
                                String.format("Disbursal for: %s transaction is already complete!", loanHook.getResourceId()),
                                ErrorCode.DUPLICATE_PAYMENT_PROCESSED);
                    } else if (payment.getPaymentStatus().isPaymentProcessing()) {
                        throw new ValidationException("Duplicate transaction is being processed!",
                                String.format("Disbursal for: %s transaction is still processing! Wait for final status.",
                                        loanHook.getResourceId()), ErrorCode.DUPLICATE_PAYMENT_PROCESSING);
                    }

                    payment.setAction(loanHook.getAction());
                    payment.setClientId(loanHook.getClientId());
                    payment.setEntity(loanHook.getEntity());
                    payment.setEntityId(loanHook.getLoanId());
                    payment.setTenantId(loanHook.getTenantId());
                    payment.setPaymentStatus(PaymentStatus.PAYMENT_PENDING);
                    payment.setPaymentType(PaymentType.OUTGOING);
                    payment.setRetryCount(0);
                    //Set actual disbursement date
                    payment.setActualDisbursementDate(DateUtil.parseDate(loanHook.getChanges().getActualDisbursementDate(),
                            loanHook.getChanges().getDateFormat()));

                    if (loan == null) {
                        String message = "Could not find details for loan id: " + payment.getEntity()
                                + " was not found";
                        payment.setErrorCode(ErrorCode.EXPECTED_MIFOS_RESOURCE_NOT_FOUND);
                        payment.setStatusReasonCodeMessage(message);
                        payment.setPaymentStatus(PaymentStatus.PAYMENT_FAILED);
                        paymentService.saveOrUpdatePayment(payment);

                        logger.warn(message);
                        throw new ValidationException("", message, ErrorCode.EXPECTED_MIFOS_RESOURCE_NOT_FOUND);
                    }

                    // Get disbursal transaction
                    Transaction disburseTransaction = null;
                    for (Transaction transaction : loan.getTransactions()) {
                        if (transaction.getType().getCode().equals("loanTransactionType.disbursement")) {
                            disburseTransaction = transaction;
                            break;
                        }
                    }

                    // Check the disbursal transaction is not present if so
                    // register
                    // payment failure due to no disbursal transaction
                    if (disburseTransaction == null) {
                        String message = "Could not find disbursal transaction for loan id: " + payment.getEntity()
                                + " was not found";
                        payment.setErrorCode(ErrorCode.EXPECTED_MIFOS_RESOURCE_NOT_FOUND);
                        payment.setStatusReasonCodeMessage(message);
                        payment.setPaymentStatus(PaymentStatus.PAYMENT_FAILED);
                        paymentService.saveOrUpdatePayment(payment);

                        logger.warn(message);
                        throw new ValidationException(message, "", ErrorCode.EXPECTED_MIFOS_RESOURCE_NOT_FOUND);
                    }
                    //Set currency
                    payment.setCurrency(loan.getCurrency().getCode());
                    // Get amount from disbursal transaction
                    payment.setTransactionAmount(disburseTransaction.getAmount());

                    // Get channel name from disbursal transaction
                    String channelName = disburseTransaction.getPaymentDetailData().getPaymentType().getName();

                    // Get channel from registered channels
                    Channel channel = channelService.findChannelByChannelName(channelName);

                    // Check if registered channel is null, if so register
                    // payment
                    // failure due to missing channel
                    if (channel == null) {
                        String message = "Channel with name: " + channelName + " not found";
                        payment.setErrorCode(ErrorCode.RESOURCE_NOT_FOUND);
                        payment.setStatusReasonCodeMessage(message);
                        payment.setPaymentStatus(PaymentStatus.PAYMENT_FAILED);
                        paymentService.saveOrUpdatePayment(payment);
                        throw new ResourceNotFoundException(message, "", ErrorCode.RESOURCE_NOT_FOUND);
                    }
                    payment.setChannel(channel);




                    payment.setPaymentStatus(PaymentStatus.PAYMENT_PENDING);
                    payment.setActualDisbursementDate(DateUtil.parseDate(
                            loanHook.getChanges().getActualDisbursementDate(), loanHook.getChanges().getDateFormat()));
                    payment.setStatusReasonCodeMessage("OK");
                    payment.setErrorCode(ErrorCode.OK);
                    payment = (OutgoingPayment) paymentService.saveOrUpdatePayment(payment);

                } else if (action.equals("DISBURSALUNDO")) {
                    logger.info("running action - {}", "DISBURSALUNDO");
                    if (payment.getId() != null) {
                        // Check if disbursal is complete or processing, if so
                        // throw
                        // Exception
                        if (payment.getPaymentStatus().isPaymentComplete()) {
                            throw new Exception(String.format("Disbursal for: %s transaction is already complete!",
                                    loanHook.getResourceId()));
                        }
                        //Set that payment has been put on hold
                        payment.setPaymentStatus(PaymentStatus.PAYMENT_ON_HOLD);
                        payment.setStatusReasonCodeMessage("Payment put on hold.");
                        payment.setErrorCode(ErrorCode.OK);
                        paymentService.saveOrUpdatePayment(payment);
                    }
                }

            }

        } catch (ValidationException e) {
            logger.error(e.getDeveloperMessage(), e);
        } catch (JsonParseException e) {
            logger.error("Error parsing JSON", e);
        } catch (JsonMappingException e) {
            logger.error("Error mapping JSON", e);
        } catch (IOException e) {
            logger.error("IOException", e);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }
}
