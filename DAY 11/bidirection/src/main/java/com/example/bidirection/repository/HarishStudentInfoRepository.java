package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.HarishStudentInfo;

@Repository
public interface HarishStudentInfoRepository extends JpaRepository<HarishStudentInfo,Integer>{
    
}