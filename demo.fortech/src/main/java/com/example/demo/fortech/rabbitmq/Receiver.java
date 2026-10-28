package com.example.demo.fortech.rabbitmq;

import com.example.demo.fortech.configuration.RabbitMqConfig;
import com.example.demo.fortech.mail.DemoService;
import com.example.demo.fortech.payment.Payment;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class Receiver {
    private final DemoService demoService;

    @RabbitListener(queues = RabbitMqConfig.QUEUE)
    public void consumeMessageFromQueue(Payment message) {
        demoService.sendMail(message);
    }

}
