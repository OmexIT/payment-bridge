
package com.omexit.paymentbridge.integrations.mifos.portfolio.savingAccountHook;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SavingsAccountHook {
	@JsonProperty("tenantId")
	private String tenantId;
	@JsonProperty("action")
	private String action;
	@JsonProperty("entity")
	private String entity;
	@JsonProperty("officeId")
	private Long officeId;
	@JsonProperty("clientId")
	private Long clientId;
	@JsonProperty("savingsId")
	private Long savingsId;
	@JsonProperty("resourceId")
	private Long resourceId;
	@JsonProperty("changes")
	private Changes changes;

}
