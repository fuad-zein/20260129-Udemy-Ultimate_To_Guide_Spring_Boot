package com.udemy.myapp.common;

import org.springframework.stereotype.Component;

@Component
public class JavaScriptInstructor implements Instructor {

  @Override
  public String getProgrammingExercises() {
    return "Covert 120 minutes into seconds";
  }

}
