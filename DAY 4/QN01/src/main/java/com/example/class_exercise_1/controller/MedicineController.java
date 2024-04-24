package com.example.class_exercise_1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_1.model.HarishMedicine;
import com.example.class_exercise_1.service.HarishMedicineService;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class MedicineController {

     @Autowired
     public HarishMedicineService medicineService;

     @GetMapping("/api/medicines")
     public ResponseEntity<List<HarishMedicine>> getMethodName() {

          List<HarishMedicine> medicines = medicineService.getAllMedicines();
          if (medicines.isEmpty()) {
               return new ResponseEntity<>(medicines, HttpStatus.NOT_FOUND);

          } else {

               return new ResponseEntity<>(medicines, HttpStatus.CREATED);
          }
     }

     @PostMapping("/api/medicine")
     public ResponseEntity<HarishMedicine> postMethodName(@RequestBody HarishMedicine medicine) {

          HarishMedicine tablet = medicineService.addMedicine(medicine);
          return new ResponseEntity<>(tablet, HttpStatus.OK);
     }

     @GetMapping("/api/medicine/{medicineId}")
     public ResponseEntity<Optional<HarishMedicine>> SearchMedicine(@PathVariable int medicineId) {
          Optional<HarishMedicine> search = medicineService.getRequiredMedicin(medicineId);
          if (search.isPresent()) {

               return new ResponseEntity<>(search, HttpStatus.OK);
          } else {
               return new ResponseEntity<>(search, HttpStatus.NOT_FOUND);
          }

     }

}
