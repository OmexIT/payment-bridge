
package org.mifos.paymentbridge.integrations.mifos.portfolio.loan;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Type {

	@JsonProperty("id")
	private Long id;
	@JsonProperty("code")
	private String code;
	@JsonProperty("value")
	private String value;
	@JsonProperty("disbursement")
	private Boolean disbursement;
	@JsonProperty("repaymentAtDisbursement")
	private Boolean repaymentAtDisbursement;
	@JsonProperty("repayment")
	private Boolean repayment;
	@JsonProperty("contra")
	private Boolean contra;
	@JsonProperty("waiveInterest")
	private Boolean waiveInterest;
	@JsonProperty("waiveCharges")
	private Boolean waiveCharges;
	@JsonProperty("accrual")
	private Boolean accrual;
	@JsonProperty("writeOff")
	private Boolean writeOff;
	@JsonProperty("recoveryRepayment")
	private Boolean recoveryRepayment;
	@JsonProperty("initiateTransfer")
	private Boolean initiateTransfer;
	@JsonProperty("approveTransfer")
	private Boolean approveTransfer;
	@JsonProperty("withdrawTransfer")
	private Boolean withdrawTransfer;
	@JsonProperty("rejectTransfer")
	private Boolean rejectTransfer;
	@JsonProperty("chargePayment")
	private Boolean chargePayment;
	@JsonProperty("refund")
	private Boolean refund;
	@JsonProperty("refundForActiveLoans")
	private Boolean refundForActiveLoans;
}
