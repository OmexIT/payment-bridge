
package org.mifos.paymentbridge.integrations.mifos.portfolio.loan;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Status {

	@JsonProperty("id")
	private Long id;
	@JsonProperty("code")
	private String code;
	@JsonProperty("value")
	private String value;
	@JsonProperty("pendingApproval")
	private Boolean pendingApproval;
	@JsonProperty("waitingForDisbursal")
	private Boolean waitingForDisbursal;
	@JsonProperty("active")
	private Boolean active;
	@JsonProperty("closedObligationsMet")
	private Boolean closedObligationsMet;
	@JsonProperty("closedWrittenOff")
	private Boolean closedWrittenOff;
	@JsonProperty("closedRescheduled")
	private Boolean closedRescheduled;
	@JsonProperty("closed")
	private Boolean closed;
	@JsonProperty("overpaid")
	private Boolean overpaid;

}
