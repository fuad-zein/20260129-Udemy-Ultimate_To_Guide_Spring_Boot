package com.udemy.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SimpleRestController {

  // expose "/" that returns "My Application"
  @GetMapping("/")
  public String app() {
    return "My Application.";
  }
}
