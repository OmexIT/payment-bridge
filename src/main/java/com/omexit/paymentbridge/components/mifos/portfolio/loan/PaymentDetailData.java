
package com.omexit.paymentbridge.components.mifos.portfolio.loan;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "paymentType",
    "accountNumber",
    "checkNumber",
    "routingCode",
    "receiptNumber",
    "bankNumber"
})
public class PaymentDetailData {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("paymentType")
    private PaymentType paymentType;
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("checkNumber")
    private String checkNumber;
    @JsonProperty("routingCode")
    private String routingCode;
    @JsonProperty("receiptNumber")
    private String receiptNumber;
    @JsonProperty("bankNumber")
    private String bankNumber;
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
     *     The paymentType
     */
    @JsonProperty("paymentType")
    public PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * 
     * @param paymentType
     *     The paymentType
     */
    @JsonProperty("paymentType")
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * 
     * @return
     *     The accountNumber
     */
    @JsonProperty("accountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * 
     * @param accountNumber
     *     The accountNumber
     */
    @JsonProperty("accountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * 
     * @return
     *     The checkNumber
     */
    @JsonProperty("checkNumber")
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * 
     * @param checkNumber
     *     The checkNumber
     */
    @JsonProperty("checkNumber")
    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    /**
     * 
     * @return
     *     The routingCode
     */
    @JsonProperty("routingCode")
    public String getRoutingCode() {
        return routingCode;
    }

    /**
     * 
     * @param routingCode
     *     The routingCode
     */
    @JsonProperty("routingCode")
    public void setRoutingCode(String routingCode) {
        this.routingCode = routingCode;
    }

    /**
     * 
     * @return
     *     The receiptNumber
     */
    @JsonProperty("receiptNumber")
    public String getReceiptNumber() {
        return receiptNumber;
    }

    /**
     * 
     * @param receiptNumber
     *     The receiptNumber
     */
    @JsonProperty("receiptNumber")
    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    /**
     * 
     * @return
     *     The bankNumber
     */
    @JsonProperty("bankNumber")
    public String getBankNumber() {
        return bankNumber;
    }

    /**
     * 
     * @param bankNumber
     *     The bankNumber
     */
    @JsonProperty("bankNumber")
    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
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
