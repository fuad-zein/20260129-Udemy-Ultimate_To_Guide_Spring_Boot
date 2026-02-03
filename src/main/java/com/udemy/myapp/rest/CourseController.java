package com.udemy.myapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.myapp.common.Instructor;

@RestController
public class CourseController {

  private Instructor myInstructor;

  // ? constructor injection
  // @Autowired
  // public CourseController(Instructor instructor) {
  // myInstructor = instructor;
  // }

  // ? setter injection
  // @Autowired
  // public void setInstructor(Instructor instructor) {
  // myInstructor = instructor;
  // }

  // ? Qualifier
  @Autowired
  // public CourseController(@Qualifier("phpInstructor") Instructor instructor) {
  // myInstructor = instructor;
  // }
  public CourseController(Instructor instructor) {
    myInstructor = instructor;
  }

  @GetMapping("/programmingexercise")
  public String getProgrammingExercise() {
    return myInstructor.getProgrammingExercises();
  }
}
