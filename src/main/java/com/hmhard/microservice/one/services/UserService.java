package com.hmhard.microservice.one.services;

import com.hmhard.microservice.one.entities.User;
import com.hmhard.microservice.one.repositories.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  public UserRepository userRepository;

  public List<User> getAllUsers() throws Exception {
    return  userRepository.findAll();
  }

  public User addUser(User user) {
    return userRepository.save(user);
  }

  public Optional<User> findById(String id) {
    return userRepository.findById(Long.parseLong(id));
  }
}
