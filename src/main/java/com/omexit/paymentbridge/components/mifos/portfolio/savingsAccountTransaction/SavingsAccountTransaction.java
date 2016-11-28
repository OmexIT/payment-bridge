
package com.omexit.paymentbridge.components.mifos.portfolio.savingsAccountTransaction;

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
    "transactionType",
    "accountId",
    "accountNo",
    "date",
    "currency",
    "paymentDetailData",
    "amount",
    "runningBalance",
    "reversed",
    "submittedOnDate"
})
public class SavingsAccountTransaction {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("transactionType")
    private TransactionType transactionType;
    @JsonProperty("accountId")
    private Long accountId;
    @JsonProperty("accountNo")
    private String accountNo;
    @JsonProperty("date")
    private List<Long> date = new ArrayList<Long>();
    @JsonProperty("currency")
    private Currency currency;
    @JsonProperty("paymentDetailData")
    private PaymentDetailData paymentDetailData;
    @JsonProperty("amount")
    private Long amount;
    @JsonProperty("runningBalance")
    private Long runningBalance;
    @JsonProperty("reversed")
    private Boolean reversed;
    @JsonProperty("submittedOnDate")
    private List<Long> submittedOnDate = new ArrayList<Long>();
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
     *     The transactionType
     */
    @JsonProperty("transactionType")
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * 
     * @param transactionType
     *     The transactionType
     */
    @JsonProperty("transactionType")
    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * 
     * @return
     *     The accountId
     */
    @JsonProperty("accountId")
    public Long getAccountId() {
        return accountId;
    }

    /**
     * 
     * @param accountId
     *     The accountId
     */
    @JsonProperty("accountId")
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
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
    public Long getAmount() {
        return amount;
    }

    /**
     * 
     * @param amount
     *     The amount
     */
    @JsonProperty("amount")
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * 
     * @return
     *     The runningBalance
     */
    @JsonProperty("runningBalance")
    public Long getRunningBalance() {
        return runningBalance;
    }

    /**
     * 
     * @param runningBalance
     *     The runningBalance
     */
    @JsonProperty("runningBalance")
    public void setRunningBalance(Long runningBalance) {
        this.runningBalance = runningBalance;
    }

    /**
     * 
     * @return
     *     The reversed
     */
    @JsonProperty("reversed")
    public Boolean getReversed() {
        return reversed;
    }

    /**
     * 
     * @param reversed
     *     The reversed
     */
    @JsonProperty("reversed")
    public void setReversed(Boolean reversed) {
        this.reversed = reversed;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
