
package com.omexit.paymentbridge.components.mifos.portfolio.loan;

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
    "disbursement",
    "repaymentAtDisbursement",
    "repayment",
    "contra",
    "waiveInterest",
    "waiveCharges",
    "accrual",
    "writeOff",
    "recoveryRepayment",
    "initiateTransfer",
    "approveTransfer",
    "withdrawTransfer",
    "rejectTransfer",
    "chargePayment",
    "refund",
    "refundForActiveLoans"
})
public class Type {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("code")
    private String code;
    @JsonProperty("value")
    private String value;
    @JsonProperty("disbursement")
    private Boolean disbursement;
    @JsonProperty("repaymentAtDisbursement")
    private Boolean repaymentAtDisbursement;
    @JsonProperty("repayment")
    private Boolean repayment;
    @JsonProperty("contra")
    private Boolean contra;
    @JsonProperty("waiveInterest")
    private Boolean waiveInterest;
    @JsonProperty("waiveCharges")
    private Boolean waiveCharges;
    @JsonProperty("accrual")
    private Boolean accrual;
    @JsonProperty("writeOff")
    private Boolean writeOff;
    @JsonProperty("recoveryRepayment")
    private Boolean recoveryRepayment;
    @JsonProperty("initiateTransfer")
    private Boolean initiateTransfer;
    @JsonProperty("approveTransfer")
    private Boolean approveTransfer;
    @JsonProperty("withdrawTransfer")
    private Boolean withdrawTransfer;
    @JsonProperty("rejectTransfer")
    private Boolean rejectTransfer;
    @JsonProperty("chargePayment")
    private Boolean chargePayment;
    @JsonProperty("refund")
    private Boolean refund;
    @JsonProperty("refundForActiveLoans")
    private Boolean refundForActiveLoans;
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
     *     The disbursement
     */
    @JsonProperty("disbursement")
    public Boolean getDisbursement() {
        return disbursement;
    }

    /**
     * 
     * @param disbursement
     *     The disbursement
     */
    @JsonProperty("disbursement")
    public void setDisbursement(Boolean disbursement) {
        this.disbursement = disbursement;
    }

    /**
     * 
     * @return
     *     The repaymentAtDisbursement
     */
    @JsonProperty("repaymentAtDisbursement")
    public Boolean getRepaymentAtDisbursement() {
        return repaymentAtDisbursement;
    }

    /**
     * 
     * @param repaymentAtDisbursement
     *     The repaymentAtDisbursement
     */
    @JsonProperty("repaymentAtDisbursement")
    public void setRepaymentAtDisbursement(Boolean repaymentAtDisbursement) {
        this.repaymentAtDisbursement = repaymentAtDisbursement;
    }

    /**
     * 
     * @return
     *     The repayment
     */
    @JsonProperty("repayment")
    public Boolean getRepayment() {
        return repayment;
    }

    /**
     * 
     * @param repayment
     *     The repayment
     */
    @JsonProperty("repayment")
    public void setRepayment(Boolean repayment) {
        this.repayment = repayment;
    }

    /**
     * 
     * @return
     *     The contra
     */
    @JsonProperty("contra")
    public Boolean getContra() {
        return contra;
    }

    /**
     * 
     * @param contra
     *     The contra
     */
    @JsonProperty("contra")
    public void setContra(Boolean contra) {
        this.contra = contra;
    }

    /**
     * 
     * @return
     *     The waiveInterest
     */
    @JsonProperty("waiveInterest")
    public Boolean getWaiveInterest() {
        return waiveInterest;
    }

    /**
     * 
     * @param waiveInterest
     *     The waiveInterest
     */
    @JsonProperty("waiveInterest")
    public void setWaiveInterest(Boolean waiveInterest) {
        this.waiveInterest = waiveInterest;
    }

    /**
     * 
     * @return
     *     The waiveCharges
     */
    @JsonProperty("waiveCharges")
    public Boolean getWaiveCharges() {
        return waiveCharges;
    }

    /**
     * 
     * @param waiveCharges
     *     The waiveCharges
     */
    @JsonProperty("waiveCharges")
    public void setWaiveCharges(Boolean waiveCharges) {
        this.waiveCharges = waiveCharges;
    }

    /**
     * 
     * @return
     *     The accrual
     */
    @JsonProperty("accrual")
    public Boolean getAccrual() {
        return accrual;
    }

    /**
     * 
     * @param accrual
     *     The accrual
     */
    @JsonProperty("accrual")
    public void setAccrual(Boolean accrual) {
        this.accrual = accrual;
    }

    /**
     * 
     * @return
     *     The writeOff
     */
    @JsonProperty("writeOff")
    public Boolean getWriteOff() {
        return writeOff;
    }

    /**
     * 
     * @param writeOff
     *     The writeOff
     */
    @JsonProperty("writeOff")
    public void setWriteOff(Boolean writeOff) {
        this.writeOff = writeOff;
    }

    /**
     * 
     * @return
     *     The recoveryRepayment
     */
    @JsonProperty("recoveryRepayment")
    public Boolean getRecoveryRepayment() {
        return recoveryRepayment;
    }

    /**
     * 
     * @param recoveryRepayment
     *     The recoveryRepayment
     */
    @JsonProperty("recoveryRepayment")
    public void setRecoveryRepayment(Boolean recoveryRepayment) {
        this.recoveryRepayment = recoveryRepayment;
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
     *     The chargePayment
     */
    @JsonProperty("chargePayment")
    public Boolean getChargePayment() {
        return chargePayment;
    }

    /**
     * 
     * @param chargePayment
     *     The chargePayment
     */
    @JsonProperty("chargePayment")
    public void setChargePayment(Boolean chargePayment) {
        this.chargePayment = chargePayment;
    }

    /**
     * 
     * @return
     *     The refund
     */
    @JsonProperty("refund")
    public Boolean getRefund() {
        return refund;
    }

    /**
     * 
     * @param refund
     *     The refund
     */
    @JsonProperty("refund")
    public void setRefund(Boolean refund) {
        this.refund = refund;
    }

    /**
     * 
     * @return
     *     The refundForActiveLoans
     */
    @JsonProperty("refundForActiveLoans")
    public Boolean getRefundForActiveLoans() {
        return refundForActiveLoans;
    }

    /**
     * 
     * @param refundForActiveLoans
     *     The refundForActiveLoans
     */
    @JsonProperty("refundForActiveLoans")
    public void setRefundForActiveLoans(Boolean refundForActiveLoans) {
        this.refundForActiveLoans = refundForActiveLoans;
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
