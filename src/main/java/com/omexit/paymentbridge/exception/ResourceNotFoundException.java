package com.omexit.paymentbridge.exception;

import com.omexit.paymentbridge.core.util.types.ErrorCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResourceNotFoundException extends Exception {
	private static final long serialVersionUID = 48598860122L;
	private String developerMessage;
	private ErrorCode errorCode;
	private String message;

	public ResourceNotFoundException(String message, String developerMessage, ErrorCode errorCode) {
		super(developerMessage);
		this.developerMessage = developerMessage;
		this.errorCode = errorCode;
		this.message = message;
	}

}
