package com.example.class_exercise_2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.class_exercise_2.model.HarishJob;
import com.example.class_exercise_2.repository.HarishJobRepo;

@Service
public class HarishJobService {

     @Autowired
     public HarishJobRepo jobRepo;

     public List<HarishJob> getList() {
          return jobRepo.findAll();
     }

     public HarishJob postJob(HarishJob job) {
          return jobRepo.save(job);
     }

     public Optional<HarishJob> getId(int jobId) {
          return jobRepo.findById(jobId);
     }

}