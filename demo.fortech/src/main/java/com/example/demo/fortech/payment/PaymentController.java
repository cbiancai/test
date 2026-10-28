package com.example.demo.fortech.payment;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/payment")
public class PaymentController {
  
  private final PaymentService paymentService;

  @PostMapping()
  public String makePayment(@RequestBody Payment payment) {
     paymentService.makePayment(payment);
     return "Message was sent successfully";
  }

}