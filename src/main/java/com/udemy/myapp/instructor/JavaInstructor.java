package com.udemy.myapp.instructor;

import org.springframework.stereotype.Component;

@Component
public class JavaInstructor implements Instructor {

  @Override
  public String getProgrammingExercises() {
    return "Write a method that sums two numbers";
  }

}
