
package com.omexit.paymentbridge.integrations.mifos.portfolio.savingsAccountTransaction;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionType {

	@JsonProperty("id")
	private Long id;
	@JsonProperty("code")
	private String code;
	@JsonProperty("value")
	private String value;
	@JsonProperty("deposit")
	private Boolean deposit;
	@JsonProperty("withdrawal")
	private Boolean withdrawal;
	@JsonProperty("interestPosting")
	private Boolean interestPosting;
	@JsonProperty("feeDeduction")
	private Boolean feeDeduction;
	@JsonProperty("initiateTransfer")
	private Boolean initiateTransfer;
	@JsonProperty("approveTransfer")
	private Boolean approveTransfer;
	@JsonProperty("withdrawTransfer")
	private Boolean withdrawTransfer;
	@JsonProperty("rejectTransfer")
	private Boolean rejectTransfer;
	@JsonProperty("overdraftInterest")
	private Boolean overdraftInterest;
	@JsonProperty("writtenoff")
	private Boolean writtenoff;
	@JsonProperty("overdraftFee")
	private Boolean overdraftFee;

}
