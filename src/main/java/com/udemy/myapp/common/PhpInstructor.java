package com.udemy.myapp.common;

import org.springframework.stereotype.Component;

@Component
public class PhpInstructor implements Instructor {

  @Override
  public String getProgrammingExercises() {
    return "Write a program to display count, from 5 to 15";
  }

}
