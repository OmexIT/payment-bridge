
package org.mifos.paymentbridge.integrations.mifos.portfolio.disburseLoan;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DisburseLoan {
	private Long officeId;
	private Long clientId;
	private Long loanId;
	private Long resourceId;
	private Changes changes;
}
