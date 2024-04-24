package com.example.class_exercise_1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.class_exercise_1.model.HarishMedicine;
import com.example.class_exercise_1.repository.HarishMedicineRepository;

@Service
public class HarishMedicineService {

     @Autowired
     HarishMedicineRepository medicineRepository;

     public List<HarishMedicine> getAllMedicines() {
          // List<Medicine> list ;
          return medicineRepository.findAll();
     }

     public HarishMedicine addMedicine(HarishMedicine medicine) {
          return medicineRepository.save(medicine);
     }

     public Optional<HarishMedicine> getRequiredMedicin(int medicineId) {
          return medicineRepository.findById(medicineId);
     }

}
