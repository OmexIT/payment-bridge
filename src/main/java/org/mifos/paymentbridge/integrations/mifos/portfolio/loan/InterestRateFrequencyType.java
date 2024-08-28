
package org.mifos.paymentbridge.integrations.mifos.portfolio.loan;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InterestRateFrequencyType {
	private Long id;
	private String code;
	private String value;
}
