package com.examly.class_exercise_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_1.model.HarishPerson;
import com.examly.class_exercise_1.service.HarishPersonService;

@RestController
public class HarishPersonController {

     @Autowired
     public HarishPersonService personService;

     @PostMapping("/api/person")
     public ResponseEntity<HarishPerson> postMethodName(@RequestBody HarishPerson entity) {

          HarishPerson inst = personService.SaveEntity(entity);

          return new ResponseEntity<HarishPerson>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<HarishPerson>> getMethodName() {

          List<HarishPerson> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<HarishPerson>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<HarishPerson>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<HarishPerson> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}