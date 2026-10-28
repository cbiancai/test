package com.example.demo.fortech.user;

import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
  
  private final UserRepository userRepository;
  
  @Cacheable(cacheNames = "user", key = "#userId")
  public User getUser(Integer userId) {
    Optional<User> user = userRepository.findByUserId(userId);
    log.info("User: " + user.get().getName() +" received from data base");
    return user.get();
  }

}
