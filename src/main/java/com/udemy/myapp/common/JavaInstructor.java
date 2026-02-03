package com.udemy.myapp.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class JavaInstructor implements Instructor {

  @Override
  public String getProgrammingExercises() {
    return "Write a method that sums two numbers";
  }

}
