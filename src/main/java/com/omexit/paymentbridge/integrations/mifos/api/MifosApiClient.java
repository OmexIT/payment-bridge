package com.omexit.paymentbridge.integrations.mifos.api;

import com.omexit.paymentbridge.integrations.mifos.portfolio.client.Client;
import com.omexit.paymentbridge.integrations.mifos.portfolio.loan.Loan;
import com.omexit.paymentbridge.integrations.mifos.portfolio.savingsAccountTransaction.SavingsAccountTransaction;
import feign.QueryMap;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@FeignClient(name = "mifos", url = "${mifos.base.url}")
public interface MifosApiClient {
	@GetMapping("clients/{clientId}")
	Client getClient(@PathVariable("clientId") Long clientId, @QueryMap Map<String, String> queryParams);

	@GetMapping("loans/{loanId}")
	Loan getLoan(@PathVariable("loanId") Long loanId, @QueryMap Map<String, String> queryParams);

	@GetMapping("savingsaccounts/{accountId}/transactions/{transactionId}")
	SavingsAccountTransaction getSavingsAccountTransaction(@PathVariable("accountId") Long accountId,
			@PathVariable("transactionId") Long transactionId, @QueryMap Map<String, String> queryParams);
}
