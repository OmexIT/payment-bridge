package org.mifos.paymentbridge.core.payment;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.mifos.paymentbridge.dto.ErrorCode;
import lombok.Data;
import lombok.ToString;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@ToString
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "payment_type")
@JsonSubTypes({@JsonSubTypes.Type(value = IncomingPayment.class, name = "incoming"),
		@JsonSubTypes.Type(value = OutgoingPayment.class, name = "outgoing")})
@Entity(name = "tbl_payments")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Payment implements Serializable {
	private static final long serialVersionUID = -5563776068364123492L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@JsonIgnore
	@Column(name = "date_created", updatable = false)
	private Date dateCreated;
	@JsonIgnore
	@Column(name = "last_modified")
	private Date lastModified;
	@JsonProperty("tenant_id")
	@Column(name = "tenant_id")
	private String tenantId;
	@JsonProperty("client_id")
	@Column(name = "client_id")
	private Long clientId;
	@JsonProperty("entity")
	@Column(name = "entity", length = 50)
	private String entity;
	@JsonProperty("entity_id")
	@Column(name = "entity_id")
	private Long entityId;
	@JsonProperty("action")
	@Column(name = "action", length = 50)
	private String action;
	@JsonProperty("payment_account")
	@Column(name = "payment_account", length = 100)
	private String paymentAccount;
	@JsonProperty("transaction_amount")
	@Column(name = "transaction_amount")
	private Double transactionAmount;
	@JsonProperty("payment_status")
	@Column(name = "payment_status")
	private PaymentStatus paymentStatus;
	@Transient
	@JsonProperty("payment_type")
	private PaymentType paymentType;
	@JsonProperty("error_code")
	@Column(name = "error_code")
	private ErrorCode errorCode;
	@JsonProperty("status_reason_code_message")
	@Column(name = "status_reason_code_message")
	private String statusReasonCodeMessage;
	@JsonProperty("currency")
	@Column(name = "currency")
	private String currency;
	@JsonProperty("external_id")
	@Column(name = "external_id", length = 50)
	private String externalId;
	@JsonProperty("description")
	@Column(name = "description")
	private String description;
	@Transient
	@JsonProperty("date_created")
	private String strDateCreated;
	@Transient
	@JsonProperty("last_modified")
	private String strLastModified;
	@JsonProperty("retry_count")
	@Column(name = "retry_count", nullable = false)
	private Integer retryCount;
}
