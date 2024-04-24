package com.examly.class_exercise_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.class_exercise_1.model.HarishPerson;
import com.examly.class_exercise_1.repository.HarishPersonRepo;

@Service
public class HarishPersonService {

     @Autowired
     public HarishPersonRepo personRepo;

     public HarishPerson SaveEntity(HarishPerson entity) {
          return personRepo.save(entity);

     }

     public List<HarishPerson> getDetails() {
          return personRepo.findAll();

     }

     public List<HarishPerson> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}
