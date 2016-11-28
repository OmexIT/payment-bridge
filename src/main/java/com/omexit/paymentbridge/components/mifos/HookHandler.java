package com.omexit.paymentbridge.components.mifos;

import com.omexit.paymentbridge.core.util.exception.ValidationException;

/**
 * Created by aomeri on 11/28/16.
 */
public interface HookHandler {
    void handleHook(String request) throws ValidationException;
}
