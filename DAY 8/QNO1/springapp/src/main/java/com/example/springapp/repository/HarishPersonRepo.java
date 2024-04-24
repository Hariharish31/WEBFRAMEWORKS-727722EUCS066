package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.HarishPerson;
import java.util.List;


@Repository
public interface HarishPersonRepo extends JpaRepository<HarishPerson,Integer>{

    List<HarishPerson> findByNameStartingWith(String name);
    List<HarishPerson> findByNameEndingWith(String name);
    
}
