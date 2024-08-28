
package com.omexit.paymentbridge.integrations.mifos.portfolio.savingsAccountTransaction;

import com.fasterxml.jackson.annotation.*;
import com.omexit.paymentbridge.integrations.mifos.portfolio.loan.Currency;
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
public class SavingsAccountTransaction {

	@JsonProperty("id")
	private Long id;
	@JsonProperty("transactionType")
	private TransactionType transactionType;
	@JsonProperty("accountId")
	private Long accountId;
	@JsonProperty("accountNo")
	private String accountNo;
	@JsonProperty("date")
	private List<Long> date = new ArrayList<Long>();
	@JsonProperty("currency")
	private Currency currency;
	@JsonProperty("paymentDetailData")
	private PaymentDetailData paymentDetailData;
	@JsonProperty("amount")
	private Long amount;
	@JsonProperty("runningBalance")
	private Long runningBalance;
	@JsonProperty("reversed")
	private Boolean reversed;
	@JsonProperty("submittedOnDate")
	private List<Long> submittedOnDate = new ArrayList<Long>();

}
