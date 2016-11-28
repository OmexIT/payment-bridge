
package com.omexit.paymentbridge.components.beyonic.jsonObjects.beyonicPayment;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "payment_type",
        "id",
        "tenant_id",
        "client_id",
        "entity",
        "entity_id",
        "action",
        "payment_account",
        "transaction_amount",
        "channel_name",
        "payment_status",
        "error_code",
        "status_reason_code_message",
        "currency",
        "external_id",
        "description",
        "date_created",
        "last_modified",
        "retry_count",
        "actual_disbursement_date"
})

public class PaymentRequest {

    @JsonProperty("payment_type")
    private String paymentType;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("tenant_id")
    private String tenantId;
    @JsonProperty("client_id")
    private Long clientId;
    @JsonProperty("entity")
    private String entity;
    @JsonProperty("entity_id")
    private Long entityId;
    @JsonProperty("action")
    private String action;
    @JsonProperty("payment_account")
    private String paymentAccount;
    @JsonProperty("transaction_amount")
    private Double transactionAmount;
    @JsonProperty("channel_name")
    private Object channelName;
    @JsonProperty("payment_status")
    private String paymentStatus;
    @JsonProperty("error_code")
    private String errorCode;
    @JsonProperty("status_reason_code_message")
    private String statusReasonCodeMessage;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("external_id")
    private Object externalId;
    @JsonProperty("description")
    private String description;
    @JsonProperty("date_created")
    private String dateCreated;
    @JsonProperty("last_modified")
    private String lastModified;
    @JsonProperty("retry_count")
    private Long retryCount;
    @JsonProperty("actual_disbursement_date")
    private String actualDisbursementDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The paymentType
     */
    @JsonProperty("payment_type")
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * @param paymentType The payment_type
     */
    @JsonProperty("payment_type")
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * @return The id
     */
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    /**
     * @param id The id
     */
    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return The tenantId
     */
    @JsonProperty("tenant_id")
    public String getTenantId() {
        return tenantId;
    }

    /**
     * @param tenantId The tenant_id
     */
    @JsonProperty("tenant_id")
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * @return The clientId
     */
    @JsonProperty("client_id")
    public Long getClientId() {
        return clientId;
    }

    /**
     * @param clientId The client_id
     */
    @JsonProperty("client_id")
    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    /**
     * @return The entity
     */
    @JsonProperty("entity")
    public String getEntity() {
        return entity;
    }

    /**
     * @param entity The entity
     */
    @JsonProperty("entity")
    public void setEntity(String entity) {
        this.entity = entity;
    }

    /**
     * @return The entityId
     */
    @JsonProperty("entity_id")
    public Long getEntityId() {
        return entityId;
    }

    /**
     * @param entityId The entity_id
     */
    @JsonProperty("entity_id")
    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    /**
     * @return The action
     */
    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    /**
     * @param action The action
     */
    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * @return The paymentAccount
     */
    @JsonProperty("payment_account")
    public String getPaymentAccount() {
        return paymentAccount;
    }

    /**
     * @param paymentAccount The payment_account
     */
    @JsonProperty("payment_account")
    public void setPaymentAccount(String paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    /**
     * @return The transactionAmount
     */
    @JsonProperty("transaction_amount")
    public Double getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * @param transactionAmount The transaction_amount
     */
    @JsonProperty("transaction_amount")
    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    /**
     * @return The channelName
     */
    @JsonProperty("channel_name")
    public Object getChannelName() {
        return channelName;
    }

    /**
     * @param channelName The channel_name
     */
    @JsonProperty("channel_name")
    public void setChannelName(Object channelName) {
        this.channelName = channelName;
    }

    /**
     * @return The paymentStatus
     */
    @JsonProperty("payment_status")
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * @param paymentStatus The payment_status
     */
    @JsonProperty("payment_status")
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    /**
     * @return The errorCode
     */
    @JsonProperty("error_code")
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * @param errorCode The error_code
     */
    @JsonProperty("error_code")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @return The statusReasonCodeMessage
     */
    @JsonProperty("status_reason_code_message")
    public String getStatusReasonCodeMessage() {
        return statusReasonCodeMessage;
    }

    /**
     * @param statusReasonCodeMessage The status_reason_code_message
     */
    @JsonProperty("status_reason_code_message")
    public void setStatusReasonCodeMessage(String statusReasonCodeMessage) {
        this.statusReasonCodeMessage = statusReasonCodeMessage;
    }

    /**
     * @return The currency
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency The currency
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return The externalId
     */
    @JsonProperty("external_id")
    public Object getExternalId() {
        return externalId;
    }

    /**
     * @param externalId The external_id
     */
    @JsonProperty("external_id")
    public void setExternalId(Object externalId) {
        this.externalId = externalId;
    }

    /**
     * @return The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The dateCreated
     */
    @JsonProperty("date_created")
    public String getDateCreated() {
        return dateCreated;
    }

    /**
     * @param dateCreated The date_created
     */
    @JsonProperty("date_created")
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * @return The lastModified
     */
    @JsonProperty("last_modified")
    public String getLastModified() {
        return lastModified;
    }

    /**
     * @param lastModified The last_modified
     */
    @JsonProperty("last_modified")
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * @return The retryCount
     */
    @JsonProperty("retry_count")
    public Long getRetryCount() {
        return retryCount;
    }

    /**
     * @param retryCount The retry_count
     */
    @JsonProperty("retry_count")
    public void setRetryCount(Long retryCount) {
        this.retryCount = retryCount;
    }

    /**
     * @return The actualDisbursementDate
     */
    @JsonProperty("actual_disbursement_date")
    public String getActualDisbursementDate() {
        return actualDisbursementDate;
    }

    /**
     * @param actualDisbursementDate The actual_disbursement_date
     */
    @JsonProperty("actual_disbursement_date")
    public void setActualDisbursementDate(String actualDisbursementDate) {
        this.actualDisbursementDate = actualDisbursementDate;
    }

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "paymentType='" + paymentType + '\'' +
                ", id=" + id +
                ", tenantId='" + tenantId + '\'' +
                ", clientId=" + clientId +
                ", entity='" + entity + '\'' +
                ", entityId=" + entityId +
                ", action='" + action + '\'' +
                ", paymentAccount='" + paymentAccount + '\'' +
                ", transactionAmount=" + transactionAmount +
                ", channelName=" + channelName +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", statusReasonCodeMessage='" + statusReasonCodeMessage + '\'' +
                ", currency='" + currency + '\'' +
                ", externalId=" + externalId +
                ", description='" + description + '\'' +
                ", dateCreated='" + dateCreated + '\'' +
                ", lastModified='" + lastModified + '\'' +
                ", retryCount=" + retryCount +
                ", actualDisbursementDate='" + actualDisbursementDate + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
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
