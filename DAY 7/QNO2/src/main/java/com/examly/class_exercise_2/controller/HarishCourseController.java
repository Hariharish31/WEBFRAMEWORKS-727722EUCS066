package com.examly.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_2.model.HarishCourse;
import com.examly.class_exercise_2.service.HarishCourseService;

@RestController
public class HarishCourseController {

     @Autowired
     public HarishCourseService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<HarishCourse> postMethodName(@RequestBody HarishCourse entity) {

          HarishCourse inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<HarishCourse>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<HarishCourse>> getMethodName() {

          List<HarishCourse> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<HarishCourse>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<HarishCourse>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<HarishCourse> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}