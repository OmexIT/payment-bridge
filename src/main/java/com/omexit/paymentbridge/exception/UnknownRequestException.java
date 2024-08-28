package com.omexit.paymentbridge.exception;

import com.omexit.paymentbridge.core.util.types.ErrorCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UnknownRequestException extends Exception {
	private static final long serialVersionUID = 48598860123L;
	private final String developerMessage;
	private final ErrorCode errorCode;
	private final String message;

	public UnknownRequestException(String message, String developerMessage, ErrorCode errorCode) {
		super(developerMessage);
		this.developerMessage = developerMessage;
		this.errorCode = errorCode;
		this.message = message;
	}

}
