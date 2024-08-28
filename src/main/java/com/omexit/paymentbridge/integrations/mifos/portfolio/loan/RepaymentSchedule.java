
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
public class RepaymentSchedule {

	@JsonProperty("currency")
	private Currency currency;
	@JsonProperty("loanTermInDays")
	private Long loanTermInDays;
	@JsonProperty("totalPrincipalDisbursed")
	private Double totalPrincipalDisbursed;
	@JsonProperty("totalPrincipalExpected")
	private Double totalPrincipalExpected;
	@JsonProperty("totalPrincipalPaid")
	private Double totalPrincipalPaid;
	@JsonProperty("totalInterestCharged")
	private Double totalInterestCharged;
	@JsonProperty("totalFeeChargesCharged")
	private Double totalFeeChargesCharged;
	@JsonProperty("totalPenaltyChargesCharged")
	private Double totalPenaltyChargesCharged;
	@JsonProperty("totalWaived")
	private Double totalWaived;
	@JsonProperty("totalWrittenOff")
	private Double totalWrittenOff;
	@JsonProperty("totalRepaymentExpected")
	private Double totalRepaymentExpected;
	@JsonProperty("totalRepayment")
	private Double totalRepayment;
	@JsonProperty("totalPaidInAdvance")
	private Double totalPaidInAdvance;
	@JsonProperty("totalPaidLate")
	private Double totalPaidLate;
	@JsonProperty("totalOutstanding")
	private Double totalOutstanding;
	@JsonProperty("periods")
	private List<Period> periods = new ArrayList<Period>();

}
