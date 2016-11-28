package com.omexit.paymentbridge.core;

import com.omexit.paymentbridge.core.payment.Payment;
import org.springframework.messaging.Message;

import java.util.concurrent.Future;

/**
 * Created by aomeri on 11/28/16.
 */
public interface OutgoingPaymentGateway {
    public Future<Message<Payment>> print(Message<Payment> message);
}
