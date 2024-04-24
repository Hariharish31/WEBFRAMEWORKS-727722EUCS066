package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.HarishDoor;
import java.util.List;

@Repository
public interface HarishDoorRepo extends JpaRepository<HarishDoor,Integer>{

    List<HarishDoor> findByDoorId(int doorId);
    List<HarishDoor> findByAccessType(String accessType);
    
}
