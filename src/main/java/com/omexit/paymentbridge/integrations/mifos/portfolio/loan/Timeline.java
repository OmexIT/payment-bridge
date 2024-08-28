
package com.omexit.paymentbridge.integrations.mifos.portfolio.loan;

import com.fasterxml.jackson.annotation.*;
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
public class Timeline {

	@JsonProperty("submittedOnDate")
	private List<Long> submittedOnDate = new ArrayList<Long>();
	@JsonProperty("submittedByUsername")
	private String submittedByUsername;
	@JsonProperty("submittedByFirstname")
	private String submittedByFirstname;
	@JsonProperty("submittedByLastname")
	private String submittedByLastname;
	@JsonProperty("approvedOnDate")
	private List<Long> approvedOnDate = new ArrayList<Long>();
	@JsonProperty("approvedByUsername")
	private String approvedByUsername;
	@JsonProperty("approvedByFirstname")
	private String approvedByFirstname;
	@JsonProperty("approvedByLastname")
	private String approvedByLastname;
	@JsonProperty("expectedDisbursementDate")
	private List<Long> expectedDisbursementDate = new ArrayList<Long>();
	@JsonProperty("actualDisbursementDate")
	private List<Long> actualDisbursementDate = new ArrayList<Long>();
	@JsonProperty("disbursedByUsername")
	private String disbursedByUsername;
	@JsonProperty("disbursedByFirstname")
	private String disbursedByFirstname;
	@JsonProperty("disbursedByLastname")
	private String disbursedByLastname;
	@JsonProperty("expectedMaturityDate")
	private List<Long> expectedMaturityDate = new ArrayList<Long>();

}
