
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
public class Period {
	@JsonProperty("dueDate")
	private List<Long> dueDate = new ArrayList<Long>();
	@JsonProperty("principalDisbursed")
	private Double principalDisbursed;
	@JsonProperty("principalLoanBalanceOutstanding")
	private Double principalLoanBalanceOutstanding;
	@JsonProperty("feeChargesDue")
	private Long feeChargesDue;
	@JsonProperty("feeChargesPaid")
	private Long feeChargesPaid;
	@JsonProperty("totalOriginalDueForPeriod")
	private Double totalOriginalDueForPeriod;
	@JsonProperty("totalDueForPeriod")
	private Double totalDueForPeriod;
	@JsonProperty("totalPaidForPeriod")
	private Long totalPaidForPeriod;
	@JsonProperty("totalActualCostOfLoanForPeriod")
	private Double totalActualCostOfLoanForPeriod;
	@JsonProperty("period")
	private Long period;
	@JsonProperty("fromDate")
	private List<Long> fromDate = new ArrayList<Long>();
	@JsonProperty("complete")
	private Boolean complete;
	@JsonProperty("daysInPeriod")
	private Long daysInPeriod;
	@JsonProperty("principalOriginalDue")
	private Double principalOriginalDue;
	@JsonProperty("principalDue")
	private Double principalDue;
	@JsonProperty("principalPaid")
	private Long principalPaid;
	@JsonProperty("principalWrittenOff")
	private Long principalWrittenOff;
	@JsonProperty("principalOutstanding")
	private Double principalOutstanding;
	@JsonProperty("interestOriginalDue")
	private Double interestOriginalDue;
	@JsonProperty("interestDue")
	private Double interestDue;
	@JsonProperty("interestPaid")
	private Long interestPaid;
	@JsonProperty("interestWaived")
	private Long interestWaived;
	@JsonProperty("interestWrittenOff")
	private Long interestWrittenOff;
	@JsonProperty("interestOutstanding")
	private Double interestOutstanding;
	@JsonProperty("feeChargesWaived")
	private Long feeChargesWaived;
	@JsonProperty("feeChargesWrittenOff")
	private Long feeChargesWrittenOff;
	@JsonProperty("feeChargesOutstanding")
	private Long feeChargesOutstanding;
	@JsonProperty("penaltyChargesDue")
	private Long penaltyChargesDue;
	@JsonProperty("penaltyChargesPaid")
	private Long penaltyChargesPaid;
	@JsonProperty("penaltyChargesWaived")
	private Long penaltyChargesWaived;
	@JsonProperty("penaltyChargesWrittenOff")
	private Long penaltyChargesWrittenOff;
	@JsonProperty("penaltyChargesOutstanding")
	private Long penaltyChargesOutstanding;
	@JsonProperty("totalPaidInAdvanceForPeriod")
	private Long totalPaidInAdvanceForPeriod;
	@JsonProperty("totalPaidLateForPeriod")
	private Long totalPaidLateForPeriod;
	@JsonProperty("totalWaivedForPeriod")
	private Long totalWaivedForPeriod;
	@JsonProperty("totalWrittenOffForPeriod")
	private Long totalWrittenOffForPeriod;
	@JsonProperty("totalOutstandingForPeriod")
	private Double totalOutstandingForPeriod;
	@JsonProperty("totalInstallmentAmountForPeriod")
	private Double totalInstallmentAmountForPeriod;
}
