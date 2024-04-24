package com.priyanshu.q_04.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priyanshu.q_04.model.HarishPatient;
import com.priyanshu.q_04.repository.HarishPatientRepo;

@Service
public class HarishPatientService {

    @Autowired
    private HarishPatientRepo patientRepo;

    public List<HarishPatient> getAllPatients() {
        return patientRepo.findAll();
    }

    public Optional<HarishPatient> getPatientById(int id) {
        return patientRepo.findById(id);
    }

    public HarishPatient addPatient(HarishPatient patient) {
        return patientRepo.save(patient);
    }

}