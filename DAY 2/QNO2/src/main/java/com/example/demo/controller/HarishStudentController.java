package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.HarishStudent;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HarishStudentController {
    
    @GetMapping("/students")
    public HarishStudent studentdata() {
        HarishStudent u=new HarishStudent();
        u.setName("Nithish");
        u.setAge(22);
        return u;
    }
}