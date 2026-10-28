package com.example.demo.fortech.rabbitmq;

import com.example.demo.fortech.configuration.RabbitMqConfig;
import com.example.demo.fortech.payment.Payment;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class Sender {

    private final RabbitTemplate template;
    private final RabbitMqConfig rabbitMqConfig;

    public void sendMsg(Payment payment) {
        template.setMessageConverter(rabbitMqConfig.converter());
        template.convertAndSend(RabbitMqConfig.EXCHANGE, RabbitMqConfig.ROUTING_KEY, payment);
    }
}
