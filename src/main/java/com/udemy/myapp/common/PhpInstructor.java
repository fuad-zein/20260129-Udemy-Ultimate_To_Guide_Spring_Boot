package com.udemy.myapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class PhpInstructor implements Instructor {

  public PhpInstructor() {
    System.out.println("In consructor: " + getClass().getSimpleName());
  }

  @Override
  public String getProgrammingExercises() {
    return "Write a program to display count, from 5 to 15";
  }

}
