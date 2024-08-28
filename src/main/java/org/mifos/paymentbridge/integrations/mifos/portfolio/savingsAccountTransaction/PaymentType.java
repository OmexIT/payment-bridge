
package org.mifos.paymentbridge.integrations.mifos.portfolio.savingsAccountTransaction;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentType {

	@JsonProperty("id")
	private Long id;
	@JsonProperty("name")
	private String name;
}
