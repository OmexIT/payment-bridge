package com.omexit.paymentbridge.components.mifos.api;

import com.omexit.paymentbridge.components.mifos.portfolio.client.Client;
import com.omexit.paymentbridge.components.mifos.portfolio.loan.Loan;
import com.omexit.paymentbridge.components.mifos.portfolio.savingsAccountTransaction.SavingsAccountTransaction;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Created by Antony on 2/11/2016.
 */
public interface MifosApiInterface {
    @GET("clients/{clientId}")
    Call<Client> getClient(@Path("clientId") Long clientId, @QueryMap Map<String, String> queryParams);

    @GET("loans/{loanId}")
    Call<Loan> getLoan(@Path("loanId") Long loanId, @QueryMap Map<String, String> queryParams);

    @GET("savingsaccounts/{accountId}/transactions/{transactionId}")
    Call<SavingsAccountTransaction> getSavingsAccountTransaction(@Path("accountId") Long accountId,
                                                                 @Path("transactionId") Long transactionId,
                                                                 @QueryMap Map<String, String> queryParams);
}
