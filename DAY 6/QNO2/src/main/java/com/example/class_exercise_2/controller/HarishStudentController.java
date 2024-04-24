package com.example.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_2.model.HarishStudent;
import com.example.class_exercise_2.service.HarishStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class HarishStudentController {

     @Autowired
     public HarishStudentService studentService;

     @GetMapping("/api/student")
     public ResponseEntity<List<HarishStudent>> getDetails() {
          List<HarishStudent> list = studentService.getAll();
          if (list.isEmpty()) {
               return new ResponseEntity<List<HarishStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<HarishStudent>>(list, HttpStatus.OK);

     }

     @PostMapping("/api/student")
     public ResponseEntity<HarishStudent> postMethodName(@RequestBody HarishStudent student) {

          HarishStudent postData = studentService.post(student);
          return new ResponseEntity<>(postData, HttpStatus.OK);
     }

     @GetMapping("/api/student/sort/{field}")
     public ResponseEntity<List<HarishStudent>> sortedDetails(@PathVariable String field) {
          List<HarishStudent> list = studentService.sortedDetails(field);
          if (list.isEmpty()) {
               return new ResponseEntity<List<HarishStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<HarishStudent>>(list, HttpStatus.OK);

     }
}
