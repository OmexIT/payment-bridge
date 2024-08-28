package org.mifos.paymentbridge.integrations.mifos;

import org.mifos.paymentbridge.exception.ValidationException;

/**
 * Created by aomeri on 11/28/16.
 */
public interface HookHandler {
	void handleHook(String request) throws ValidationException;
}
