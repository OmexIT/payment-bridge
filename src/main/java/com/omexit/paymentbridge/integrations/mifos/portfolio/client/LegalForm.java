
package com.omexit.paymentbridge.integrations.mifos.portfolio.client;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LegalForm {
	private Long id;
	private String code;
	private String value;
}
