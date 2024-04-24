package com.example.class_exercise_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.class_exercise_2.model.HarishStudent;
import com.example.class_exercise_2.repository.HarishStudentRepo;

@Service
public class HarishStudentService {

     @Autowired
     public HarishStudentRepo studentRepo;

     public List<HarishStudent> getAll() {
          return studentRepo.findAll();
     }

     public HarishStudent post(HarishStudent student) {
          return studentRepo.save(student);
     }

     public List<HarishStudent> sortedDetails(String field) {
          return studentRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }
}
