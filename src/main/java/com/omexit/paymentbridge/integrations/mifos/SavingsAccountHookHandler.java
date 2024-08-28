package com.omexit.paymentbridge.integrations.mifos;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.omexit.paymentbridge.core.channel.ChannelRepository;
import com.omexit.paymentbridge.core.payment.OutgoingPayment;
import com.omexit.paymentbridge.core.payment.PaymentService;
import com.omexit.paymentbridge.core.payment.PaymentStatus;
import com.omexit.paymentbridge.core.payment.PaymentType;
import com.omexit.paymentbridge.exception.ValidationException;
import com.omexit.paymentbridge.core.util.types.ErrorCode;
import com.omexit.paymentbridge.integrations.mifos.api.MifosApiClient;
import com.omexit.paymentbridge.integrations.mifos.portfolio.savingAccountHook.SavingsAccountHook;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Slf4j
@Service
public class SavingsAccountHookHandler implements HookHandler {
	private PaymentService paymentService;

	private ChannelRepository channelRepository;

	private MifosApiClient mifosApiClient;

	SavingsAccountHookHandler() {
	}

	@Override
	public void handleHook(String request) throws ValidationException {
		log.debug(String.format("handleHook(payload-%s)", request));
		ObjectMapper mapper = new ObjectMapper();
		try {
			// Convert payload json string to java object
			SavingsAccountHook savingsAccountHook = mapper.readValue(request, SavingsAccountHook.class);

			String action = savingsAccountHook.getAction();

			OutgoingPayment payment = (OutgoingPayment) paymentService.findPaymentIfExist(
					savingsAccountHook.getResourceId(), savingsAccountHook.getTenantId(),
					savingsAccountHook.getClientId(), savingsAccountHook.getEntity());

			if (payment == null) {
				log.debug(String.format(
						"findPaymentIfExist(ResourceId-%s,TenantId-%s,ClientId-%sEntity-%s) - Not found, system will create new object",
						savingsAccountHook.getResourceId(), savingsAccountHook.getTenantId(),
						savingsAccountHook.getClientId(), savingsAccountHook.getEntity()));
				payment = new OutgoingPayment();
			}
			log.debug(String.format("findPaymentIfExist(ResourceId-%s,TenantId-%s,ClientId-%sEntity-%s) - Found.",
					savingsAccountHook.getResourceId(), savingsAccountHook.getTenantId(),
					savingsAccountHook.getClientId(), savingsAccountHook.getEntity()));

			payment.setAction(savingsAccountHook.getAction());
			payment.setClientId(savingsAccountHook.getClientId());
			payment.setEntity(savingsAccountHook.getEntity());
			payment.setEntityId(savingsAccountHook.getResourceId());
			payment.setTenantId(savingsAccountHook.getTenantId());
			payment.setPaymentStatus(PaymentStatus.PAYMENT_PENDING);
			payment.setPaymentType(PaymentType.OUTGOING);

			// Check if action is withdrawal, if so process it accordingly
			if (action.equals("WITHDRAWAL")) {
				// Check if disbursal is complete or processing, if so throw
				// Exception
				if (payment.getPaymentStatus().isPaymentComplete()) {
					throw new ValidationException("Payment already processed, no changes can take place!",
							String.format("Disbursal for: %s transaction is already complete!",
									savingsAccountHook.getResourceId()),
							ErrorCode.DUPLICATE_PAYMENT_PROCESSED);
				} else if (payment.getPaymentStatus().isPaymentProcessing()) {
					throw new ValidationException("Payment is being processed, no changes can take place!",
							String.format("Disbursal for: %s transaction is still processing! Wait for final status.",
									savingsAccountHook.getResourceId()),
							ErrorCode.DUPLICATE_PAYMENT_PROCESSING);
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
