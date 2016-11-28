
package com.omexit.paymentbridge.components.beyonic.jsonObjects.beyonicCollection;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "remote_transaction_id",
    "organization",
    "amount",
    "currency",
    "phonenumber",
    "payment_date",
    "reference",
    "status",
    "created",
    "author",
    "modified",
    "updated_by"
})
public class Collection {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("remote_transaction_id")
    private String remoteTransactionId;
    @JsonProperty("organization")
    private Long organization;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("currency")
    private Long currency;
    @JsonProperty("phonenumber")
    private String phonenumber;
    @JsonProperty("payment_date")
    private String paymentDate;
    @JsonProperty("reference")
    private Object reference;
    @JsonProperty("status")
    private String status;
    @JsonProperty("created")
    private String created;
    @JsonProperty("author")
    private Object author;
    @JsonProperty("modified")
    private String modified;
    @JsonProperty("updated_by")
    private Object updatedBy;
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
     *     The remoteTransactionId
     */
    @JsonProperty("remote_transaction_id")
    public String getRemoteTransactionId() {
        return remoteTransactionId;
    }

    /**
     * 
     * @param remoteTransactionId
     *     The remote_transaction_id
     */
    @JsonProperty("remote_transaction_id")
    public void setRemoteTransactionId(String remoteTransactionId) {
        this.remoteTransactionId = remoteTransactionId;
    }

    /**
     * 
     * @return
     *     The organization
     */
    @JsonProperty("organization")
    public Long getOrganization() {
        return organization;
    }

    /**
     * 
     * @param organization
     *     The organization
     */
    @JsonProperty("organization")
    public void setOrganization(Long organization) {
        this.organization = organization;
    }

    /**
     * 
     * @return
     *     The amount
     */
    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    /**
     * 
     * @param amount
     *     The amount
     */
    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * 
     * @return
     *     The currency
     */
    @JsonProperty("currency")
    public Long getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    @JsonProperty("currency")
    public void setCurrency(Long currency) {
        this.currency = currency;
    }

    /**
     * 
     * @return
     *     The phonenumber
     */
    @JsonProperty("phonenumber")
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * 
     * @param phonenumber
     *     The phonenumber
     */
    @JsonProperty("phonenumber")
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    /**
     * 
     * @return
     *     The paymentDate
     */
    @JsonProperty("payment_date")
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * 
     * @param paymentDate
     *     The payment_date
     */
    @JsonProperty("payment_date")
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * 
     * @return
     *     The reference
     */
    @JsonProperty("reference")
    public Object getReference() {
        return reference;
    }

    /**
     * 
     * @param reference
     *     The reference
     */
    @JsonProperty("reference")
    public void setReference(Object reference) {
        this.reference = reference;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The created
     */
    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    /**
     * 
     * @param created
     *     The created
     */
    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * 
     * @return
     *     The author
     */
    @JsonProperty("author")
    public Object getAuthor() {
        return author;
    }

    /**
     * 
     * @param author
     *     The author
     */
    @JsonProperty("author")
    public void setAuthor(Object author) {
        this.author = author;
    }

    /**
     * 
     * @return
     *     The modified
     */
    @JsonProperty("modified")
    public String getModified() {
        return modified;
    }

    /**
     * 
     * @param modified
     *     The modified
     */
    @JsonProperty("modified")
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * 
     * @return
     *     The updatedBy
     */
    @JsonProperty("updated_by")
    public Object getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 
     * @param updatedBy
     *     The updated_by
     */
    @JsonProperty("updated_by")
    public void setUpdatedBy(Object updatedBy) {
        this.updatedBy = updatedBy;
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
