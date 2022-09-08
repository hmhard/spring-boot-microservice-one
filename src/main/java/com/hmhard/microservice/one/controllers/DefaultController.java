package com.hmhard.microservice.one.controllers;

import com.hmhard.microservice.one.entities.User;
import com.hmhard.microservice.one.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @Autowired
    public UserService userService;
@GetMapping("/")
    public String  index() throws Exception {
    return "Welcome to microservice controller";
}
    @GetMapping("/allUsers")
    public List<User> getAllUsers() throws Exception {
        return userService.getAllUsers();
    }
}
