package com.udemy.myapp.common;

import org.springframework.stereotype.Component;

@Component
public class PythonInstructor implements Instructor {

  public PythonInstructor() {
    System.out.println("In consructor: " + getClass().getSimpleName());
  }

  @Override
  public String getProgrammingExercises() {
    return "Calculate the area of a triangle";
  }

}
