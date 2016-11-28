
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
    "dueDate",
    "principalDisbursed",
    "principalLoanBalanceOutstanding",
    "feeChargesDue",
    "feeChargesPaid",
    "totalOriginalDueForPeriod",
    "totalDueForPeriod",
    "totalPaidForPeriod",
    "totalActualCostOfLoanForPeriod",
    "period",
    "fromDate",
    "complete",
    "daysInPeriod",
    "principalOriginalDue",
    "principalDue",
    "principalPaid",
    "principalWrittenOff",
    "principalOutstanding",
    "interestOriginalDue",
    "interestDue",
    "interestPaid",
    "interestWaived",
    "interestWrittenOff",
    "interestOutstanding",
    "feeChargesWaived",
    "feeChargesWrittenOff",
    "feeChargesOutstanding",
    "penaltyChargesDue",
    "penaltyChargesPaid",
    "penaltyChargesWaived",
    "penaltyChargesWrittenOff",
    "penaltyChargesOutstanding",
    "totalPaidInAdvanceForPeriod",
    "totalPaidLateForPeriod",
    "totalWaivedForPeriod",
    "totalWrittenOffForPeriod",
    "totalOutstandingForPeriod",
    "totalInstallmentAmountForPeriod"
})
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The dueDate
     */
    @JsonProperty("dueDate")
    public List<Long> getDueDate() {
        return dueDate;
    }

    /**
     * 
     * @param dueDate
     *     The dueDate
     */
    @JsonProperty("dueDate")
    public void setDueDate(List<Long> dueDate) {
        this.dueDate = dueDate;
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
     *     The principalLoanBalanceOutstanding
     */
    @JsonProperty("principalLoanBalanceOutstanding")
    public Double getPrincipalLoanBalanceOutstanding() {
        return principalLoanBalanceOutstanding;
    }

    /**
     * 
     * @param principalLoanBalanceOutstanding
     *     The principalLoanBalanceOutstanding
     */
    @JsonProperty("principalLoanBalanceOutstanding")
    public void setPrincipalLoanBalanceOutstanding(Double principalLoanBalanceOutstanding) {
        this.principalLoanBalanceOutstanding = principalLoanBalanceOutstanding;
    }

    /**
     * 
     * @return
     *     The feeChargesDue
     */
    @JsonProperty("feeChargesDue")
    public Long getFeeChargesDue() {
        return feeChargesDue;
    }

    /**
     * 
     * @param feeChargesDue
     *     The feeChargesDue
     */
    @JsonProperty("feeChargesDue")
    public void setFeeChargesDue(Long feeChargesDue) {
        this.feeChargesDue = feeChargesDue;
    }

    /**
     * 
     * @return
     *     The feeChargesPaid
     */
    @JsonProperty("feeChargesPaid")
    public Long getFeeChargesPaid() {
        return feeChargesPaid;
    }

    /**
     * 
     * @param feeChargesPaid
     *     The feeChargesPaid
     */
    @JsonProperty("feeChargesPaid")
    public void setFeeChargesPaid(Long feeChargesPaid) {
        this.feeChargesPaid = feeChargesPaid;
    }

    /**
     * 
     * @return
     *     The totalOriginalDueForPeriod
     */
    @JsonProperty("totalOriginalDueForPeriod")
    public Double getTotalOriginalDueForPeriod() {
        return totalOriginalDueForPeriod;
    }

    /**
     * 
     * @param totalOriginalDueForPeriod
     *     The totalOriginalDueForPeriod
     */
    @JsonProperty("totalOriginalDueForPeriod")
    public void setTotalOriginalDueForPeriod(Double totalOriginalDueForPeriod) {
        this.totalOriginalDueForPeriod = totalOriginalDueForPeriod;
    }

    /**
     * 
     * @return
     *     The totalDueForPeriod
     */
    @JsonProperty("totalDueForPeriod")
    public Double getTotalDueForPeriod() {
        return totalDueForPeriod;
    }

    /**
     * 
     * @param totalDueForPeriod
     *     The totalDueForPeriod
     */
    @JsonProperty("totalDueForPeriod")
    public void setTotalDueForPeriod(Double totalDueForPeriod) {
        this.totalDueForPeriod = totalDueForPeriod;
    }

    /**
     * 
     * @return
     *     The totalPaidForPeriod
     */
    @JsonProperty("totalPaidForPeriod")
    public Long getTotalPaidForPeriod() {
        return totalPaidForPeriod;
    }

    /**
     * 
     * @param totalPaidForPeriod
     *     The totalPaidForPeriod
     */
    @JsonProperty("totalPaidForPeriod")
    public void setTotalPaidForPeriod(Long totalPaidForPeriod) {
        this.totalPaidForPeriod = totalPaidForPeriod;
    }

    /**
     * 
     * @return
     *     The totalActualCostOfLoanForPeriod
     */
    @JsonProperty("totalActualCostOfLoanForPeriod")
    public Double getTotalActualCostOfLoanForPeriod() {
        return totalActualCostOfLoanForPeriod;
    }

    /**
     * 
     * @param totalActualCostOfLoanForPeriod
     *     The totalActualCostOfLoanForPeriod
     */
    @JsonProperty("totalActualCostOfLoanForPeriod")
    public void setTotalActualCostOfLoanForPeriod(Double totalActualCostOfLoanForPeriod) {
        this.totalActualCostOfLoanForPeriod = totalActualCostOfLoanForPeriod;
    }

    /**
     * 
     * @return
     *     The period
     */
    @JsonProperty("period")
    public Long getPeriod() {
        return period;
    }

    /**
     * 
     * @param period
     *     The period
     */
    @JsonProperty("period")
    public void setPeriod(Long period) {
        this.period = period;
    }

    /**
     * 
     * @return
     *     The fromDate
     */
    @JsonProperty("fromDate")
    public List<Long> getFromDate() {
        return fromDate;
    }

    /**
     * 
     * @param fromDate
     *     The fromDate
     */
    @JsonProperty("fromDate")
    public void setFromDate(List<Long> fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * 
     * @return
     *     The complete
     */
    @JsonProperty("complete")
    public Boolean getComplete() {
        return complete;
    }

    /**
     * 
     * @param complete
     *     The complete
     */
    @JsonProperty("complete")
    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    /**
     * 
     * @return
     *     The daysInPeriod
     */
    @JsonProperty("daysInPeriod")
    public Long getDaysInPeriod() {
        return daysInPeriod;
    }

    /**
     * 
     * @param daysInPeriod
     *     The daysInPeriod
     */
    @JsonProperty("daysInPeriod")
    public void setDaysInPeriod(Long daysInPeriod) {
        this.daysInPeriod = daysInPeriod;
    }

    /**
     * 
     * @return
     *     The principalOriginalDue
     */
    @JsonProperty("principalOriginalDue")
    public Double getPrincipalOriginalDue() {
        return principalOriginalDue;
    }

    /**
     * 
     * @param principalOriginalDue
     *     The principalOriginalDue
     */
    @JsonProperty("principalOriginalDue")
    public void setPrincipalOriginalDue(Double principalOriginalDue) {
        this.principalOriginalDue = principalOriginalDue;
    }

    /**
     * 
     * @return
     *     The principalDue
     */
    @JsonProperty("principalDue")
    public Double getPrincipalDue() {
        return principalDue;
    }

    /**
     * 
     * @param principalDue
     *     The principalDue
     */
    @JsonProperty("principalDue")
    public void setPrincipalDue(Double principalDue) {
        this.principalDue = principalDue;
    }

    /**
     * 
     * @return
     *     The principalPaid
     */
    @JsonProperty("principalPaid")
    public Long getPrincipalPaid() {
        return principalPaid;
    }

    /**
     * 
     * @param principalPaid
     *     The principalPaid
     */
    @JsonProperty("principalPaid")
    public void setPrincipalPaid(Long principalPaid) {
        this.principalPaid = principalPaid;
    }

    /**
     * 
     * @return
     *     The principalWrittenOff
     */
    @JsonProperty("principalWrittenOff")
    public Long getPrincipalWrittenOff() {
        return principalWrittenOff;
    }

    /**
     * 
     * @param principalWrittenOff
     *     The principalWrittenOff
     */
    @JsonProperty("principalWrittenOff")
    public void setPrincipalWrittenOff(Long principalWrittenOff) {
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
     *     The interestOriginalDue
     */
    @JsonProperty("interestOriginalDue")
    public Double getInterestOriginalDue() {
        return interestOriginalDue;
    }

    /**
     * 
     * @param interestOriginalDue
     *     The interestOriginalDue
     */
    @JsonProperty("interestOriginalDue")
    public void setInterestOriginalDue(Double interestOriginalDue) {
        this.interestOriginalDue = interestOriginalDue;
    }

    /**
     * 
     * @return
     *     The interestDue
     */
    @JsonProperty("interestDue")
    public Double getInterestDue() {
        return interestDue;
    }

    /**
     * 
     * @param interestDue
     *     The interestDue
     */
    @JsonProperty("interestDue")
    public void setInterestDue(Double interestDue) {
        this.interestDue = interestDue;
    }

    /**
     * 
     * @return
     *     The interestPaid
     */
    @JsonProperty("interestPaid")
    public Long getInterestPaid() {
        return interestPaid;
    }

    /**
     * 
     * @param interestPaid
     *     The interestPaid
     */
    @JsonProperty("interestPaid")
    public void setInterestPaid(Long interestPaid) {
        this.interestPaid = interestPaid;
    }

    /**
     * 
     * @return
     *     The interestWaived
     */
    @JsonProperty("interestWaived")
    public Long getInterestWaived() {
        return interestWaived;
    }

    /**
     * 
     * @param interestWaived
     *     The interestWaived
     */
    @JsonProperty("interestWaived")
    public void setInterestWaived(Long interestWaived) {
        this.interestWaived = interestWaived;
    }

    /**
     * 
     * @return
     *     The interestWrittenOff
     */
    @JsonProperty("interestWrittenOff")
    public Long getInterestWrittenOff() {
        return interestWrittenOff;
    }

    /**
     * 
     * @param interestWrittenOff
     *     The interestWrittenOff
     */
    @JsonProperty("interestWrittenOff")
    public void setInterestWrittenOff(Long interestWrittenOff) {
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
     *     The feeChargesWaived
     */
    @JsonProperty("feeChargesWaived")
    public Long getFeeChargesWaived() {
        return feeChargesWaived;
    }

    /**
     * 
     * @param feeChargesWaived
     *     The feeChargesWaived
     */
    @JsonProperty("feeChargesWaived")
    public void setFeeChargesWaived(Long feeChargesWaived) {
        this.feeChargesWaived = feeChargesWaived;
    }

    /**
     * 
     * @return
     *     The feeChargesWrittenOff
     */
    @JsonProperty("feeChargesWrittenOff")
    public Long getFeeChargesWrittenOff() {
        return feeChargesWrittenOff;
    }

    /**
     * 
     * @param feeChargesWrittenOff
     *     The feeChargesWrittenOff
     */
    @JsonProperty("feeChargesWrittenOff")
    public void setFeeChargesWrittenOff(Long feeChargesWrittenOff) {
        this.feeChargesWrittenOff = feeChargesWrittenOff;
    }

    /**
     * 
     * @return
     *     The feeChargesOutstanding
     */
    @JsonProperty("feeChargesOutstanding")
    public Long getFeeChargesOutstanding() {
        return feeChargesOutstanding;
    }

    /**
     * 
     * @param feeChargesOutstanding
     *     The feeChargesOutstanding
     */
    @JsonProperty("feeChargesOutstanding")
    public void setFeeChargesOutstanding(Long feeChargesOutstanding) {
        this.feeChargesOutstanding = feeChargesOutstanding;
    }

    /**
     * 
     * @return
     *     The penaltyChargesDue
     */
    @JsonProperty("penaltyChargesDue")
    public Long getPenaltyChargesDue() {
        return penaltyChargesDue;
    }

    /**
     * 
     * @param penaltyChargesDue
     *     The penaltyChargesDue
     */
    @JsonProperty("penaltyChargesDue")
    public void setPenaltyChargesDue(Long penaltyChargesDue) {
        this.penaltyChargesDue = penaltyChargesDue;
    }

    /**
     * 
     * @return
     *     The penaltyChargesPaid
     */
    @JsonProperty("penaltyChargesPaid")
    public Long getPenaltyChargesPaid() {
        return penaltyChargesPaid;
    }

    /**
     * 
     * @param penaltyChargesPaid
     *     The penaltyChargesPaid
     */
    @JsonProperty("penaltyChargesPaid")
    public void setPenaltyChargesPaid(Long penaltyChargesPaid) {
        this.penaltyChargesPaid = penaltyChargesPaid;
    }

    /**
     * 
     * @return
     *     The penaltyChargesWaived
     */
    @JsonProperty("penaltyChargesWaived")
    public Long getPenaltyChargesWaived() {
        return penaltyChargesWaived;
    }

    /**
     * 
     * @param penaltyChargesWaived
     *     The penaltyChargesWaived
     */
    @JsonProperty("penaltyChargesWaived")
    public void setPenaltyChargesWaived(Long penaltyChargesWaived) {
        this.penaltyChargesWaived = penaltyChargesWaived;
    }

    /**
     * 
     * @return
     *     The penaltyChargesWrittenOff
     */
    @JsonProperty("penaltyChargesWrittenOff")
    public Long getPenaltyChargesWrittenOff() {
        return penaltyChargesWrittenOff;
    }

    /**
     * 
     * @param penaltyChargesWrittenOff
     *     The penaltyChargesWrittenOff
     */
    @JsonProperty("penaltyChargesWrittenOff")
    public void setPenaltyChargesWrittenOff(Long penaltyChargesWrittenOff) {
        this.penaltyChargesWrittenOff = penaltyChargesWrittenOff;
    }

    /**
     * 
     * @return
     *     The penaltyChargesOutstanding
     */
    @JsonProperty("penaltyChargesOutstanding")
    public Long getPenaltyChargesOutstanding() {
        return penaltyChargesOutstanding;
    }

    /**
     * 
     * @param penaltyChargesOutstanding
     *     The penaltyChargesOutstanding
     */
    @JsonProperty("penaltyChargesOutstanding")
    public void setPenaltyChargesOutstanding(Long penaltyChargesOutstanding) {
        this.penaltyChargesOutstanding = penaltyChargesOutstanding;
    }

    /**
     * 
     * @return
     *     The totalPaidInAdvanceForPeriod
     */
    @JsonProperty("totalPaidInAdvanceForPeriod")
    public Long getTotalPaidInAdvanceForPeriod() {
        return totalPaidInAdvanceForPeriod;
    }

    /**
     * 
     * @param totalPaidInAdvanceForPeriod
     *     The totalPaidInAdvanceForPeriod
     */
    @JsonProperty("totalPaidInAdvanceForPeriod")
    public void setTotalPaidInAdvanceForPeriod(Long totalPaidInAdvanceForPeriod) {
        this.totalPaidInAdvanceForPeriod = totalPaidInAdvanceForPeriod;
    }

    /**
     * 
     * @return
     *     The totalPaidLateForPeriod
     */
    @JsonProperty("totalPaidLateForPeriod")
    public Long getTotalPaidLateForPeriod() {
        return totalPaidLateForPeriod;
    }

    /**
     * 
     * @param totalPaidLateForPeriod
     *     The totalPaidLateForPeriod
     */
    @JsonProperty("totalPaidLateForPeriod")
    public void setTotalPaidLateForPeriod(Long totalPaidLateForPeriod) {
        this.totalPaidLateForPeriod = totalPaidLateForPeriod;
    }

    /**
     * 
     * @return
     *     The totalWaivedForPeriod
     */
    @JsonProperty("totalWaivedForPeriod")
    public Long getTotalWaivedForPeriod() {
        return totalWaivedForPeriod;
    }

    /**
     * 
     * @param totalWaivedForPeriod
     *     The totalWaivedForPeriod
     */
    @JsonProperty("totalWaivedForPeriod")
    public void setTotalWaivedForPeriod(Long totalWaivedForPeriod) {
        this.totalWaivedForPeriod = totalWaivedForPeriod;
    }

    /**
     * 
     * @return
     *     The totalWrittenOffForPeriod
     */
    @JsonProperty("totalWrittenOffForPeriod")
    public Long getTotalWrittenOffForPeriod() {
        return totalWrittenOffForPeriod;
    }

    /**
     * 
     * @param totalWrittenOffForPeriod
     *     The totalWrittenOffForPeriod
     */
    @JsonProperty("totalWrittenOffForPeriod")
    public void setTotalWrittenOffForPeriod(Long totalWrittenOffForPeriod) {
        this.totalWrittenOffForPeriod = totalWrittenOffForPeriod;
    }

    /**
     * 
     * @return
     *     The totalOutstandingForPeriod
     */
    @JsonProperty("totalOutstandingForPeriod")
    public Double getTotalOutstandingForPeriod() {
        return totalOutstandingForPeriod;
    }

    /**
     * 
     * @param totalOutstandingForPeriod
     *     The totalOutstandingForPeriod
     */
    @JsonProperty("totalOutstandingForPeriod")
    public void setTotalOutstandingForPeriod(Double totalOutstandingForPeriod) {
        this.totalOutstandingForPeriod = totalOutstandingForPeriod;
    }

    /**
     * 
     * @return
     *     The totalInstallmentAmountForPeriod
     */
    @JsonProperty("totalInstallmentAmountForPeriod")
    public Double getTotalInstallmentAmountForPeriod() {
        return totalInstallmentAmountForPeriod;
    }

    /**
     * 
     * @param totalInstallmentAmountForPeriod
     *     The totalInstallmentAmountForPeriod
     */
    @JsonProperty("totalInstallmentAmountForPeriod")
    public void setTotalInstallmentAmountForPeriod(Double totalInstallmentAmountForPeriod) {
        this.totalInstallmentAmountForPeriod = totalInstallmentAmountForPeriod;
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
