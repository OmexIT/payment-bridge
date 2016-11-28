package com.omexit.paymentbridge.components.mifos;

import com.omexit.paymentbridge.core.util.exception.UnknownRequestException;
import com.omexit.paymentbridge.core.util.exception.ValidationException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import java.io.IOException;

/**
 * Created by aomeri on 11/28/16.
 */
public class MifosHookService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final HookHandlerFactory hookHandlerFactory;

    @Autowired
    public MifosHookService(HookHandlerFactory hookHandlerFactory) {
        this.hookHandlerFactory = hookHandlerFactory;
    }

    public void handleHook(Message<String> message) throws IOException, UnknownRequestException, ValidationException {
        String payload = message.getPayload();
        String tenantId = String.valueOf(message.getHeaders().get("fineract-platform-tenantid"));
        String entity = String.valueOf(message.getHeaders().get("x-fineract-entity"));
        String action = String.valueOf(message.getHeaders().get("x-fineract-action"));

        logger.info(String.format("paymentHook(tenantId=%s,entity=%s,action=%s,payload=%s)", tenantId, entity, action, payload));

        JSONObject jsonObject = new JSONObject(payload);
        jsonObject.put("entity", entity);
        jsonObject.put("action", action);
        jsonObject.put("tenantId", tenantId);
        String request = jsonObject.toString();

        HookHandler hookHandler =  hookHandlerFactory.buildHookHandler(entity);
        hookHandler.handleHook(request);
    }
}
