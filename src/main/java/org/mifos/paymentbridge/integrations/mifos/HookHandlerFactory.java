package org.mifos.paymentbridge.integrations.mifos;

import org.mifos.paymentbridge.exception.UnknownRequestException;

public interface HookHandlerFactory {
	HookHandler buildHookHandler(String entity) throws UnknownRequestException, UnknownRequestException;
}
