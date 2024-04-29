package com.example.ce1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.HarishEmployee;
import com.example.ce1.repository.HarishEmployeeRepo;

@Service
public class HarishEmployeeService {
    @Autowired
    HarishEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public HarishEmployee setEmployee(HarishEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<HarishEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<HarishEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
