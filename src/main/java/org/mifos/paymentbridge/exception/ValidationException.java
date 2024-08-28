package org.mifos.paymentbridge.exception;

import org.mifos.paymentbridge.dto.ErrorCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

@Setter
@Getter
public class ValidationException extends Exception {
	@Serial
	private static final long serialVersionUID = 48598860124L;

	private final String developerMessage;
	private final ErrorCode errorCode;

	private final String message;

	public ValidationException(String message, String developerMessage, ErrorCode errorCode) {
		super(developerMessage);
		this.developerMessage = developerMessage;
		this.errorCode = errorCode;
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
