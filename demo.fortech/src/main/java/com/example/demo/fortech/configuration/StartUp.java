package com.example.demo.fortech.configuration;

import com.example.demo.fortech.user.User;
import com.example.demo.fortech.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StartUp {

    private final UserRepository userRepository;

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        userRepository.save(new User(1,"Bianca Receiver", "bianca.carp@fortech.ro"));
        userRepository.save(new User(2,"Bianca Sender", "bianca.carp@fortech.ro"));
    }
}
