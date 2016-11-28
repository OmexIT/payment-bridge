
package com.omexit.paymentbridge.components.mifos.portfolio.savingsAccountTransaction;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "code",
    "value",
    "deposit",
    "withdrawal",
    "interestPosting",
    "feeDeduction",
    "initiateTransfer",
    "approveTransfer",
    "withdrawTransfer",
    "rejectTransfer",
    "overdraftInterest",
    "writtenoff",
    "overdraftFee"
})
public class TransactionType {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("code")
    private String code;
    @JsonProperty("value")
    private String value;
    @JsonProperty("deposit")
    private Boolean deposit;
    @JsonProperty("withdrawal")
    private Boolean withdrawal;
    @JsonProperty("interestPosting")
    private Boolean interestPosting;
    @JsonProperty("feeDeduction")
    private Boolean feeDeduction;
    @JsonProperty("initiateTransfer")
    private Boolean initiateTransfer;
    @JsonProperty("approveTransfer")
    private Boolean approveTransfer;
    @JsonProperty("withdrawTransfer")
    private Boolean withdrawTransfer;
    @JsonProperty("rejectTransfer")
    private Boolean rejectTransfer;
    @JsonProperty("overdraftInterest")
    private Boolean overdraftInterest;
    @JsonProperty("writtenoff")
    private Boolean writtenoff;
    @JsonProperty("overdraftFee")
    private Boolean overdraftFee;
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
     *     The code
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 
     * @return
     *     The deposit
     */
    @JsonProperty("deposit")
    public Boolean getDeposit() {
        return deposit;
    }

    /**
     * 
     * @param deposit
     *     The deposit
     */
    @JsonProperty("deposit")
    public void setDeposit(Boolean deposit) {
        this.deposit = deposit;
    }

    /**
     * 
     * @return
     *     The withdrawal
     */
    @JsonProperty("withdrawal")
    public Boolean getWithdrawal() {
        return withdrawal;
    }

    /**
     * 
     * @param withdrawal
     *     The withdrawal
     */
    @JsonProperty("withdrawal")
    public void setWithdrawal(Boolean withdrawal) {
        this.withdrawal = withdrawal;
    }

    /**
     * 
     * @return
     *     The interestPosting
     */
    @JsonProperty("interestPosting")
    public Boolean getInterestPosting() {
        return interestPosting;
    }

    /**
     * 
     * @param interestPosting
     *     The interestPosting
     */
    @JsonProperty("interestPosting")
    public void setInterestPosting(Boolean interestPosting) {
        this.interestPosting = interestPosting;
    }

    /**
     * 
     * @return
     *     The feeDeduction
     */
    @JsonProperty("feeDeduction")
    public Boolean getFeeDeduction() {
        return feeDeduction;
    }

    /**
     * 
     * @param feeDeduction
     *     The feeDeduction
     */
    @JsonProperty("feeDeduction")
    public void setFeeDeduction(Boolean feeDeduction) {
        this.feeDeduction = feeDeduction;
    }

    /**
     * 
     * @return
     *     The initiateTransfer
     */
    @JsonProperty("initiateTransfer")
    public Boolean getInitiateTransfer() {
        return initiateTransfer;
    }

    /**
     * 
     * @param initiateTransfer
     *     The initiateTransfer
     */
    @JsonProperty("initiateTransfer")
    public void setInitiateTransfer(Boolean initiateTransfer) {
        this.initiateTransfer = initiateTransfer;
    }

    /**
     * 
     * @return
     *     The approveTransfer
     */
    @JsonProperty("approveTransfer")
    public Boolean getApproveTransfer() {
        return approveTransfer;
    }

    /**
     * 
     * @param approveTransfer
     *     The approveTransfer
     */
    @JsonProperty("approveTransfer")
    public void setApproveTransfer(Boolean approveTransfer) {
        this.approveTransfer = approveTransfer;
    }

    /**
     * 
     * @return
     *     The withdrawTransfer
     */
    @JsonProperty("withdrawTransfer")
    public Boolean getWithdrawTransfer() {
        return withdrawTransfer;
    }

    /**
     * 
     * @param withdrawTransfer
     *     The withdrawTransfer
     */
    @JsonProperty("withdrawTransfer")
    public void setWithdrawTransfer(Boolean withdrawTransfer) {
        this.withdrawTransfer = withdrawTransfer;
    }

    /**
     * 
     * @return
     *     The rejectTransfer
     */
    @JsonProperty("rejectTransfer")
    public Boolean getRejectTransfer() {
        return rejectTransfer;
    }

    /**
     * 
     * @param rejectTransfer
     *     The rejectTransfer
     */
    @JsonProperty("rejectTransfer")
    public void setRejectTransfer(Boolean rejectTransfer) {
        this.rejectTransfer = rejectTransfer;
    }

    /**
     * 
     * @return
     *     The overdraftInterest
     */
    @JsonProperty("overdraftInterest")
    public Boolean getOverdraftInterest() {
        return overdraftInterest;
    }

    /**
     * 
     * @param overdraftInterest
     *     The overdraftInterest
     */
    @JsonProperty("overdraftInterest")
    public void setOverdraftInterest(Boolean overdraftInterest) {
        this.overdraftInterest = overdraftInterest;
    }

    /**
     * 
     * @return
     *     The writtenoff
     */
    @JsonProperty("writtenoff")
    public Boolean getWrittenoff() {
        return writtenoff;
    }

    /**
     * 
     * @param writtenoff
     *     The writtenoff
     */
    @JsonProperty("writtenoff")
    public void setWrittenoff(Boolean writtenoff) {
        this.writtenoff = writtenoff;
    }

    /**
     * 
     * @return
     *     The overdraftFee
     */
    @JsonProperty("overdraftFee")
    public Boolean getOverdraftFee() {
        return overdraftFee;
    }

    /**
     * 
     * @param overdraftFee
     *     The overdraftFee
     */
    @JsonProperty("overdraftFee")
    public void setOverdraftFee(Boolean overdraftFee) {
        this.overdraftFee = overdraftFee;
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
