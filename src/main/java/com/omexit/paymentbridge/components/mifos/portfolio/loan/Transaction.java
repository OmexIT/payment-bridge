
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
    "officeId",
    "officeName",
    "type",
    "date",
    "currency",
    "paymentDetailData",
    "amount",
    "principalPortion",
    "interestPortion",
    "feeChargesPortion",
    "penaltyChargesPortion",
    "overpaymentPortion",
    "unrecognizedIncomePortion",
    "outstandingLoanBalance",
    "submittedOnDate",
    "manuallyReversed"
})
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
    private Currency___ currency;
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
     *     The officeId
     */
    @JsonProperty("officeId")
    public Long getOfficeId() {
        return officeId;
    }

    /**
     * 
     * @param officeId
     *     The officeId
     */
    @JsonProperty("officeId")
    public void setOfficeId(Long officeId) {
        this.officeId = officeId;
    }

    /**
     * 
     * @return
     *     The officeName
     */
    @JsonProperty("officeName")
    public String getOfficeName() {
        return officeName;
    }

    /**
     * 
     * @param officeName
     *     The officeName
     */
    @JsonProperty("officeName")
    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The date
     */
    @JsonProperty("date")
    public List<Long> getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    @JsonProperty("date")
    public void setDate(List<Long> date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     The currency
     */
    @JsonProperty("currency")
    public Currency___ getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    @JsonProperty("currency")
    public void setCurrency(Currency___ currency) {
        this.currency = currency;
    }

    /**
     * 
     * @return
     *     The paymentDetailData
     */
    @JsonProperty("paymentDetailData")
    public PaymentDetailData getPaymentDetailData() {
        return paymentDetailData;
    }

    /**
     * 
     * @param paymentDetailData
     *     The paymentDetailData
     */
    @JsonProperty("paymentDetailData")
    public void setPaymentDetailData(PaymentDetailData paymentDetailData) {
        this.paymentDetailData = paymentDetailData;
    }

    /**
     * 
     * @return
     *     The amount
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * 
     * @param amount
     *     The amount
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * 
     * @return
     *     The principalPortion
     */
    @JsonProperty("principalPortion")
    public Long getPrincipalPortion() {
        return principalPortion;
    }

    /**
     * 
     * @param principalPortion
     *     The principalPortion
     */
    @JsonProperty("principalPortion")
    public void setPrincipalPortion(Long principalPortion) {
        this.principalPortion = principalPortion;
    }

    /**
     * 
     * @return
     *     The interestPortion
     */
    @JsonProperty("interestPortion")
    public Double getInterestPortion() {
        return interestPortion;
    }

    /**
     * 
     * @param interestPortion
     *     The interestPortion
     */
    @JsonProperty("interestPortion")
    public void setInterestPortion(Double interestPortion) {
        this.interestPortion = interestPortion;
    }

    /**
     * 
     * @return
     *     The feeChargesPortion
     */
    @JsonProperty("feeChargesPortion")
    public Long getFeeChargesPortion() {
        return feeChargesPortion;
    }

    /**
     * 
     * @param feeChargesPortion
     *     The feeChargesPortion
     */
    @JsonProperty("feeChargesPortion")
    public void setFeeChargesPortion(Long feeChargesPortion) {
        this.feeChargesPortion = feeChargesPortion;
    }

    /**
     * 
     * @return
     *     The penaltyChargesPortion
     */
    @JsonProperty("penaltyChargesPortion")
    public Long getPenaltyChargesPortion() {
        return penaltyChargesPortion;
    }

    /**
     * 
     * @param penaltyChargesPortion
     *     The penaltyChargesPortion
     */
    @JsonProperty("penaltyChargesPortion")
    public void setPenaltyChargesPortion(Long penaltyChargesPortion) {
        this.penaltyChargesPortion = penaltyChargesPortion;
    }

    /**
     * 
     * @return
     *     The overpaymentPortion
     */
    @JsonProperty("overpaymentPortion")
    public Long getOverpaymentPortion() {
        return overpaymentPortion;
    }

    /**
     * 
     * @param overpaymentPortion
     *     The overpaymentPortion
     */
    @JsonProperty("overpaymentPortion")
    public void setOverpaymentPortion(Long overpaymentPortion) {
        this.overpaymentPortion = overpaymentPortion;
    }

    /**
     * 
     * @return
     *     The unrecognizedIncomePortion
     */
    @JsonProperty("unrecognizedIncomePortion")
    public Long getUnrecognizedIncomePortion() {
        return unrecognizedIncomePortion;
    }

    /**
     * 
     * @param unrecognizedIncomePortion
     *     The unrecognizedIncomePortion
     */
    @JsonProperty("unrecognizedIncomePortion")
    public void setUnrecognizedIncomePortion(Long unrecognizedIncomePortion) {
        this.unrecognizedIncomePortion = unrecognizedIncomePortion;
    }

    /**
     * 
     * @return
     *     The outstandingLoanBalance
     */
    @JsonProperty("outstandingLoanBalance")
    public Long getOutstandingLoanBalance() {
        return outstandingLoanBalance;
    }

    /**
     * 
     * @param outstandingLoanBalance
     *     The outstandingLoanBalance
     */
    @JsonProperty("outstandingLoanBalance")
    public void setOutstandingLoanBalance(Long outstandingLoanBalance) {
        this.outstandingLoanBalance = outstandingLoanBalance;
    }

    /**
     * 
     * @return
     *     The submittedOnDate
     */
    @JsonProperty("submittedOnDate")
    public List<Long> getSubmittedOnDate() {
        return submittedOnDate;
    }

    /**
     * 
     * @param submittedOnDate
     *     The submittedOnDate
     */
    @JsonProperty("submittedOnDate")
    public void setSubmittedOnDate(List<Long> submittedOnDate) {
        this.submittedOnDate = submittedOnDate;
    }

    /**
     * 
     * @return
     *     The manuallyReversed
     */
    @JsonProperty("manuallyReversed")
    public Boolean getManuallyReversed() {
        return manuallyReversed;
    }

    /**
     * 
     * @param manuallyReversed
     *     The manuallyReversed
     */
    @JsonProperty("manuallyReversed")
    public void setManuallyReversed(Boolean manuallyReversed) {
        this.manuallyReversed = manuallyReversed;
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
