package com.omexit.paymentbridge.core.channel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity(name = "tbl_channels")
public class Channel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@JsonProperty("channel_name")
	@Column(name = "channel_name", length = 50, unique = true, nullable = false)
	private String channelName;
	@JsonProperty("channel_endpoint")
	@Column(name = "channel_endpoint", length = 100, nullable = false)
	private String channelEndpoint;
	@JsonProperty("channel_type")
	@Column(name = "channel_type", nullable = false)
	private ChannelClassificationType channelType;
	@JsonProperty("active")
	@Column(name = "is_active", nullable = false)
	private boolean isActive;
	@JsonProperty("callback")
	@Column(name = "callback", nullable = false)
	private boolean isCallback;
	@JsonIgnore
	@Column(name = "date_created", updatable = false)
	private Date dateCreated;
	@JsonIgnore
	@Column(name = "last_modified")
	private Date lastModified;
	@JsonProperty("max_retry_count")
	@Column(name = "max_retry_count", nullable = false)
	private Integer maxRetryCount;
	@Transient
	@JsonProperty("date_created")
	private String strDateCreated;
	@Transient
	@JsonProperty("last_modified")
	private String strLastModified;

}
