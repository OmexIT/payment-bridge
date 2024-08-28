package org.mifos.paymentbridge.integrations.mifos;

import org.mifos.paymentbridge.exception.ValidationException;

public interface HookHandler {
	void handleHook(String request) throws ValidationException;
}
