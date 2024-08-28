package com.omexit.paymentbridge.integrations.mifos;

import com.omexit.paymentbridge.exception.UnknownRequestException;

public interface HookHandlerFactory {
	HookHandler buildHookHandler(String entity) throws UnknownRequestException, UnknownRequestException;
}
