package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.HarishDoor;
import com.examly.springapp.repository.HarishDoorRepo;

@Service
public class HarishDoorService {
    @Autowired
    private HarishDoorRepo doorRepo;

    public HarishDoor postData(HarishDoor door) {
        return doorRepo.save(door);
    }

    public List<HarishDoor> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public HarishDoor updateDetail(int doorid, HarishDoor door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<HarishDoor> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<HarishDoor> getAllDetails() {

        return doorRepo.findAll();
    }

    public HarishDoor getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}