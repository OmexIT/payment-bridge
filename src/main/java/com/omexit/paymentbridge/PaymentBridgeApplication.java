package com.omexit.paymentbridge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@Configuration
@ImportResource("integration-context.xml")
public class PaymentBridgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentBridgeApplication.class, args);
	}
}
