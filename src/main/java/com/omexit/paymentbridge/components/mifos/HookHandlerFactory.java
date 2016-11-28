package com.omexit.paymentbridge.components.mifos;

import com.omexit.mifosPaymentBridge.util.exception.UnknownRequestException;
import com.omexit.paymentbridge.core.util.exception.UnknownRequestException;

/**
 * Created by aomeri on 9/3/16.
 */
public interface HookHandlerFactory {
    HookHandler buildHookHandler(String entity) throws UnknownRequestException, UnknownRequestException;
}
