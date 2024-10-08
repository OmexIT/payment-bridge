package org.mifos.paymentbridge.core.payment;

import org.mifos.paymentbridge.exception.PaymentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Antony on 2/12/2016.
 */
@Service
public class PaymentServiceImpl implements PaymentService {

	private final PaymentRepository paymentRepository;

	@Autowired
	public PaymentServiceImpl(PaymentRepository paymentRepository) {
		this.paymentRepository = paymentRepository;
	}

	@Override
	public List<Payment> findAllPayments() {
		return paymentRepository.findAll();
	}

	@Override
	public Payment saveOrUpdatePayment(Payment payment) {
		return paymentRepository.save(payment);
	}

	@Override
	public Payment findPaymentById(Long id) {
		return paymentRepository.findById(id)
				.orElseThrow(() -> new PaymentNotFoundException("Payment with id " + id + " not found"));
	}

	@Override
	public Payment findPaymentIfExist(Long entityId, String tenantId, Long clientId, String entity) {
		return paymentRepository.findByEntityIdAndTenantIdAndClientIdAndEntity(entityId, tenantId, clientId, entity);
	}

	@Override
	public List<Payment> findTransactionsToProcess(Date actualDisbursementDate, PaymentStatus paymentStatus) {
		return paymentRepository.findTransactionsToProcess(actualDisbursementDate, paymentStatus);
	}
}
