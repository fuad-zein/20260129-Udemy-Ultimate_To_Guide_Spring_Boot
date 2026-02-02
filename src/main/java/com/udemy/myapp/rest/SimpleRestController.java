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

  // expose new endpoint for learning
  @GetMapping("/learning")
  public String getLearningGoals() {
    return "Learn 4 modules each day!";
  }

  // expose new endpoint for gaming
  @GetMapping("/gaming")
  public String getDailyLevels() {
    return "Comlete 10 levels per day!";
  }
}
