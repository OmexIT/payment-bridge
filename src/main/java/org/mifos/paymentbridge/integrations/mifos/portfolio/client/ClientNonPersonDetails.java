
package org.mifos.paymentbridge.integrations.mifos.portfolio.client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientNonPersonDetails {
	private Constitution constitution;
	private MainBusinessLine mainBusinessLine;

}
