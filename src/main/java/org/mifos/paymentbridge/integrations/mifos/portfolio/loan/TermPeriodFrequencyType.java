
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
public class TermPeriodFrequencyType {

	@JsonProperty("id")
	private Long id;
	@JsonProperty("code")
	private String code;
	@JsonProperty("value")
	private String value;
}
