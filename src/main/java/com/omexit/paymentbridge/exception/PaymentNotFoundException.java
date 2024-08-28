package com.omexit.paymentbridge.exception;

public class PaymentNotFoundException extends RuntimeException {
	public PaymentNotFoundException(String message) {
		super(message);
	}
}