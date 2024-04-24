package com.example.bidirection.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.model.HarishStudent;
import com.example.bidirection.model.HarishStudentInfo;
import com.example.bidirection.service.HarishStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class HarishStudentController {
    public HarishStudentService studentService;
    public HarishStudentController(HarishStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public HarishStudent postMethodName(@RequestBody HarishStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public HarishStudentInfo postMethodName(@RequestBody HarishStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<HarishStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}