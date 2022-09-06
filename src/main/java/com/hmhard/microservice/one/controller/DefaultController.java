package com.hmhard.microservice.one.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DefaultController {

@GetMapping("/")
    public String index() throws Exception {
    return "Welcome to microservice controller";
}
}
