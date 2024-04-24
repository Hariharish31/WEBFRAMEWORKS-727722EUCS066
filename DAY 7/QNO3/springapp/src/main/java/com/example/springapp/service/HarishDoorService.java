package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.HarishDoor;
import com.example.springapp.repository.HarishDoorRepo;

@Service
public class HarishDoorService {
    @Autowired
    private HarishDoorRepo rep;

    public boolean post(HarishDoor door)
    {
        try
        {
            rep.save(door);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<HarishDoor> getAll()
    {
        return rep.findAll();
    }

    public List<HarishDoor> getbyDoorId(int doorId)
    {
        return rep.findByDoorId(doorId);
    }
    public List<HarishDoor> getbyType(String type)
    {
        return rep.findByAccessType(type);
    }
    
}
