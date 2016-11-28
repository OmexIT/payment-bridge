
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
    "currency",
    "loanTermInDays",
    "totalPrincipalDisbursed",
    "totalPrincipalExpected",
    "totalPrincipalPaid",
    "totalInterestCharged",
    "totalFeeChargesCharged",
    "totalPenaltyChargesCharged",
    "totalWaived",
    "totalWrittenOff",
    "totalRepaymentExpected",
    "totalRepayment",
    "totalPaidInAdvance",
    "totalPaidLate",
    "totalOutstanding",
    "periods"
})
public class RepaymentSchedule {

    @JsonProperty("currency")
    private Currency__ currency;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The currency
     */
    @JsonProperty("currency")
    public Currency__ getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    @JsonProperty("currency")
    public void setCurrency(Currency__ currency) {
        this.currency = currency;
    }

    /**
     * 
     * @return
     *     The loanTermInDays
     */
    @JsonProperty("loanTermInDays")
    public Long getLoanTermInDays() {
        return loanTermInDays;
    }

    /**
     * 
     * @param loanTermInDays
     *     The loanTermInDays
     */
    @JsonProperty("loanTermInDays")
    public void setLoanTermInDays(Long loanTermInDays) {
        this.loanTermInDays = loanTermInDays;
    }

    /**
     * 
     * @return
     *     The totalPrincipalDisbursed
     */
    @JsonProperty("totalPrincipalDisbursed")
    public Double getTotalPrincipalDisbursed() {
        return totalPrincipalDisbursed;
    }

    /**
     * 
     * @param totalPrincipalDisbursed
     *     The totalPrincipalDisbursed
     */
    @JsonProperty("totalPrincipalDisbursed")
    public void setTotalPrincipalDisbursed(Double totalPrincipalDisbursed) {
        this.totalPrincipalDisbursed = totalPrincipalDisbursed;
    }

    /**
     * 
     * @return
     *     The totalPrincipalExpected
     */
    @JsonProperty("totalPrincipalExpected")
    public Double getTotalPrincipalExpected() {
        return totalPrincipalExpected;
    }

    /**
     * 
     * @param totalPrincipalExpected
     *     The totalPrincipalExpected
     */
    @JsonProperty("totalPrincipalExpected")
    public void setTotalPrincipalExpected(Double totalPrincipalExpected) {
        this.totalPrincipalExpected = totalPrincipalExpected;
    }

    /**
     * 
     * @return
     *     The totalPrincipalPaid
     */
    @JsonProperty("totalPrincipalPaid")
    public Double getTotalPrincipalPaid() {
        return totalPrincipalPaid;
    }

    /**
     * 
     * @param totalPrincipalPaid
     *     The totalPrincipalPaid
     */
    @JsonProperty("totalPrincipalPaid")
    public void setTotalPrincipalPaid(Double totalPrincipalPaid) {
        this.totalPrincipalPaid = totalPrincipalPaid;
    }

    /**
     * 
     * @return
     *     The totalInterestCharged
     */
    @JsonProperty("totalInterestCharged")
    public Double getTotalInterestCharged() {
        return totalInterestCharged;
    }

    /**
     * 
     * @param totalInterestCharged
     *     The totalInterestCharged
     */
    @JsonProperty("totalInterestCharged")
    public void setTotalInterestCharged(Double totalInterestCharged) {
        this.totalInterestCharged = totalInterestCharged;
    }

    /**
     * 
     * @return
     *     The totalFeeChargesCharged
     */
    @JsonProperty("totalFeeChargesCharged")
    public Double getTotalFeeChargesCharged() {
        return totalFeeChargesCharged;
    }

    /**
     * 
     * @param totalFeeChargesCharged
     *     The totalFeeChargesCharged
     */
    @JsonProperty("totalFeeChargesCharged")
    public void setTotalFeeChargesCharged(Double totalFeeChargesCharged) {
        this.totalFeeChargesCharged = totalFeeChargesCharged;
    }

    /**
     * 
     * @return
     *     The totalPenaltyChargesCharged
     */
    @JsonProperty("totalPenaltyChargesCharged")
    public Double getTotalPenaltyChargesCharged() {
        return totalPenaltyChargesCharged;
    }

    /**
     * 
     * @param totalPenaltyChargesCharged
     *     The totalPenaltyChargesCharged
     */
    @JsonProperty("totalPenaltyChargesCharged")
    public void setTotalPenaltyChargesCharged(Double totalPenaltyChargesCharged) {
        this.totalPenaltyChargesCharged = totalPenaltyChargesCharged;
    }

    /**
     * 
     * @return
     *     The totalWaived
     */
    @JsonProperty("totalWaived")
    public Double getTotalWaived() {
        return totalWaived;
    }

    /**
     * 
     * @param totalWaived
     *     The totalWaived
     */
    @JsonProperty("totalWaived")
    public void setTotalWaived(Double totalWaived) {
        this.totalWaived = totalWaived;
    }

    /**
     * 
     * @return
     *     The totalWrittenOff
     */
    @JsonProperty("totalWrittenOff")
    public Double getTotalWrittenOff() {
        return totalWrittenOff;
    }

    /**
     * 
     * @param totalWrittenOff
     *     The totalWrittenOff
     */
    @JsonProperty("totalWrittenOff")
    public void setTotalWrittenOff(Double totalWrittenOff) {
        this.totalWrittenOff = totalWrittenOff;
    }

    /**
     * 
     * @return
     *     The totalRepaymentExpected
     */
    @JsonProperty("totalRepaymentExpected")
    public Double getTotalRepaymentExpected() {
        return totalRepaymentExpected;
    }

    /**
     * 
     * @param totalRepaymentExpected
     *     The totalRepaymentExpected
     */
    @JsonProperty("totalRepaymentExpected")
    public void setTotalRepaymentExpected(Double totalRepaymentExpected) {
        this.totalRepaymentExpected = totalRepaymentExpected;
    }

    /**
     * 
     * @return
     *     The totalRepayment
     */
    @JsonProperty("totalRepayment")
    public Double getTotalRepayment() {
        return totalRepayment;
    }

    /**
     * 
     * @param totalRepayment
     *     The totalRepayment
     */
    @JsonProperty("totalRepayment")
    public void setTotalRepayment(Double totalRepayment) {
        this.totalRepayment = totalRepayment;
    }

    /**
     * 
     * @return
     *     The totalPaidInAdvance
     */
    @JsonProperty("totalPaidInAdvance")
    public Double getTotalPaidInAdvance() {
        return totalPaidInAdvance;
    }

    /**
     * 
     * @param totalPaidInAdvance
     *     The totalPaidInAdvance
     */
    @JsonProperty("totalPaidInAdvance")
    public void setTotalPaidInAdvance(Double totalPaidInAdvance) {
        this.totalPaidInAdvance = totalPaidInAdvance;
    }

    /**
     * 
     * @return
     *     The totalPaidLate
     */
    @JsonProperty("totalPaidLate")
    public Double getTotalPaidLate() {
        return totalPaidLate;
    }

    /**
     * 
     * @param totalPaidLate
     *     The totalPaidLate
     */
    @JsonProperty("totalPaidLate")
    public void setTotalPaidLate(Double totalPaidLate) {
        this.totalPaidLate = totalPaidLate;
    }

    /**
     * 
     * @return
     *     The totalOutstanding
     */
    @JsonProperty("totalOutstanding")
    public Double getTotalOutstanding() {
        return totalOutstanding;
    }

    /**
     * 
     * @param totalOutstanding
     *     The totalOutstanding
     */
    @JsonProperty("totalOutstanding")
    public void setTotalOutstanding(Double totalOutstanding) {
        this.totalOutstanding = totalOutstanding;
    }

    /**
     * 
     * @return
     *     The periods
     */
    @JsonProperty("periods")
    public List<Period> getPeriods() {
        return periods;
    }

    /**
     * 
     * @param periods
     *     The periods
     */
    @JsonProperty("periods")
    public void setPeriods(List<Period> periods) {
        this.periods = periods;
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
