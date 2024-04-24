package com.example.class_exercise_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.class_exercise_2.model.HarishStudent;

@Repository
public interface HarishStudentRepo extends JpaRepository<HarishStudent, Integer> {

}