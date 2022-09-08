package com.hmhard.microservice.one.controllers;

import static org.junit.jupiter.api.Assertions.*;

import com.hmhard.microservice.one.entities.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DefaultControllerTest {

  @BeforeEach
  void setUp() {
    System.out.println("setUp");
  }

  @Test
  void index() {
    System.out.println("index");
    assert 0!=1;
  }

  @Test
  void getAllUsers() {
    User user = User.builder().firstName("John").gender("M").build();
   assert(user != null);
  }
}