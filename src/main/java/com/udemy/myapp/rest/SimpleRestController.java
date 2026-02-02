package com.udemy.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SimpleRestController {

  // ? add properties for: instructor.name & student.class
  @Value("${instructor.name}")
  private String instructorName;

  @Value("${student.class}")
  private String studentClass;

  // ? expose "/" that returns "My Application"
  @GetMapping("/")
  public String app() {
    return "My Application.";
  }

  // ? expose new endpoint for learning
  @GetMapping("/learning")
  public String getLearningGoals() {
    return "Learn 4 modules each day!";
  }

  // ? expose new endpoint for gaming
  @GetMapping("/gaming")
  public String getDailyLevels() {
    return "Comlete 10 levels per day!";
  }

  // ? expose a new endpoint for classInfo
  @GetMapping("/classinfo")
  public String getClassInfo() {
    return "Instructor: " + instructorName + ", Class: " + studentClass;
  }
}
