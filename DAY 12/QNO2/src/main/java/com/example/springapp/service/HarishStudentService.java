package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.HarishStudent;
import com.example.springapp.repository.HarishStudentRepository;

@Service
public class HarishStudentService {
    @Autowired
    HarishStudentRepository studentRepository;
    public HarishStudent addStudents(HarishStudent student)
    {
        return studentRepository.save(student);
    }
    public List<HarishStudent>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<HarishStudent>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<HarishStudent>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}
