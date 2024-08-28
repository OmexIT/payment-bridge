package org.mifos.paymentbridge.integrations.mifos;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.mifos.paymentbridge.integrations.mifos.api.MifosApiClient;
import org.mifos.paymentbridge.integrations.mifos.portfolio.loan.Loan;
import org.mifos.paymentbridge.integrations.mifos.portfolio.loan.Transaction;
import org.mifos.paymentbridge.integrations.mifos.portfolio.loanHook.LoanHook;
import org.mifos.paymentbridge.core.payment.OutgoingPayment;
import org.mifos.paymentbridge.core.payment.PaymentService;
import org.mifos.paymentbridge.core.payment.PaymentStatus;
import org.mifos.paymentbridge.core.payment.PaymentType;
import org.mifos.paymentbridge.core.util.DateUtil;
import org.mifos.paymentbridge.exception.ValidationException;
import org.mifos.paymentbridge.dto.ErrorCode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class LoanHookHandler implements HookHandler {
	private final PaymentService paymentService;
	private final MifosApiClient mifosApiClient;

	@Value("${mifosPaymentBridge.mifos.baseUrl}")
	private String mifosBaseUrl;
	@Value("${mifosPaymentBridge.mifos.username}")
	private String mifosUsername;
	@Value("${mifosPaymentBridge.mifos.password}")
	private String mifosPassword;

	/**
	 * Handle mifos hook request. This method provide first contact for mifos hook
	 * event.
	 * 
	 * @param request
	 *            - JSON String payload from mifos
	 * @throws ValidationException
	 *             - Exception thrown when the request does not pass certain
	 *             threshhold of sanity
	 */
	@Transactional
	@Override
	public void handleHook(String request) throws ValidationException {
		log.debug("handleHook({})", request);

		ObjectMapper mapper = new ObjectMapper();
		try {
			// Convert payload json string to java object
			LoanHook loanHook = mapper.readValue(request, LoanHook.class);

			String action = loanHook.getAction();
			log.info("get hook action: - {}", action);

			Map<String, String> loanQueryParams = new HashMap<>();
			loanQueryParams.put("tenantIdentifier", loanHook.getTenantId());
			loanQueryParams.put("pretty", "false");
			loanQueryParams.put("associations", "all");
			loanQueryParams.put("exclude", "guarantors");

			log.info("Mifos.getLoan({},{})", loanHook.getLoanId(), loanQueryParams);

			Loan loan = mifosApiClient.getLoan(loanHook.getLoanId(), loanQueryParams);

			// Check if the loan is aready created
			log.info("findPaymentIfExist({},{},{},{})", loanHook.getLoanId(), loanHook.getTenantId(),
					loanHook.getClientId(), loanHook.getEntity());
			OutgoingPayment payment = (OutgoingPayment) paymentService.findPaymentIfExist(loanHook.getLoanId(),
					loanHook.getTenantId(), loanHook.getClientId(), loanHook.getEntity());

			if (payment == null) {
				log.info(String.format(
						"findPaymentIfExist(LoanId-%s,TenantId-%s,ClientId-%sEntity-%s) - Not found, system will create new object",
						loanHook.getLoanId(), loanHook.getTenantId(), loanHook.getClientId(), loanHook.getEntity()));
				payment = new OutgoingPayment();
			} else {
				log.info(String.format("findPaymentIfExist(LoanId-%s,TenantId-%s,ClientId-%sEntity-%s) - Found.",
						loanHook.getLoanId(), loanHook.getTenantId(), loanHook.getClientId(), loanHook.getEntity()));
			}

			// Get loan details from mifos if action is DISBURSE
			if (action.equals("DISBURSE")) {
				log.info("running action - {}", "DISBURSE");

				// Check if disbursal is complete or processing, if so throw
				// Exception
				// We don't want duplicate transactions
				if (payment.getPaymentStatus().isPaymentComplete()) {
					throw new ValidationException("Duplicate transaction already processed!", String
							.format("Disbursal for: %s transaction is already complete!", loanHook.getResourceId()),
							ErrorCode.DUPLICATE_PAYMENT_PROCESSED);
				} else if (payment.getPaymentStatus().isPaymentProcessing()) {
					throw new ValidationException("Duplicate transaction is being processed!",
							String.format("Disbursal for: %s transaction is still processing! Wait for final status.",
									loanHook.getResourceId()),
							ErrorCode.DUPLICATE_PAYMENT_PROCESSING);
				}

				payment.setAction(loanHook.getAction());
				payment.setClientId(loanHook.getClientId());
				payment.setEntity(loanHook.getEntity());
				payment.setEntityId(loanHook.getLoanId());
				payment.setTenantId(loanHook.getTenantId());
				payment.setPaymentStatus(PaymentStatus.PAYMENT_PENDING);
				payment.setPaymentType(PaymentType.OUTGOING);
				payment.setRetryCount(0);
				// Set actual disbursement date
				payment.setActualDisbursementDate(DateUtil.parseDate(loanHook.getChanges().getActualDisbursementDate(),
						loanHook.getChanges().getDateFormat()));

				if (loan == null) {
					String message = "Could not find details for loan id: " + payment.getEntity() + " was not found";
					payment.setErrorCode(ErrorCode.EXPECTED_MIFOS_RESOURCE_NOT_FOUND);
					payment.setStatusReasonCodeMessage(message);
					payment.setPaymentStatus(PaymentStatus.PAYMENT_FAILED);
					paymentService.saveOrUpdatePayment(payment);

					log.warn(message);
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

					log.warn(message);
					throw new ValidationException(message, "", ErrorCode.EXPECTED_MIFOS_RESOURCE_NOT_FOUND);
				}
				// Set currency
				payment.setCurrency(loan.getCurrency().getCode());
				// Get amount from disbursal transaction
				payment.setTransactionAmount(disburseTransaction.getAmount());

				payment.setPaymentStatus(PaymentStatus.PAYMENT_PENDING);
				payment.setActualDisbursementDate(DateUtil.parseDate(loanHook.getChanges().getActualDisbursementDate(),
						loanHook.getChanges().getDateFormat()));
				payment.setStatusReasonCodeMessage("OK");
				payment.setErrorCode(ErrorCode.OK);
				payment = (OutgoingPayment) paymentService.saveOrUpdatePayment(payment);

			} else if (action.equals("DISBURSALUNDO")) {
				log.info("running action - {}", "DISBURSALUNDO");
				if (payment.getId() != null) {
					// Check if disbursal is complete or processing, if so
					// throw
					// Exception
					if (payment.getPaymentStatus().isPaymentComplete()) {
						throw new Exception(String.format("Disbursal for: %s transaction is already complete!",
								loanHook.getResourceId()));
					}
					// Set that payment has been put on hold
					payment.setPaymentStatus(PaymentStatus.PAYMENT_ON_HOLD);
					payment.setStatusReasonCodeMessage("Payment put on hold.");
					payment.setErrorCode(ErrorCode.OK);
					paymentService.saveOrUpdatePayment(payment);
				}
			}

		} catch (ValidationException e) {
			log.error(e.getDeveloperMessage(), e);
		} catch (JsonParseException e) {
			log.error("Error parsing JSON", e);
		} catch (JsonMappingException e) {
			log.error("Error mapping JSON", e);
		} catch (IOException e) {
			log.error("IOException", e);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}
}
