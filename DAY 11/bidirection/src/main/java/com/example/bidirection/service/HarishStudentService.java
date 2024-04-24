package com.example.bidirection.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.model.HarishStudent;
import com.example.bidirection.model.HarishStudentInfo;
import com.example.bidirection.repository.HarishStudentInfoRepository;
import com.example.bidirection.repository.HarishStudentRepository;

@Service
public class HarishStudentService {
    public HarishStudentRepository studentRepository;
    public HarishStudentInfoRepository studentInfoRepository;
    public HarishStudentService(HarishStudentRepository studentRepository,HarishStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public HarishStudent saveStudent(HarishStudent student)
    {
        return studentRepository.save(student);
    }
    public HarishStudentInfo saveStudentInfo(HarishStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<HarishStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
