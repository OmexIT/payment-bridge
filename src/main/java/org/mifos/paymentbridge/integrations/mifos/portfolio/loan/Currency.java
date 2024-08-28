
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
public class Currency {

	@JsonProperty("code")
	private String code;
	@JsonProperty("name")
	private String name;
	@JsonProperty("decimalPlaces")
	private Long decimalPlaces;
	@JsonProperty("inMultiplesOf")
	private Long inMultiplesOf;
	@JsonProperty("displaySymbol")
	private String displaySymbol;
	@JsonProperty("nameCode")
	private String nameCode;
	@JsonProperty("displayLabel")
	private String displayLabel;
}
