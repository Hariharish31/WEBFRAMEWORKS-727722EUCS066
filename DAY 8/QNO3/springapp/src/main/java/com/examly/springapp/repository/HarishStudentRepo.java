package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.examly.springapp.model.HarishStudent;
import java.util.List;

@Repository
public interface HarishStudentRepo extends JpaRepository<HarishStudent, Long> {

    List<HarishStudent> findByMarksGreaterThan(int mark);

    List<HarishStudent> findByMarksLessThan(int mark);

}
