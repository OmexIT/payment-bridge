
package org.mifos.paymentbridge.integrations.mifos.portfolio.savingsAccountTransaction;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDetailData {

	@JsonProperty("id")
	private Long id;
	@JsonProperty("paymentType")
	private PaymentType paymentType;
	@JsonProperty("accountNumber")
	private String accountNumber;
	@JsonProperty("checkNumber")
	private String checkNumber;
	@JsonProperty("routingCode")
	private String routingCode;
	@JsonProperty("receiptNumber")
	private String receiptNumber;
	@JsonProperty("bankNumber")
	private String bankNumber;
}
