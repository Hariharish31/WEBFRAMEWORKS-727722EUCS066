package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.HarishStudentDetail;
import com.example.springapp.repository.HarishStudentDetailRepository;
import com.example.springapp.repository.HarishStudentRepository;

@Service
public class HarishStudentDetailService {
    @Autowired
    HarishStudentDetailRepository studentDetailRepository;
    @Autowired
    HarishStudentRepository studentRepository;
    public HarishStudentDetail addStudentDetail(int id,HarishStudentDetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }
    
    
}
