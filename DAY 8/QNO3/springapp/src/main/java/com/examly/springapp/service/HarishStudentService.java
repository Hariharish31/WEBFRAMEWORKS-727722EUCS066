package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.HarishStudent;
import com.examly.springapp.repository.HarishStudentRepo;

@Service
public class HarishStudentService {
    @Autowired
    private HarishStudentRepo studentRepo;

    public boolean post(HarishStudent student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<HarishStudent> start(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public List<HarishStudent> end(int mark) {
        return studentRepo.findByMarksLessThan(mark);
    }

}
