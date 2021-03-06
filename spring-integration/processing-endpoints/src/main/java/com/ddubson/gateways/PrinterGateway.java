package com.ddubson.gateways;

import org.springframework.messaging.Message;

import java.util.concurrent.Future;

public interface PrinterGateway {
    Future<Message<?>> print(Message<?> message);
}
