package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.HarishPerson;
import com.example.springapp.repository.HarishPersonRepo;

@Service
public class HarishPersonService {
    @Autowired
    private HarishPersonRepo rep;

    public boolean post(HarishPerson person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<HarishPerson> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<HarishPerson> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
