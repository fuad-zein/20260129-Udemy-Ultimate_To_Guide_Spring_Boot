package com.udemy.myapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.myapp.instructor.Instructor;

@RestController
public class CourseController {

  private Instructor myInstructor;

  @Autowired
  public CourseController(Instructor instructor) {
    myInstructor = instructor;
  }

  @GetMapping("/programmingexercise")
  public String getProgrammingExercise() {
    return myInstructor.getProgrammingExercises();
  }
}
