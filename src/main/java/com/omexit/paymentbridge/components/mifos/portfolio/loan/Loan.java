
package com.omexit.paymentbridge.components.mifos.portfolio.loan;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "accountNo",
    "status",
    "clientId",
    "clientAccountNo",
    "clientName",
    "clientOfficeId",
    "loanProductId",
    "loanProductName",
    "isLoanProductLinkedToFloatingRate",
    "loanType",
    "currency",
    "principal",
    "approvedPrincipal",
    "proposedPrincipal",
    "termFrequency",
    "termPeriodFrequencyType",
    "numberOfRepayments",
    "repaymentEvery",
    "repaymentFrequencyType",
    "repaymentFrequencyDayOfWeekType",
    "interestRatePerPeriod",
    "interestRateFrequencyType",
    "annualInterestRate",
    "isFloatingInterestRate",
    "amortizationType",
    "interestType",
    "interestCalculationPeriodType",
    "allowPartialPeriodInterestCalcualtion",
    "transactionProcessingStrategyId",
    "transactionProcessingStrategyName",
    "syncDisbursementWithMeeting",
    "timeline",
    "summary",
    "repaymentSchedule",
    "transactions",
    "disbursementDetails",
    "feeChargesAtDisbursementCharged",
    "loanProductCounter",
    "multiDisburseLoan",
    "canDefineInstallmentAmount",
    "canDisburse",
    "emiAmountVariations",
    "inArrears",
    "isNPA",
    "overdueCharges",
    "daysInMonthType",
    "daysInYearType",
    "isInterestRecalculationEnabled",
    "createStandingInstructionAtDisbursement",
    "paidInAdvance",
    "isVariableInstallmentsAllowed",
    "minimumGap",
    "maximumGap"
})
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The accountNo
     */
    @JsonProperty("accountNo")
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * 
     * @param accountNo
     *     The accountNo
     */
    @JsonProperty("accountNo")
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The clientId
     */
    @JsonProperty("clientId")
    public Long getClientId() {
        return clientId;
    }

    /**
     * 
     * @param clientId
     *     The clientId
     */
    @JsonProperty("clientId")
    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    /**
     * 
     * @return
     *     The clientAccountNo
     */
    @JsonProperty("clientAccountNo")
    public String getClientAccountNo() {
        return clientAccountNo;
    }

    /**
     * 
     * @param clientAccountNo
     *     The clientAccountNo
     */
    @JsonProperty("clientAccountNo")
    public void setClientAccountNo(String clientAccountNo) {
        this.clientAccountNo = clientAccountNo;
    }

    /**
     * 
     * @return
     *     The clientName
     */
    @JsonProperty("clientName")
    public String getClientName() {
        return clientName;
    }

    /**
     * 
     * @param clientName
     *     The clientName
     */
    @JsonProperty("clientName")
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * 
     * @return
     *     The clientOfficeId
     */
    @JsonProperty("clientOfficeId")
    public Long getClientOfficeId() {
        return clientOfficeId;
    }

    /**
     * 
     * @param clientOfficeId
     *     The clientOfficeId
     */
    @JsonProperty("clientOfficeId")
    public void setClientOfficeId(Long clientOfficeId) {
        this.clientOfficeId = clientOfficeId;
    }

    /**
     * 
     * @return
     *     The loanProductId
     */
    @JsonProperty("loanProductId")
    public Long getLoanProductId() {
        return loanProductId;
    }

    /**
     * 
     * @param loanProductId
     *     The loanProductId
     */
    @JsonProperty("loanProductId")
    public void setLoanProductId(Long loanProductId) {
        this.loanProductId = loanProductId;
    }

    /**
     * 
     * @return
     *     The loanProductName
     */
    @JsonProperty("loanProductName")
    public String getLoanProductName() {
        return loanProductName;
    }

    /**
     * 
     * @param loanProductName
     *     The loanProductName
     */
    @JsonProperty("loanProductName")
    public void setLoanProductName(String loanProductName) {
        this.loanProductName = loanProductName;
    }

    /**
     * 
     * @return
     *     The isLoanProductLinkedToFloatingRate
     */
    @JsonProperty("isLoanProductLinkedToFloatingRate")
    public Boolean getIsLoanProductLinkedToFloatingRate() {
        return isLoanProductLinkedToFloatingRate;
    }

    /**
     * 
     * @param isLoanProductLinkedToFloatingRate
     *     The isLoanProductLinkedToFloatingRate
     */
    @JsonProperty("isLoanProductLinkedToFloatingRate")
    public void setIsLoanProductLinkedToFloatingRate(Boolean isLoanProductLinkedToFloatingRate) {
        this.isLoanProductLinkedToFloatingRate = isLoanProductLinkedToFloatingRate;
    }

    /**
     * 
     * @return
     *     The loanType
     */
    @JsonProperty("loanType")
    public LoanType getLoanType() {
        return loanType;
    }

    /**
     * 
     * @param loanType
     *     The loanType
     */
    @JsonProperty("loanType")
    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    /**
     * 
     * @return
     *     The currency
     */
    @JsonProperty("currency")
    public Currency getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    @JsonProperty("currency")
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    /**
     * 
     * @return
     *     The principal
     */
    @JsonProperty("principal")
    public Double getPrincipal() {
        return principal;
    }

    /**
     * 
     * @param principal
     *     The principal
     */
    @JsonProperty("principal")
    public void setPrincipal(Double principal) {
        this.principal = principal;
    }

    /**
     * 
     * @return
     *     The approvedPrincipal
     */
    @JsonProperty("approvedPrincipal")
    public Double getApprovedPrincipal() {
        return approvedPrincipal;
    }

    /**
     * 
     * @param approvedPrincipal
     *     The approvedPrincipal
     */
    @JsonProperty("approvedPrincipal")
    public void setApprovedPrincipal(Double approvedPrincipal) {
        this.approvedPrincipal = approvedPrincipal;
    }

    /**
     * 
     * @return
     *     The proposedPrincipal
     */
    @JsonProperty("proposedPrincipal")
    public Double getProposedPrincipal() {
        return proposedPrincipal;
    }

    /**
     * 
     * @param proposedPrincipal
     *     The proposedPrincipal
     */
    @JsonProperty("proposedPrincipal")
    public void setProposedPrincipal(Double proposedPrincipal) {
        this.proposedPrincipal = proposedPrincipal;
    }

    /**
     * 
     * @return
     *     The termFrequency
     */
    @JsonProperty("termFrequency")
    public Long getTermFrequency() {
        return termFrequency;
    }

    /**
     * 
     * @param termFrequency
     *     The termFrequency
     */
    @JsonProperty("termFrequency")
    public void setTermFrequency(Long termFrequency) {
        this.termFrequency = termFrequency;
    }

    /**
     * 
     * @return
     *     The termPeriodFrequencyType
     */
    @JsonProperty("termPeriodFrequencyType")
    public TermPeriodFrequencyType getTermPeriodFrequencyType() {
        return termPeriodFrequencyType;
    }

    /**
     * 
     * @param termPeriodFrequencyType
     *     The termPeriodFrequencyType
     */
    @JsonProperty("termPeriodFrequencyType")
    public void setTermPeriodFrequencyType(TermPeriodFrequencyType termPeriodFrequencyType) {
        this.termPeriodFrequencyType = termPeriodFrequencyType;
    }

    /**
     * 
     * @return
     *     The numberOfRepayments
     */
    @JsonProperty("numberOfRepayments")
    public Long getNumberOfRepayments() {
        return numberOfRepayments;
    }

    /**
     * 
     * @param numberOfRepayments
     *     The numberOfRepayments
     */
    @JsonProperty("numberOfRepayments")
    public void setNumberOfRepayments(Long numberOfRepayments) {
        this.numberOfRepayments = numberOfRepayments;
    }

    /**
     * 
     * @return
     *     The repaymentEvery
     */
    @JsonProperty("repaymentEvery")
    public Long getRepaymentEvery() {
        return repaymentEvery;
    }

    /**
     * 
     * @param repaymentEvery
     *     The repaymentEvery
     */
    @JsonProperty("repaymentEvery")
    public void setRepaymentEvery(Long repaymentEvery) {
        this.repaymentEvery = repaymentEvery;
    }

    /**
     * 
     * @return
     *     The repaymentFrequencyType
     */
    @JsonProperty("repaymentFrequencyType")
    public RepaymentFrequencyType getRepaymentFrequencyType() {
        return repaymentFrequencyType;
    }

    /**
     * 
     * @param repaymentFrequencyType
     *     The repaymentFrequencyType
     */
    @JsonProperty("repaymentFrequencyType")
    public void setRepaymentFrequencyType(RepaymentFrequencyType repaymentFrequencyType) {
        this.repaymentFrequencyType = repaymentFrequencyType;
    }

    /**
     * 
     * @return
     *     The repaymentFrequencyDayOfWeekType
     */
    @JsonProperty("repaymentFrequencyDayOfWeekType")
    public RepaymentFrequencyDayOfWeekType getRepaymentFrequencyDayOfWeekType() {
        return repaymentFrequencyDayOfWeekType;
    }

    /**
     * 
     * @param repaymentFrequencyDayOfWeekType
     *     The repaymentFrequencyDayOfWeekType
     */
    @JsonProperty("repaymentFrequencyDayOfWeekType")
    public void setRepaymentFrequencyDayOfWeekType(RepaymentFrequencyDayOfWeekType repaymentFrequencyDayOfWeekType) {
        this.repaymentFrequencyDayOfWeekType = repaymentFrequencyDayOfWeekType;
    }

    /**
     * 
     * @return
     *     The interestRatePerPeriod
     */
    @JsonProperty("interestRatePerPeriod")
    public Double getInterestRatePerPeriod() {
        return interestRatePerPeriod;
    }

    /**
     * 
     * @param interestRatePerPeriod
     *     The interestRatePerPeriod
     */
    @JsonProperty("interestRatePerPeriod")
    public void setInterestRatePerPeriod(Double interestRatePerPeriod) {
        this.interestRatePerPeriod = interestRatePerPeriod;
    }

    /**
     * 
     * @return
     *     The interestRateFrequencyType
     */
    @JsonProperty("interestRateFrequencyType")
    public InterestRateFrequencyType getInterestRateFrequencyType() {
        return interestRateFrequencyType;
    }

    /**
     * 
     * @param interestRateFrequencyType
     *     The interestRateFrequencyType
     */
    @JsonProperty("interestRateFrequencyType")
    public void setInterestRateFrequencyType(InterestRateFrequencyType interestRateFrequencyType) {
        this.interestRateFrequencyType = interestRateFrequencyType;
    }

    /**
     * 
     * @return
     *     The annualInterestRate
     */
    @JsonProperty("annualInterestRate")
    public Double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * 
     * @param annualInterestRate
     *     The annualInterestRate
     */
    @JsonProperty("annualInterestRate")
    public void setAnnualInterestRate(Double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * 
     * @return
     *     The isFloatingInterestRate
     */
    @JsonProperty("isFloatingInterestRate")
    public Boolean getIsFloatingInterestRate() {
        return isFloatingInterestRate;
    }

    /**
     * 
     * @param isFloatingInterestRate
     *     The isFloatingInterestRate
     */
    @JsonProperty("isFloatingInterestRate")
    public void setIsFloatingInterestRate(Boolean isFloatingInterestRate) {
        this.isFloatingInterestRate = isFloatingInterestRate;
    }

    /**
     * 
     * @return
     *     The amortizationType
     */
    @JsonProperty("amortizationType")
    public AmortizationType getAmortizationType() {
        return amortizationType;
    }

    /**
     * 
     * @param amortizationType
     *     The amortizationType
     */
    @JsonProperty("amortizationType")
    public void setAmortizationType(AmortizationType amortizationType) {
        this.amortizationType = amortizationType;
    }

    /**
     * 
     * @return
     *     The interestType
     */
    @JsonProperty("interestType")
    public InterestType getInterestType() {
        return interestType;
    }

    /**
     * 
     * @param interestType
     *     The interestType
     */
    @JsonProperty("interestType")
    public void setInterestType(InterestType interestType) {
        this.interestType = interestType;
    }

    /**
     * 
     * @return
     *     The interestCalculationPeriodType
     */
    @JsonProperty("interestCalculationPeriodType")
    public InterestCalculationPeriodType getInterestCalculationPeriodType() {
        return interestCalculationPeriodType;
    }

    /**
     * 
     * @param interestCalculationPeriodType
     *     The interestCalculationPeriodType
     */
    @JsonProperty("interestCalculationPeriodType")
    public void setInterestCalculationPeriodType(InterestCalculationPeriodType interestCalculationPeriodType) {
        this.interestCalculationPeriodType = interestCalculationPeriodType;
    }

    /**
     * 
     * @return
     *     The allowPartialPeriodInterestCalcualtion
     */
    @JsonProperty("allowPartialPeriodInterestCalcualtion")
    public Boolean getAllowPartialPeriodInterestCalcualtion() {
        return allowPartialPeriodInterestCalcualtion;
    }

    /**
     * 
     * @param allowPartialPeriodInterestCalcualtion
     *     The allowPartialPeriodInterestCalcualtion
     */
    @JsonProperty("allowPartialPeriodInterestCalcualtion")
    public void setAllowPartialPeriodInterestCalcualtion(Boolean allowPartialPeriodInterestCalcualtion) {
        this.allowPartialPeriodInterestCalcualtion = allowPartialPeriodInterestCalcualtion;
    }

    /**
     * 
     * @return
     *     The transactionProcessingStrategyId
     */
    @JsonProperty("transactionProcessingStrategyId")
    public Long getTransactionProcessingStrategyId() {
        return transactionProcessingStrategyId;
    }

    /**
     * 
     * @param transactionProcessingStrategyId
     *     The transactionProcessingStrategyId
     */
    @JsonProperty("transactionProcessingStrategyId")
    public void setTransactionProcessingStrategyId(Long transactionProcessingStrategyId) {
        this.transactionProcessingStrategyId = transactionProcessingStrategyId;
    }

    /**
     * 
     * @return
     *     The transactionProcessingStrategyName
     */
    @JsonProperty("transactionProcessingStrategyName")
    public String getTransactionProcessingStrategyName() {
        return transactionProcessingStrategyName;
    }

    /**
     * 
     * @param transactionProcessingStrategyName
     *     The transactionProcessingStrategyName
     */
    @JsonProperty("transactionProcessingStrategyName")
    public void setTransactionProcessingStrategyName(String transactionProcessingStrategyName) {
        this.transactionProcessingStrategyName = transactionProcessingStrategyName;
    }

    /**
     * 
     * @return
     *     The syncDisbursementWithMeeting
     */
    @JsonProperty("syncDisbursementWithMeeting")
    public Boolean getSyncDisbursementWithMeeting() {
        return syncDisbursementWithMeeting;
    }

    /**
     * 
     * @param syncDisbursementWithMeeting
     *     The syncDisbursementWithMeeting
     */
    @JsonProperty("syncDisbursementWithMeeting")
    public void setSyncDisbursementWithMeeting(Boolean syncDisbursementWithMeeting) {
        this.syncDisbursementWithMeeting = syncDisbursementWithMeeting;
    }

    /**
     * 
     * @return
     *     The timeline
     */
    @JsonProperty("timeline")
    public Timeline getTimeline() {
        return timeline;
    }

    /**
     * 
     * @param timeline
     *     The timeline
     */
    @JsonProperty("timeline")
    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    /**
     * 
     * @return
     *     The summary
     */
    @JsonProperty("summary")
    public Summary getSummary() {
        return summary;
    }

    /**
     * 
     * @param summary
     *     The summary
     */
    @JsonProperty("summary")
    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    /**
     * 
     * @return
     *     The repaymentSchedule
     */
    @JsonProperty("repaymentSchedule")
    public RepaymentSchedule getRepaymentSchedule() {
        return repaymentSchedule;
    }

    /**
     * 
     * @param repaymentSchedule
     *     The repaymentSchedule
     */
    @JsonProperty("repaymentSchedule")
    public void setRepaymentSchedule(RepaymentSchedule repaymentSchedule) {
        this.repaymentSchedule = repaymentSchedule;
    }

    /**
     * 
     * @return
     *     The transactions
     */
    @JsonProperty("transactions")
    public List<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * 
     * @param transactions
     *     The transactions
     */
    @JsonProperty("transactions")
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    /**
     * 
     * @return
     *     The disbursementDetails
     */
    @JsonProperty("disbursementDetails")
    public List<Object> getDisbursementDetails() {
        return disbursementDetails;
    }

    /**
     * 
     * @param disbursementDetails
     *     The disbursementDetails
     */
    @JsonProperty("disbursementDetails")
    public void setDisbursementDetails(List<Object> disbursementDetails) {
        this.disbursementDetails = disbursementDetails;
    }

    /**
     * 
     * @return
     *     The feeChargesAtDisbursementCharged
     */
    @JsonProperty("feeChargesAtDisbursementCharged")
    public Double getFeeChargesAtDisbursementCharged() {
        return feeChargesAtDisbursementCharged;
    }

    /**
     * 
     * @param feeChargesAtDisbursementCharged
     *     The feeChargesAtDisbursementCharged
     */
    @JsonProperty("feeChargesAtDisbursementCharged")
    public void setFeeChargesAtDisbursementCharged(Double feeChargesAtDisbursementCharged) {
        this.feeChargesAtDisbursementCharged = feeChargesAtDisbursementCharged;
    }

    /**
     * 
     * @return
     *     The loanProductCounter
     */
    @JsonProperty("loanProductCounter")
    public Long getLoanProductCounter() {
        return loanProductCounter;
    }

    /**
     * 
     * @param loanProductCounter
     *     The loanProductCounter
     */
    @JsonProperty("loanProductCounter")
    public void setLoanProductCounter(Long loanProductCounter) {
        this.loanProductCounter = loanProductCounter;
    }

    /**
     * 
     * @return
     *     The multiDisburseLoan
     */
    @JsonProperty("multiDisburseLoan")
    public Boolean getMultiDisburseLoan() {
        return multiDisburseLoan;
    }

    /**
     * 
     * @param multiDisburseLoan
     *     The multiDisburseLoan
     */
    @JsonProperty("multiDisburseLoan")
    public void setMultiDisburseLoan(Boolean multiDisburseLoan) {
        this.multiDisburseLoan = multiDisburseLoan;
    }

    /**
     * 
     * @return
     *     The canDefineInstallmentAmount
     */
    @JsonProperty("canDefineInstallmentAmount")
    public Boolean getCanDefineInstallmentAmount() {
        return canDefineInstallmentAmount;
    }

    /**
     * 
     * @param canDefineInstallmentAmount
     *     The canDefineInstallmentAmount
     */
    @JsonProperty("canDefineInstallmentAmount")
    public void setCanDefineInstallmentAmount(Boolean canDefineInstallmentAmount) {
        this.canDefineInstallmentAmount = canDefineInstallmentAmount;
    }

    /**
     * 
     * @return
     *     The canDisburse
     */
    @JsonProperty("canDisburse")
    public Boolean getCanDisburse() {
        return canDisburse;
    }

    /**
     * 
     * @param canDisburse
     *     The canDisburse
     */
    @JsonProperty("canDisburse")
    public void setCanDisburse(Boolean canDisburse) {
        this.canDisburse = canDisburse;
    }

    /**
     * 
     * @return
     *     The emiAmountVariations
     */
    @JsonProperty("emiAmountVariations")
    public List<Object> getEmiAmountVariations() {
        return emiAmountVariations;
    }

    /**
     * 
     * @param emiAmountVariations
     *     The emiAmountVariations
     */
    @JsonProperty("emiAmountVariations")
    public void setEmiAmountVariations(List<Object> emiAmountVariations) {
        this.emiAmountVariations = emiAmountVariations;
    }

    /**
     * 
     * @return
     *     The inArrears
     */
    @JsonProperty("inArrears")
    public Boolean getInArrears() {
        return inArrears;
    }

    /**
     * 
     * @param inArrears
     *     The inArrears
     */
    @JsonProperty("inArrears")
    public void setInArrears(Boolean inArrears) {
        this.inArrears = inArrears;
    }

    /**
     * 
     * @return
     *     The isNPA
     */
    @JsonProperty("isNPA")
    public Boolean getIsNPA() {
        return isNPA;
    }

    /**
     * 
     * @param isNPA
     *     The isNPA
     */
    @JsonProperty("isNPA")
    public void setIsNPA(Boolean isNPA) {
        this.isNPA = isNPA;
    }

    /**
     * 
     * @return
     *     The overdueCharges
     */
    @JsonProperty("overdueCharges")
    public List<Object> getOverdueCharges() {
        return overdueCharges;
    }

    /**
     * 
     * @param overdueCharges
     *     The overdueCharges
     */
    @JsonProperty("overdueCharges")
    public void setOverdueCharges(List<Object> overdueCharges) {
        this.overdueCharges = overdueCharges;
    }

    /**
     * 
     * @return
     *     The daysInMonthType
     */
    @JsonProperty("daysInMonthType")
    public DaysInMonthType getDaysInMonthType() {
        return daysInMonthType;
    }

    /**
     * 
     * @param daysInMonthType
     *     The daysInMonthType
     */
    @JsonProperty("daysInMonthType")
    public void setDaysInMonthType(DaysInMonthType daysInMonthType) {
        this.daysInMonthType = daysInMonthType;
    }

    /**
     * 
     * @return
     *     The daysInYearType
     */
    @JsonProperty("daysInYearType")
    public DaysInYearType getDaysInYearType() {
        return daysInYearType;
    }

    /**
     * 
     * @param daysInYearType
     *     The daysInYearType
     */
    @JsonProperty("daysInYearType")
    public void setDaysInYearType(DaysInYearType daysInYearType) {
        this.daysInYearType = daysInYearType;
    }

    /**
     * 
     * @return
     *     The isInterestRecalculationEnabled
     */
    @JsonProperty("isInterestRecalculationEnabled")
    public Boolean getIsInterestRecalculationEnabled() {
        return isInterestRecalculationEnabled;
    }

    /**
     * 
     * @param isInterestRecalculationEnabled
     *     The isInterestRecalculationEnabled
     */
    @JsonProperty("isInterestRecalculationEnabled")
    public void setIsInterestRecalculationEnabled(Boolean isInterestRecalculationEnabled) {
        this.isInterestRecalculationEnabled = isInterestRecalculationEnabled;
    }

    /**
     * 
     * @return
     *     The createStandingInstructionAtDisbursement
     */
    @JsonProperty("createStandingInstructionAtDisbursement")
    public Boolean getCreateStandingInstructionAtDisbursement() {
        return createStandingInstructionAtDisbursement;
    }

    /**
     * 
     * @param createStandingInstructionAtDisbursement
     *     The createStandingInstructionAtDisbursement
     */
    @JsonProperty("createStandingInstructionAtDisbursement")
    public void setCreateStandingInstructionAtDisbursement(Boolean createStandingInstructionAtDisbursement) {
        this.createStandingInstructionAtDisbursement = createStandingInstructionAtDisbursement;
    }

    /**
     * 
     * @return
     *     The paidInAdvance
     */
    @JsonProperty("paidInAdvance")
    public PaidInAdvance getPaidInAdvance() {
        return paidInAdvance;
    }

    /**
     * 
     * @param paidInAdvance
     *     The paidInAdvance
     */
    @JsonProperty("paidInAdvance")
    public void setPaidInAdvance(PaidInAdvance paidInAdvance) {
        this.paidInAdvance = paidInAdvance;
    }

    /**
     * 
     * @return
     *     The isVariableInstallmentsAllowed
     */
    @JsonProperty("isVariableInstallmentsAllowed")
    public Boolean getIsVariableInstallmentsAllowed() {
        return isVariableInstallmentsAllowed;
    }

    /**
     * 
     * @param isVariableInstallmentsAllowed
     *     The isVariableInstallmentsAllowed
     */
    @JsonProperty("isVariableInstallmentsAllowed")
    public void setIsVariableInstallmentsAllowed(Boolean isVariableInstallmentsAllowed) {
        this.isVariableInstallmentsAllowed = isVariableInstallmentsAllowed;
    }

    /**
     * 
     * @return
     *     The minimumGap
     */
    @JsonProperty("minimumGap")
    public Long getMinimumGap() {
        return minimumGap;
    }

    /**
     * 
     * @param minimumGap
     *     The minimumGap
     */
    @JsonProperty("minimumGap")
    public void setMinimumGap(Long minimumGap) {
        this.minimumGap = minimumGap;
    }

    /**
     * 
     * @return
     *     The maximumGap
     */
    @JsonProperty("maximumGap")
    public Long getMaximumGap() {
        return maximumGap;
    }

    /**
     * 
     * @param maximumGap
     *     The maximumGap
     */
    @JsonProperty("maximumGap")
    public void setMaximumGap(Long maximumGap) {
        this.maximumGap = maximumGap;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
