package org.mifos.paymentbridge.exception;

public class ChannelNotFoundException extends RuntimeException {
	public ChannelNotFoundException(String message) {
		super(message);
	}

}
