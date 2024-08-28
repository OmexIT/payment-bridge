
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
public class Summary {

	@JsonProperty("currency")
	private Currency currency;
	@JsonProperty("principalDisbursed")
	private Double principalDisbursed;
	@JsonProperty("principalPaid")
	private Double principalPaid;
	@JsonProperty("principalWrittenOff")
	private Double principalWrittenOff;
	@JsonProperty("principalOutstanding")
	private Double principalOutstanding;
	@JsonProperty("principalOverdue")
	private Long principalOverdue;
	@JsonProperty("interestCharged")
	private Double interestCharged;
	@JsonProperty("interestPaid")
	private Double interestPaid;
	@JsonProperty("interestWaived")
	private Double interestWaived;
	@JsonProperty("interestWrittenOff")
	private Double interestWrittenOff;
	@JsonProperty("interestOutstanding")
	private Double interestOutstanding;
	@JsonProperty("interestOverdue")
	private Long interestOverdue;
	@JsonProperty("feeChargesCharged")
	private Double feeChargesCharged;
	@JsonProperty("feeChargesDueAtDisbursementCharged")
	private Double feeChargesDueAtDisbursementCharged;
	@JsonProperty("feeChargesPaid")
	private Double feeChargesPaid;
	@JsonProperty("feeChargesWaived")
	private Double feeChargesWaived;
	@JsonProperty("feeChargesWrittenOff")
	private Double feeChargesWrittenOff;
	@JsonProperty("feeChargesOutstanding")
	private Double feeChargesOutstanding;
	@JsonProperty("feeChargesOverdue")
	private Long feeChargesOverdue;
	@JsonProperty("penaltyChargesCharged")
	private Double penaltyChargesCharged;
	@JsonProperty("penaltyChargesPaid")
	private Double penaltyChargesPaid;
	@JsonProperty("penaltyChargesWaived")
	private Double penaltyChargesWaived;
	@JsonProperty("penaltyChargesWrittenOff")
	private Double penaltyChargesWrittenOff;
	@JsonProperty("penaltyChargesOutstanding")
	private Double penaltyChargesOutstanding;
	@JsonProperty("penaltyChargesOverdue")
	private Long penaltyChargesOverdue;
	@JsonProperty("totalExpectedRepayment")
	private Double totalExpectedRepayment;
	@JsonProperty("totalRepayment")
	private Double totalRepayment;
	@JsonProperty("totalExpectedCostOfLoan")
	private Double totalExpectedCostOfLoan;
	@JsonProperty("totalCostOfLoan")
	private Double totalCostOfLoan;
	@JsonProperty("totalWaived")
	private Double totalWaived;
	@JsonProperty("totalWrittenOff")
	private Double totalWrittenOff;
	@JsonProperty("totalOutstanding")
	private Double totalOutstanding;
	@JsonProperty("totalOverdue")
	private Long totalOverdue;
}
