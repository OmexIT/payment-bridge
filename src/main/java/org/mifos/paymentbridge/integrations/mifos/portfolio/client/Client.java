
package org.mifos.paymentbridge.integrations.mifos.portfolio.client;

import org.mifos.paymentbridge.integrations.mifos.portfolio.loan.Timeline;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Client {
	private Long id;
	private String accountNo;
	private String externalId;
	private Status status;
	private SubStatus subStatus;
	private Boolean active;
	private List<Long> activationDate = new ArrayList<Long>();
	private String firstname;
	private String lastname;
	private String displayName;
	private String mobileNo;
	private List<Long> dateOfBirth = new ArrayList<Long>();
	private Gender gender;
	private ClientType clientType;
	private ClientClassification clientClassification;
	private Long officeId;
	private String officeName;
	private Timeline timeline;
	private LegalForm legalForm;
	private List<Object> groups = new ArrayList<Object>();
	private ClientNonPersonDetails clientNonPersonDetails;
}
