package com.omexit.paymentbridge.integrations.mifos;

import com.omexit.paymentbridge.exception.ValidationException;

/**
 * Created by aomeri on 11/28/16.
 */
public interface HookHandler {
	void handleHook(String request) throws ValidationException;
}
