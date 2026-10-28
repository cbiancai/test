package com.example.demo.fortech.mail;

import com.example.demo.fortech.payment.Payment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DemoService {

    private final MailService mailService;

    public void sendMail(Payment receivedMessage) {
        mailService.send(receivedMessage);
    }

}
