
package com.omexit.paymentbridge.components.beyonic.jsonObjects.beyonicResponse;

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
    "organization",
    "amount",
    "currency",
    "payment_type",
    "metadata",
    "description",
    "phone_nos",
    "state",
    "last_error",
    "rejected_reason",
    "rejected_by",
    "rejected_time",
    "cancelled_reason",
    "cancelled_by",
    "cancelled_time",
    "created",
    "author",
    "modified",
    "updated_by",
    "start_date"
})
public class BeyonicPaymentResponse {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("organization")
    private Long organization;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("payment_type")
    private String paymentType;
    @JsonProperty("metadata")
    private Metadata metadata;
    @JsonProperty("description")
    private String description;
    @JsonProperty("phone_nos")
    private List<String> phoneNos = new ArrayList<String>();
    @JsonProperty("state")
    private String state;
    @JsonProperty("last_error")
    private String lastError;
    @JsonProperty("rejected_reason")
    private String rejectedReason;
    @JsonProperty("rejected_by")
    private Long rejectedBy;
    @JsonProperty("rejected_time")
    private String rejectedTime;
    @JsonProperty("cancelled_reason")
    private String cancelledReason;
    @JsonProperty("cancelled_by")
    private Long cancelledBy;
    @JsonProperty("cancelled_time")
    private String cancelledTime;
    @JsonProperty("created")
    private String created;
    @JsonProperty("author")
    private Long author;
    @JsonProperty("modified")
    private String modified;
    @JsonProperty("updated_by")
    private String updatedBy;
    @JsonProperty("start_date")
    private String startDate;
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
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 
     * @return
     *     The paymentType
     */
    @JsonProperty("payment_type")
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * 
     * @param paymentType
     *     The payment_type
     */
    @JsonProperty("payment_type")
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * 
     * @return
     *     The metadata
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * 
     * @param metadata
     *     The metadata
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The phoneNos
     */
    @JsonProperty("phone_nos")
    public List<String> getPhoneNos() {
        return phoneNos;
    }

    /**
     * 
     * @param phoneNos
     *     The phone_nos
     */
    @JsonProperty("phone_nos")
    public void setPhoneNos(List<String> phoneNos) {
        this.phoneNos = phoneNos;
    }

    /**
     * 
     * @return
     *     The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * @return
     *     The lastError
     */
    @JsonProperty("last_error")
    public String getLastError() {
        return lastError;
    }

    /**
     * 
     * @param lastError
     *     The last_error
     */
    @JsonProperty("last_error")
    public void setLastError(String lastError) {
        this.lastError = lastError;
    }

    /**
     * 
     * @return
     *     The rejectedReason
     */
    @JsonProperty("rejected_reason")
    public String getRejectedReason() {
        return rejectedReason;
    }

    /**
     * 
     * @param rejectedReason
     *     The rejected_reason
     */
    @JsonProperty("rejected_reason")
    public void setRejectedReason(String rejectedReason) {
        this.rejectedReason = rejectedReason;
    }

    /**
     * 
     * @return
     *     The rejectedBy
     */
    @JsonProperty("rejected_by")
    public Long getRejectedBy() {
        return rejectedBy;
    }

    /**
     * 
     * @param rejectedBy
     *     The rejected_by
     */
    @JsonProperty("rejected_by")
    public void setRejectedBy(Long rejectedBy) {
        this.rejectedBy = rejectedBy;
    }

    /**
     * 
     * @return
     *     The rejectedTime
     */
    @JsonProperty("rejected_time")
    public String getRejectedTime() {
        return rejectedTime;
    }

    /**
     * 
     * @param rejectedTime
     *     The rejected_time
     */
    @JsonProperty("rejected_time")
    public void setRejectedTime(String rejectedTime) {
        this.rejectedTime = rejectedTime;
    }

    /**
     * 
     * @return
     *     The cancelledReason
     */
    @JsonProperty("cancelled_reason")
    public String getCancelledReason() {
        return cancelledReason;
    }

    /**
     * 
     * @param cancelledReason
     *     The cancelled_reason
     */
    @JsonProperty("cancelled_reason")
    public void setCancelledReason(String cancelledReason) {
        this.cancelledReason = cancelledReason;
    }

    /**
     * 
     * @return
     *     The cancelledBy
     */
    @JsonProperty("cancelled_by")
    public Long getCancelledBy() {
        return cancelledBy;
    }

    /**
     * 
     * @param cancelledBy
     *     The cancelled_by
     */
    @JsonProperty("cancelled_by")
    public void setCancelledBy(Long cancelledBy) {
        this.cancelledBy = cancelledBy;
    }

    /**
     * 
     * @return
     *     The cancelledTime
     */
    @JsonProperty("cancelled_time")
    public String getCancelledTime() {
        return cancelledTime;
    }

    /**
     * 
     * @param cancelledTime
     *     The cancelled_time
     */
    @JsonProperty("cancelled_time")
    public void setCancelledTime(String cancelledTime) {
        this.cancelledTime = cancelledTime;
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
    public Long getAuthor() {
        return author;
    }

    /**
     * 
     * @param author
     *     The author
     */
    @JsonProperty("author")
    public void setAuthor(Long author) {
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
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 
     * @param updatedBy
     *     The updated_by
     */
    @JsonProperty("updated_by")
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * 
     * @return
     *     The startDate
     */
    @JsonProperty("start_date")
    public String getStartDate() {
        return startDate;
    }

    /**
     * 
     * @param startDate
     *     The start_date
     */
    @JsonProperty("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


    @Override
    public String toString() {
        return "BeyonicPaymentResponse{" +
                "id=" + id +
                ", organization=" + organization +
                ", amount='" + amount + '\'' +
                ", currency='" + currency + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", metadata=" + metadata +
                ", description='" + description + '\'' +
                ", phoneNos=" + phoneNos +
                ", state='" + state + '\'' +
                ", lastError='" + lastError + '\'' +
                ", rejectedReason='" + rejectedReason + '\'' +
                ", rejectedBy=" + rejectedBy +
                ", rejectedTime='" + rejectedTime + '\'' +
                ", cancelledReason='" + cancelledReason + '\'' +
                ", cancelledBy=" + cancelledBy +
                ", cancelledTime='" + cancelledTime + '\'' +
                ", created='" + created + '\'' +
                ", author=" + author +
                ", modified='" + modified + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", startDate='" + startDate + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
