package com.examly.class_exercise_1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.class_exercise_1.model.HarishPerson;

/**
 * PersonRepo
 */
@Repository
public interface HarishPersonRepo extends JpaRepository<HarishPerson, Integer> {

     List<HarishPerson> findByAge(int byAge);
}