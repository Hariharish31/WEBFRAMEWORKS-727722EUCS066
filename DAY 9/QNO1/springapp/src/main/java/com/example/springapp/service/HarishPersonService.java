package com.example.springapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.model.HarishPerson;
import com.example.springapp.repository.HarishPersonRepo;

@Service
public class HarishPersonService {
    public HarishPersonRepo personRepo;

    public HarishPersonService(HarishPersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(HarishPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<HarishPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
