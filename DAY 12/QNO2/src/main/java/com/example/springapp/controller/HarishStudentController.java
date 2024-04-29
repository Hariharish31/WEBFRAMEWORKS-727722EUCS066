package com.example.springapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.HarishStudent;
import com.example.springapp.service.HarishStudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class HarishStudentController{
    @Autowired
    HarishStudentService studentService;
    @PostMapping("/student")
    public ResponseEntity<HarishStudent> addStudents(@RequestBody HarishStudent student)
    {
        return new ResponseEntity<>(studentService.addStudents(student),HttpStatus.CREATED);
    }
    
    @GetMapping("/students-inner-join")
    public ResponseEntity<List<HarishStudent>>getStudentsInner()
    {
        return new ResponseEntity<>(studentService.getStudentInner(),HttpStatus.OK);
    }
    @GetMapping("/students-left-outer-join")
    public ResponseEntity<List<HarishStudent>> getStudentsLeftOuter()
    {
        return new ResponseEntity<>(studentService.getStudentLeftOuter(),HttpStatus.OK);
    }
   
}


