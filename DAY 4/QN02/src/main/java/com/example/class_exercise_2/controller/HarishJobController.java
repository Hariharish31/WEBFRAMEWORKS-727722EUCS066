package com.example.class_exercise_2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_2.model.HarishJob;
import com.example.class_exercise_2.service.HarishJobService;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController

public class HarishJobController {

     @Autowired
     public HarishJobService jobService;

     @GetMapping("/api/job")
     public ResponseEntity<List<HarishJob>> displayDetails() {
          List<HarishJob> list = jobService.getList();
          if (list.isEmpty()) {
               return new ResponseEntity<>(HttpStatus.NOT_FOUND);
          } else {

               return new ResponseEntity<>(list, HttpStatus.OK);
          }

     }

     @PostMapping("/api/job")
     public HarishJob postMethodName(@RequestBody HarishJob job) {
          return jobService.postJob(job);
     }

     @GetMapping("/api/job/{jobId}")
     public ResponseEntity<Optional<HarishJob>> getMethodName(@PathVariable int jobId) {

          Optional<HarishJob> Id = jobService.getId(jobId);
          if (Id.isPresent()) {
               return new ResponseEntity<>(Id, HttpStatus.OK);
          }
          return new ResponseEntity<Optional<HarishJob>>(Id, HttpStatus.NOT_FOUND);

     }

}