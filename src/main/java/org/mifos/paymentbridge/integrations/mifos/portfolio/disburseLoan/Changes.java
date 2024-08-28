
package org.mifos.paymentbridge.integrations.mifos.portfolio.disburseLoan;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Changes {
	private Status status;
	private String locale;
	private String dateFormat;
	private String actualDisbursementDate;
}
