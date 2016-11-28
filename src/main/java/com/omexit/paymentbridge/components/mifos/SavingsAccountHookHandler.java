package com.omexit.paymentbridge.components.mifos;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.omexit.mifosPaymentBridge.channel.ChannelRepository;
import com.omexit.mifosPaymentBridge.externalApi.mifos.MifosApiInterface;
import com.omexit.mifosPaymentBridge.mifos.portfolio.savingAccountHook.SavingsAccountHook;
import com.omexit.mifosPaymentBridge.payment.OutgoingPayment;
import com.omexit.mifosPaymentBridge.payment.PaymentService;
import com.omexit.mifosPaymentBridge.payment.PaymentStatusType;
import com.omexit.mifosPaymentBridge.payment.PaymentType;
import com.omexit.mifosPaymentBridge.util.exception.ValidationException;
import com.omexit.mifosPaymentBridge.util.types.ErrorCode;
import com.omexit.paymentbridge.components.mifos.api.MifosApiInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;

/***
 *
 */
@Service
public class SavingsAccountHookHandler implements HookHandler {
    private PaymentService paymentService;

    private ChannelRepository channelRepository;

    private MifosApiInterface mifosApiInterface;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    SavingsAccountHookHandler() {
    }

    @Override
    public void handleHook(String request) throws ValidationException {
        logger.debug(String.format("handleHook(payload-%s)", request));
        ObjectMapper mapper = new ObjectMapper();
        try {
            // Convert payload json string to java object
            SavingsAccountHook savingsAccountHook = mapper.readValue(request, SavingsAccountHook.class);

            String action = savingsAccountHook.getAction();

            OutgoingPayment payment = (OutgoingPayment) paymentService.findPaymentIfExist(savingsAccountHook.getResourceId(),
                    savingsAccountHook.getTenantId(),
                    savingsAccountHook.getClientId(), savingsAccountHook.getEntity());

            if (payment == null) {
                logger.debug(String.format("findPaymentIfExist(ResourceId-%s,TenantId-%s,ClientId-%sEntity-%s) - Not found, system will create new object",
                        savingsAccountHook.getResourceId(), savingsAccountHook.getTenantId(),
                        savingsAccountHook.getClientId(), savingsAccountHook.getEntity()));
                payment = new OutgoingPayment();
            }
            logger.debug(String.format("findPaymentIfExist(ResourceId-%s,TenantId-%s,ClientId-%sEntity-%s) - Found.",
                    savingsAccountHook.getResourceId(), savingsAccountHook.getTenantId(),
                    savingsAccountHook.getClientId(), savingsAccountHook.getEntity()));

            payment.setAction(savingsAccountHook.getAction());
            payment.setClientId(savingsAccountHook.getClientId());
            payment.setEntity(savingsAccountHook.getEntity());
            payment.setEntityId(savingsAccountHook.getResourceId());
            payment.setTenantId(savingsAccountHook.getTenantId());
            payment.setPaymentStatus(PaymentStatusType.PAYMENT_PENDING);
            payment.setPaymentType(PaymentType.OUTGOING);

            //Check if action is withdrawal, if so process it accordingly
            if (action.equals("WITHDRAWAL")) {
                // Check if disbursal is complete or processing, if so throw
                // Exception
                if (payment.getPaymentStatus().isPaymentComplete()) {
                    throw new ValidationException("Payment already processed, no changes can take place!",
                            String.format("Disbursal for: %s transaction is already complete!",
                                    savingsAccountHook.getResourceId()), ErrorCode.DUPLICATE_PAYMENT_PROCESSED);
                } else if (payment.getPaymentStatus().isPaymentProcessing()) {
                    throw new ValidationException("Payment is being processed, no changes can take place!",
                            String.format("Disbursal for: %s transaction is still processing! Wait for final status.",
                                    savingsAccountHook.getResourceId()), ErrorCode.DUPLICATE_PAYMENT_PROCESSING);
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
