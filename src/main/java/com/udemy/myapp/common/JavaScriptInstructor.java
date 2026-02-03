package com.udemy.myapp.common;

import org.springframework.stereotype.Component;

@Component
public class JavaScriptInstructor implements Instructor {

  public JavaScriptInstructor() {
    System.out.println("In consructor: " + getClass().getSimpleName());
  }

  @Override
  public String getProgrammingExercises() {
    return "Covert 120 minutes into seconds";
  }

}
