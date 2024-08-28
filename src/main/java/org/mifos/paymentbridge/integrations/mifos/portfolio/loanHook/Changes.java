
package org.mifos.paymentbridge.integrations.mifos.portfolio.loanHook;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Changes {

	@JsonProperty("status")
	private Status status;
	@JsonProperty("locale")
	private String locale;
	@JsonProperty("dateFormat")
	private String dateFormat;
	@JsonProperty("actualDisbursementDate")
	private String actualDisbursementDate;

}
