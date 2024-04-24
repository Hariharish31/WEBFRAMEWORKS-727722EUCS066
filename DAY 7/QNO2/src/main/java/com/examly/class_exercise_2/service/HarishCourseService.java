package com.examly.class_exercise_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.class_exercise_2.model.HarishCourse;
import com.examly.class_exercise_2.repository.HarishCourseRepo;

@Service
public class HarishCourseService {

     @Autowired
     public HarishCourseRepo courseRepo;

     public HarishCourse SaveEntity(HarishCourse entity) {
          return courseRepo.save(entity);

     }

     public List<HarishCourse> getDetails() {
          return courseRepo.findAll();

     }

     public List<HarishCourse> findByCourseName(String courseName) {
          return courseRepo.findByCourseName(courseName);
     }

}
