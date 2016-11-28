
package com.omexit.paymentbridge.components.mifos.portfolio.loan;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "currency",
    "principalDisbursed",
    "principalPaid",
    "principalWrittenOff",
    "principalOutstanding",
    "principalOverdue",
    "interestCharged",
    "interestPaid",
    "interestWaived",
    "interestWrittenOff",
    "interestOutstanding",
    "interestOverdue",
    "feeChargesCharged",
    "feeChargesDueAtDisbursementCharged",
    "feeChargesPaid",
    "feeChargesWaived",
    "feeChargesWrittenOff",
    "feeChargesOutstanding",
    "feeChargesOverdue",
    "penaltyChargesCharged",
    "penaltyChargesPaid",
    "penaltyChargesWaived",
    "penaltyChargesWrittenOff",
    "penaltyChargesOutstanding",
    "penaltyChargesOverdue",
    "totalExpectedRepayment",
    "totalRepayment",
    "totalExpectedCostOfLoan",
    "totalCostOfLoan",
    "totalWaived",
    "totalWrittenOff",
    "totalOutstanding",
    "totalOverdue"
})
public class Summary {

    @JsonProperty("currency")
    private Currency_ currency;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The currency
     */
    @JsonProperty("currency")
    public Currency_ getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    @JsonProperty("currency")
    public void setCurrency(Currency_ currency) {
        this.currency = currency;
    }

    /**
     * 
     * @return
     *     The principalDisbursed
     */
    @JsonProperty("principalDisbursed")
    public Double getPrincipalDisbursed() {
        return principalDisbursed;
    }

    /**
     * 
     * @param principalDisbursed
     *     The principalDisbursed
     */
    @JsonProperty("principalDisbursed")
    public void setPrincipalDisbursed(Double principalDisbursed) {
        this.principalDisbursed = principalDisbursed;
    }

    /**
     * 
     * @return
     *     The principalPaid
     */
    @JsonProperty("principalPaid")
    public Double getPrincipalPaid() {
        return principalPaid;
    }

    /**
     * 
     * @param principalPaid
     *     The principalPaid
     */
    @JsonProperty("principalPaid")
    public void setPrincipalPaid(Double principalPaid) {
        this.principalPaid = principalPaid;
    }

    /**
     * 
     * @return
     *     The principalWrittenOff
     */
    @JsonProperty("principalWrittenOff")
    public Double getPrincipalWrittenOff() {
        return principalWrittenOff;
    }

    /**
     * 
     * @param principalWrittenOff
     *     The principalWrittenOff
     */
    @JsonProperty("principalWrittenOff")
    public void setPrincipalWrittenOff(Double principalWrittenOff) {
        this.principalWrittenOff = principalWrittenOff;
    }

    /**
     * 
     * @return
     *     The principalOutstanding
     */
    @JsonProperty("principalOutstanding")
    public Double getPrincipalOutstanding() {
        return principalOutstanding;
    }

    /**
     * 
     * @param principalOutstanding
     *     The principalOutstanding
     */
    @JsonProperty("principalOutstanding")
    public void setPrincipalOutstanding(Double principalOutstanding) {
        this.principalOutstanding = principalOutstanding;
    }

    /**
     * 
     * @return
     *     The principalOverdue
     */
    @JsonProperty("principalOverdue")
    public Long getPrincipalOverdue() {
        return principalOverdue;
    }

    /**
     * 
     * @param principalOverdue
     *     The principalOverdue
     */
    @JsonProperty("principalOverdue")
    public void setPrincipalOverdue(Long principalOverdue) {
        this.principalOverdue = principalOverdue;
    }

    /**
     * 
     * @return
     *     The interestCharged
     */
    @JsonProperty("interestCharged")
    public Double getInterestCharged() {
        return interestCharged;
    }

    /**
     * 
     * @param interestCharged
     *     The interestCharged
     */
    @JsonProperty("interestCharged")
    public void setInterestCharged(Double interestCharged) {
        this.interestCharged = interestCharged;
    }

    /**
     * 
     * @return
     *     The interestPaid
     */
    @JsonProperty("interestPaid")
    public Double getInterestPaid() {
        return interestPaid;
    }

    /**
     * 
     * @param interestPaid
     *     The interestPaid
     */
    @JsonProperty("interestPaid")
    public void setInterestPaid(Double interestPaid) {
        this.interestPaid = interestPaid;
    }

    /**
     * 
     * @return
     *     The interestWaived
     */
    @JsonProperty("interestWaived")
    public Double getInterestWaived() {
        return interestWaived;
    }

    /**
     * 
     * @param interestWaived
     *     The interestWaived
     */
    @JsonProperty("interestWaived")
    public void setInterestWaived(Double interestWaived) {
        this.interestWaived = interestWaived;
    }

    /**
     * 
     * @return
     *     The interestWrittenOff
     */
    @JsonProperty("interestWrittenOff")
    public Double getInterestWrittenOff() {
        return interestWrittenOff;
    }

    /**
     * 
     * @param interestWrittenOff
     *     The interestWrittenOff
     */
    @JsonProperty("interestWrittenOff")
    public void setInterestWrittenOff(Double interestWrittenOff) {
        this.interestWrittenOff = interestWrittenOff;
    }

    /**
     * 
     * @return
     *     The interestOutstanding
     */
    @JsonProperty("interestOutstanding")
    public Double getInterestOutstanding() {
        return interestOutstanding;
    }

    /**
     * 
     * @param interestOutstanding
     *     The interestOutstanding
     */
    @JsonProperty("interestOutstanding")
    public void setInterestOutstanding(Double interestOutstanding) {
        this.interestOutstanding = interestOutstanding;
    }

    /**
     * 
     * @return
     *     The interestOverdue
     */
    @JsonProperty("interestOverdue")
    public Long getInterestOverdue() {
        return interestOverdue;
    }

    /**
     * 
     * @param interestOverdue
     *     The interestOverdue
     */
    @JsonProperty("interestOverdue")
    public void setInterestOverdue(Long interestOverdue) {
        this.interestOverdue = interestOverdue;
    }

    /**
     * 
     * @return
     *     The feeChargesCharged
     */
    @JsonProperty("feeChargesCharged")
    public Double getFeeChargesCharged() {
        return feeChargesCharged;
    }

    /**
     * 
     * @param feeChargesCharged
     *     The feeChargesCharged
     */
    @JsonProperty("feeChargesCharged")
    public void setFeeChargesCharged(Double feeChargesCharged) {
        this.feeChargesCharged = feeChargesCharged;
    }

    /**
     * 
     * @return
     *     The feeChargesDueAtDisbursementCharged
     */
    @JsonProperty("feeChargesDueAtDisbursementCharged")
    public Double getFeeChargesDueAtDisbursementCharged() {
        return feeChargesDueAtDisbursementCharged;
    }

    /**
     * 
     * @param feeChargesDueAtDisbursementCharged
     *     The feeChargesDueAtDisbursementCharged
     */
    @JsonProperty("feeChargesDueAtDisbursementCharged")
    public void setFeeChargesDueAtDisbursementCharged(Double feeChargesDueAtDisbursementCharged) {
        this.feeChargesDueAtDisbursementCharged = feeChargesDueAtDisbursementCharged;
    }

    /**
     * 
     * @return
     *     The feeChargesPaid
     */
    @JsonProperty("feeChargesPaid")
    public Double getFeeChargesPaid() {
        return feeChargesPaid;
    }

    /**
     * 
     * @param feeChargesPaid
     *     The feeChargesPaid
     */
    @JsonProperty("feeChargesPaid")
    public void setFeeChargesPaid(Double feeChargesPaid) {
        this.feeChargesPaid = feeChargesPaid;
    }

    /**
     * 
     * @return
     *     The feeChargesWaived
     */
    @JsonProperty("feeChargesWaived")
    public Double getFeeChargesWaived() {
        return feeChargesWaived;
    }

    /**
     * 
     * @param feeChargesWaived
     *     The feeChargesWaived
     */
    @JsonProperty("feeChargesWaived")
    public void setFeeChargesWaived(Double feeChargesWaived) {
        this.feeChargesWaived = feeChargesWaived;
    }

    /**
     * 
     * @return
     *     The feeChargesWrittenOff
     */
    @JsonProperty("feeChargesWrittenOff")
    public Double getFeeChargesWrittenOff() {
        return feeChargesWrittenOff;
    }

    /**
     * 
     * @param feeChargesWrittenOff
     *     The feeChargesWrittenOff
     */
    @JsonProperty("feeChargesWrittenOff")
    public void setFeeChargesWrittenOff(Double feeChargesWrittenOff) {
        this.feeChargesWrittenOff = feeChargesWrittenOff;
    }

    /**
     * 
     * @return
     *     The feeChargesOutstanding
     */
    @JsonProperty("feeChargesOutstanding")
    public Double getFeeChargesOutstanding() {
        return feeChargesOutstanding;
    }

    /**
     * 
     * @param feeChargesOutstanding
     *     The feeChargesOutstanding
     */
    @JsonProperty("feeChargesOutstanding")
    public void setFeeChargesOutstanding(Double feeChargesOutstanding) {
        this.feeChargesOutstanding = feeChargesOutstanding;
    }

    /**
     * 
     * @return
     *     The feeChargesOverdue
     */
    @JsonProperty("feeChargesOverdue")
    public Long getFeeChargesOverdue() {
        return feeChargesOverdue;
    }

    /**
     * 
     * @param feeChargesOverdue
     *     The feeChargesOverdue
     */
    @JsonProperty("feeChargesOverdue")
    public void setFeeChargesOverdue(Long feeChargesOverdue) {
        this.feeChargesOverdue = feeChargesOverdue;
    }

    /**
     * 
     * @return
     *     The penaltyChargesCharged
     */
    @JsonProperty("penaltyChargesCharged")
    public Double getPenaltyChargesCharged() {
        return penaltyChargesCharged;
    }

    /**
     * 
     * @param penaltyChargesCharged
     *     The penaltyChargesCharged
     */
    @JsonProperty("penaltyChargesCharged")
    public void setPenaltyChargesCharged(Double penaltyChargesCharged) {
        this.penaltyChargesCharged = penaltyChargesCharged;
    }

    /**
     * 
     * @return
     *     The penaltyChargesPaid
     */
    @JsonProperty("penaltyChargesPaid")
    public Double getPenaltyChargesPaid() {
        return penaltyChargesPaid;
    }

    /**
     * 
     * @param penaltyChargesPaid
     *     The penaltyChargesPaid
     */
    @JsonProperty("penaltyChargesPaid")
    public void setPenaltyChargesPaid(Double penaltyChargesPaid) {
        this.penaltyChargesPaid = penaltyChargesPaid;
    }

    /**
     * 
     * @return
     *     The penaltyChargesWaived
     */
    @JsonProperty("penaltyChargesWaived")
    public Double getPenaltyChargesWaived() {
        return penaltyChargesWaived;
    }

    /**
     * 
     * @param penaltyChargesWaived
     *     The penaltyChargesWaived
     */
    @JsonProperty("penaltyChargesWaived")
    public void setPenaltyChargesWaived(Double penaltyChargesWaived) {
        this.penaltyChargesWaived = penaltyChargesWaived;
    }

    /**
     * 
     * @return
     *     The penaltyChargesWrittenOff
     */
    @JsonProperty("penaltyChargesWrittenOff")
    public Double getPenaltyChargesWrittenOff() {
        return penaltyChargesWrittenOff;
    }

    /**
     * 
     * @param penaltyChargesWrittenOff
     *     The penaltyChargesWrittenOff
     */
    @JsonProperty("penaltyChargesWrittenOff")
    public void setPenaltyChargesWrittenOff(Double penaltyChargesWrittenOff) {
        this.penaltyChargesWrittenOff = penaltyChargesWrittenOff;
    }

    /**
     * 
     * @return
     *     The penaltyChargesOutstanding
     */
    @JsonProperty("penaltyChargesOutstanding")
    public Double getPenaltyChargesOutstanding() {
        return penaltyChargesOutstanding;
    }

    /**
     * 
     * @param penaltyChargesOutstanding
     *     The penaltyChargesOutstanding
     */
    @JsonProperty("penaltyChargesOutstanding")
    public void setPenaltyChargesOutstanding(Double penaltyChargesOutstanding) {
        this.penaltyChargesOutstanding = penaltyChargesOutstanding;
    }

    /**
     * 
     * @return
     *     The penaltyChargesOverdue
     */
    @JsonProperty("penaltyChargesOverdue")
    public Long getPenaltyChargesOverdue() {
        return penaltyChargesOverdue;
    }

    /**
     * 
     * @param penaltyChargesOverdue
     *     The penaltyChargesOverdue
     */
    @JsonProperty("penaltyChargesOverdue")
    public void setPenaltyChargesOverdue(Long penaltyChargesOverdue) {
        this.penaltyChargesOverdue = penaltyChargesOverdue;
    }

    /**
     * 
     * @return
     *     The totalExpectedRepayment
     */
    @JsonProperty("totalExpectedRepayment")
    public Double getTotalExpectedRepayment() {
        return totalExpectedRepayment;
    }

    /**
     * 
     * @param totalExpectedRepayment
     *     The totalExpectedRepayment
     */
    @JsonProperty("totalExpectedRepayment")
    public void setTotalExpectedRepayment(Double totalExpectedRepayment) {
        this.totalExpectedRepayment = totalExpectedRepayment;
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
     *     The totalExpectedCostOfLoan
     */
    @JsonProperty("totalExpectedCostOfLoan")
    public Double getTotalExpectedCostOfLoan() {
        return totalExpectedCostOfLoan;
    }

    /**
     * 
     * @param totalExpectedCostOfLoan
     *     The totalExpectedCostOfLoan
     */
    @JsonProperty("totalExpectedCostOfLoan")
    public void setTotalExpectedCostOfLoan(Double totalExpectedCostOfLoan) {
        this.totalExpectedCostOfLoan = totalExpectedCostOfLoan;
    }

    /**
     * 
     * @return
     *     The totalCostOfLoan
     */
    @JsonProperty("totalCostOfLoan")
    public Double getTotalCostOfLoan() {
        return totalCostOfLoan;
    }

    /**
     * 
     * @param totalCostOfLoan
     *     The totalCostOfLoan
     */
    @JsonProperty("totalCostOfLoan")
    public void setTotalCostOfLoan(Double totalCostOfLoan) {
        this.totalCostOfLoan = totalCostOfLoan;
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
     *     The totalOverdue
     */
    @JsonProperty("totalOverdue")
    public Long getTotalOverdue() {
        return totalOverdue;
    }

    /**
     * 
     * @param totalOverdue
     *     The totalOverdue
     */
    @JsonProperty("totalOverdue")
    public void setTotalOverdue(Long totalOverdue) {
        this.totalOverdue = totalOverdue;
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
