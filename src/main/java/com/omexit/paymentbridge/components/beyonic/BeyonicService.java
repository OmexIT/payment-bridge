package com.omexit.paymentbridge.components.beyonic;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

/**
 * Created by aomeri on 11/22/16.
 */
public class BeyonicService {

    public void processOutgoingPayment(Message<String> message) {
        System.out.println("Beyonic Service: " + message.getPayload());

//        return MessageBuilder.withPayload("New Message").build();
    }
}
