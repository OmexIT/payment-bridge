package com.omexit.paymentbridge.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.omexit.paymentbridge")
public class FeignConfig {
}
