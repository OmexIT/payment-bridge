
package com.omexit.paymentbridge.integrations.mifos.portfolio.loan;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

	@JsonProperty("id")
	private Long id;
	@JsonProperty("officeId")
	private Long officeId;
	@JsonProperty("officeName")
	private String officeName;
	@JsonProperty("type")
	private Type type;
	@JsonProperty("date")
	private List<Long> date = new ArrayList<Long>();
	@JsonProperty("currency")
	private Currency currency;
	@JsonProperty("paymentDetailData")
	private PaymentDetailData paymentDetailData;
	@JsonProperty("amount")
	private Double amount;
	@JsonProperty("principalPortion")
	private Long principalPortion;
	@JsonProperty("interestPortion")
	private Double interestPortion;
	@JsonProperty("feeChargesPortion")
	private Long feeChargesPortion;
	@JsonProperty("penaltyChargesPortion")
	private Long penaltyChargesPortion;
	@JsonProperty("overpaymentPortion")
	private Long overpaymentPortion;
	@JsonProperty("unrecognizedIncomePortion")
	private Long unrecognizedIncomePortion;
	@JsonProperty("outstandingLoanBalance")
	private Long outstandingLoanBalance;
	@JsonProperty("submittedOnDate")
	private List<Long> submittedOnDate = new ArrayList<Long>();
	@JsonProperty("manuallyReversed")
	private Boolean manuallyReversed;

}
