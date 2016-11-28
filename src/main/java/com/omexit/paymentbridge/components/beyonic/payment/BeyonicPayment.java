package com.omexit.paymentbridge.components.beyonic.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.omexit.paymentbridge.components.beyonic.BeyonicPaymentStateType;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Antony on 2/17/2016.
 */
@Data
@Entity(name = "tbl_beyonic_payments")
public class BeyonicPayment {
    @Id
    @GeneratedValue
    Long id;
    @JsonProperty("date_created")
    @Column(name = "date_created", updatable = false)
    private Date dateCreated;
    @JsonProperty("last_modified")
    @Column(name = "last_modified")
    private Date lastModified;
    @JsonProperty("payment_id")
    @Column(name = "payment_id")
    Long paymentId;
    @JsonProperty("organization")
    @Column(name = "organization")
    Long organization;
    @JsonProperty("amount")
    @Column(name = "amount")
    double amount;
    @JsonProperty("currency")
    @Column(name = "currency")
    String currency;
    @JsonProperty("payment_type")
    @Column(name = "payment_type")
    String paymentType;
    @JsonProperty("metadata")
    @Column(name = "metadata")
    String metadata;
    @JsonProperty("description")
    @Column(name = "description")
    String description;
    @JsonProperty("phone_number")
    @Column(name = "phone_number")
    String phoneNumber;
    @JsonProperty("state")
    @Column(name = "state")
    BeyonicPaymentStateType state;
    @JsonProperty("last_error")
    @Column(name = "last_error")
    String lastError;
    @JsonProperty("rejected_reason")
    @Column(name = "rejected_reason")
    String rejectedReason;
    @JsonProperty("rejected_by")
    @Column(name = "rejected_by")
    Long rejectedBy;
    @JsonProperty("rejected_time")
    @Column(name = "rejected_time")
    Date rejectedTime;
    @JsonProperty("cancelled_reason")
    @Column(name = "cancelled_reason")
    String cancelledReason ;
    @JsonProperty("cancelled_by")
    @Column(name = "cancelled_by")
    Long cancelledBy;
    @JsonProperty("cancelled_time")
    @Column(name = "cancelled_time")
    Date cancelledTime;
    @JsonProperty("created_on_beyonic")
    @Column(name = "created_on_beyonic")
    Date createdOnBeyonic;
    @JsonProperty("author")
    @Column(name = "author")
    Long author;
    @JsonProperty("modified_on_beyonic")
    @Column(name = "modified_on_beyonic")
    Date modifiedOnBeyonic;
    @JsonProperty("updated_by")
    @Column(name = "updated_by")
    String updatedBy;
    @JsonProperty("start_date")
    @Column(name = "start_date")
    String startDate;
    @JsonProperty("is_payment_posted")
    @Column(name = "is_payment_posted", nullable = false)
    Boolean isPaymentPostedToMifos;
    @JsonProperty("payment_bridge_ref")
    @Column(name = "payment_bridge_ref")
    private Long paymentBridgeRef;
    @JsonProperty("payment_status")
    @Column(name = "payment_status")
    private Integer paymentStatus;

    @PrePersist
    protected void onCreate() {
        Date date = new Date();
        dateCreated = date;
        lastModified = date;
    }

    @PreUpdate
    protected void onUpdate() {
        lastModified = new Date();
    }
}
