package com.example.day14ce1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.model.HarishEmployee;
import com.example.day14ce1.repository.HarishEmployeeRepo;

@Service

public class HarishEmployeeService {
    @Autowired
    HarishEmployeeRepo employeeRepo;

    public HarishEmployee addEmployee(HarishEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<HarishEmployee> getEmployees()
    {
        return employeeRepo.findAll();
    }

    public Optional<HarishEmployee> getEmployee(Long employeeId)
    {
        return employeeRepo.findById(employeeId);
    }

}
