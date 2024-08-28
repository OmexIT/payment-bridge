
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
public class Loan {

	@JsonProperty("id")
	private Long id;
	@JsonProperty("accountNo")
	private String accountNo;
	@JsonProperty("status")
	private Status status;
	@JsonProperty("clientId")
	private Long clientId;
	@JsonProperty("clientAccountNo")
	private String clientAccountNo;
	@JsonProperty("clientName")
	private String clientName;
	@JsonProperty("clientOfficeId")
	private Long clientOfficeId;
	@JsonProperty("loanProductId")
	private Long loanProductId;
	@JsonProperty("loanProductName")
	private String loanProductName;
	@JsonProperty("isLoanProductLinkedToFloatingRate")
	private Boolean isLoanProductLinkedToFloatingRate;
	@JsonProperty("loanType")
	private LoanType loanType;
	@JsonProperty("currency")
	private Currency currency;
	@JsonProperty("principal")
	private Double principal;
	@JsonProperty("approvedPrincipal")
	private Double approvedPrincipal;
	@JsonProperty("proposedPrincipal")
	private Double proposedPrincipal;
	@JsonProperty("termFrequency")
	private Long termFrequency;
	@JsonProperty("termPeriodFrequencyType")
	private TermPeriodFrequencyType termPeriodFrequencyType;
	@JsonProperty("numberOfRepayments")
	private Long numberOfRepayments;
	@JsonProperty("repaymentEvery")
	private Long repaymentEvery;
	@JsonProperty("repaymentFrequencyType")
	private RepaymentFrequencyType repaymentFrequencyType;
	@JsonProperty("repaymentFrequencyDayOfWeekType")
	private RepaymentFrequencyDayOfWeekType repaymentFrequencyDayOfWeekType;
	@JsonProperty("interestRatePerPeriod")
	private Double interestRatePerPeriod;
	@JsonProperty("interestRateFrequencyType")
	private InterestRateFrequencyType interestRateFrequencyType;
	@JsonProperty("annualInterestRate")
	private Double annualInterestRate;
	@JsonProperty("isFloatingInterestRate")
	private Boolean isFloatingInterestRate;
	@JsonProperty("amortizationType")
	private AmortizationType amortizationType;
	@JsonProperty("interestType")
	private InterestType interestType;
	@JsonProperty("interestCalculationPeriodType")
	private InterestCalculationPeriodType interestCalculationPeriodType;
	@JsonProperty("allowPartialPeriodInterestCalcualtion")
	private Boolean allowPartialPeriodInterestCalcualtion;
	@JsonProperty("transactionProcessingStrategyId")
	private Long transactionProcessingStrategyId;
	@JsonProperty("transactionProcessingStrategyName")
	private String transactionProcessingStrategyName;
	@JsonProperty("syncDisbursementWithMeeting")
	private Boolean syncDisbursementWithMeeting;
	@JsonProperty("timeline")
	private Timeline timeline;
	@JsonProperty("summary")
	private Summary summary;
	@JsonProperty("repaymentSchedule")
	private RepaymentSchedule repaymentSchedule;
	@JsonProperty("transactions")
	private List<Transaction> transactions = new ArrayList<Transaction>();
	@JsonProperty("disbursementDetails")
	private List<Object> disbursementDetails = new ArrayList<Object>();
	@JsonProperty("feeChargesAtDisbursementCharged")
	private Double feeChargesAtDisbursementCharged;
	@JsonProperty("loanProductCounter")
	private Long loanProductCounter;
	@JsonProperty("multiDisburseLoan")
	private Boolean multiDisburseLoan;
	@JsonProperty("canDefineInstallmentAmount")
	private Boolean canDefineInstallmentAmount;
	@JsonProperty("canDisburse")
	private Boolean canDisburse;
	@JsonProperty("emiAmountVariations")
	private List<Object> emiAmountVariations = new ArrayList<Object>();
	@JsonProperty("inArrears")
	private Boolean inArrears;
	@JsonProperty("isNPA")
	private Boolean isNPA;
	@JsonProperty("overdueCharges")
	private List<Object> overdueCharges = new ArrayList<Object>();
	@JsonProperty("daysInMonthType")
	private DaysInMonthType daysInMonthType;
	@JsonProperty("daysInYearType")
	private DaysInYearType daysInYearType;
	@JsonProperty("isInterestRecalculationEnabled")
	private Boolean isInterestRecalculationEnabled;
	@JsonProperty("createStandingInstructionAtDisbursement")
	private Boolean createStandingInstructionAtDisbursement;
	@JsonProperty("paidInAdvance")
	private PaidInAdvance paidInAdvance;
	@JsonProperty("isVariableInstallmentsAllowed")
	private Boolean isVariableInstallmentsAllowed;
	@JsonProperty("minimumGap")
	private Long minimumGap;
	@JsonProperty("maximumGap")
	private Long maximumGap;
}