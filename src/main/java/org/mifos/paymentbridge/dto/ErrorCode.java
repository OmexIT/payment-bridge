package org.mifos.paymentbridge.dto;

/**
 * Created by Antony on 7/19/2016.
 */
public enum ErrorCode {
	OK(1000, "OK"), RESOURCE_NOT_FOUND(1001, "RESOURCE_NOT_FOUND"), UNKNOWN_REQUEST(1002,
			"UNKNOWN_REQUEST"), DUPLICATE_PAYMENT_PROCESSED(1003,
					"DUPLICATE_PAYMENT_PROCESSED"), DUPLICATE_PAYMENT_PROCESSING(1004,
							"DUPLICATE_PAYMENT_PROCESSING"), EXPECTED_MIFOS_RESOURCE_NOT_FOUND(1005,
									"EXPECTED_MIFOS_RESOURCE_NOT_FOUND"), OUTGOING_PAYMENT_FAILED(1006,
											"OUTGOING_PAYMENT_FAILED"), IVALID_CHANNEL_TYPE(1007,
													"IVALID_CHANNEL_TYPE"), JSON_PARSE_EXCEPTION(1008,
															"JSON_PARSE_EXCEPTION"), JSON_MAPPING_EXCEPTION(1009,
																	"JSON_MAPPING_EXCEPTION"), IOEXCEPTION(1010,
																			"IOEXCEPTION"), UNKNOWN_EXCEPTION(1011,
																					"UNKNOWN_EXCEPTION");

	private final Integer value;
	private final String code;

	private ErrorCode(final Integer value, final String code) {
		this.value = value;
		this.code = code;
	}
}
