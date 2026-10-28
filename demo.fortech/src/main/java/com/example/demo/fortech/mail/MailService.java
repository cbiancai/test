package com.example.demo.fortech.mail;

import com.example.demo.fortech.payment.Payment;
import com.example.demo.fortech.user.User;
import com.example.demo.fortech.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MailService {
  
  private final JavaMailSender javaMailSender;
  private final UserService userService;

  public void send(Payment message) {
    User receiver = userService.getUser(message.getReceiverId());
    User sender = userService.getUser(message.getUserId());
    SimpleMailMessage mail = new SimpleMailMessage();

    mail.setFrom("carpbianca98@yahoo.com");
    mail.setTo(receiver.getMail());

    mail.setSubject("Demo");
    mail.setText("Hello " + receiver.getName() + "! This is the e-mail received from my demo application. " +
            "You received " + message.getAmount() + " from " + sender.getName() + "!");
    
    javaMailSender.send(mail);
  }
  
}
