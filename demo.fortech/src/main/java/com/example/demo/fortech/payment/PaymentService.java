package com.example.demo.fortech.payment;

import com.example.demo.fortech.rabbitmq.Sender;
import com.example.demo.fortech.user.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static java.text.MessageFormat.format;

@RequiredArgsConstructor
@Service
@Slf4j
public class PaymentService {
  
  private final Sender sender;

  void makePayment(Payment payment) {
    sender.sendMsg(payment);
    log.info(format("Your payment {0} was completed successfully!", payment.getAmount()));
  }

}
