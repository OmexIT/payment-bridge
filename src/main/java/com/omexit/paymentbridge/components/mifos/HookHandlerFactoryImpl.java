package com.omexit.paymentbridge.components.mifos;

import com.omexit.paymentbridge.core.util.exception.UnknownRequestException;
import com.omexit.paymentbridge.core.util.types.ErrorCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Antony on 5/27/2016.
 */
@Service
public class HookHandlerFactoryImpl implements HookHandlerFactory {

    private final LoanHookHandler loanHookHandler;

    private final SavingsAccountHookHandler savingsAccountHookHandler;

    @Autowired
    public HookHandlerFactoryImpl(LoanHookHandler loanHookHandler, SavingsAccountHookHandler savingsAccountHookHandler) {
        this.loanHookHandler = loanHookHandler;
        this.savingsAccountHookHandler = savingsAccountHookHandler;
    }

    public HookHandler buildHookHandler(String entity) throws UnknownRequestException {
        HookHandler hookHandler = null;

        switch (entity) {
            case "LOAN":
                hookHandler = loanHookHandler;
                break;
            case "SAVINGSACCOUNT":
                hookHandler = savingsAccountHookHandler;
                break;
            default:
                throw new UnknownRequestException("Unknown request",
                        "Expected hook entities [LOAN, SAVINGSACCOUNT]",
                        ErrorCode.UNKNOWN_REQUEST);
        }
        return hookHandler;
    }
}
