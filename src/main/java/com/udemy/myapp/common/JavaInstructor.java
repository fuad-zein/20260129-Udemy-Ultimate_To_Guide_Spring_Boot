package com.udemy.myapp.common;

import org.springframework.stereotype.Component;

// @Primary
@Component
public class JavaInstructor implements Instructor {

  public JavaInstructor() {
    System.out.println("In consructor: " + getClass().getSimpleName());
  }

  @Override
  public String getProgrammingExercises() {
    return "Write a method that sums two numbers";
  }

}
