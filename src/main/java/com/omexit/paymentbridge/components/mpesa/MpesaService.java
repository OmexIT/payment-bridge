package com.omexit.paymentbridge.components.mpesa;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

/**
 * Created by aomeri on 11/22/16.
 */
public class MpesaService {
    public void processOutgoingPayment(Message<String> message){
        System.out.println(message.getPayload());

//        return MessageBuilder.withPayload("New Message").build();
    }
}
