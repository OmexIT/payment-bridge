
package org.mifos.paymentbridge.integrations.mifos.portfolio.disburseLoan;

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
	private Long id;
	private String code;
	private String value;
	private Boolean pendingApproval;
	private Boolean waitingForDisbursal;
	private Boolean active;
	private Boolean closedObligationsMet;
	private Boolean closedWrittenOff;
	private Boolean closedRescheduled;
	private Boolean closed;
	private Boolean overpaid;
}
