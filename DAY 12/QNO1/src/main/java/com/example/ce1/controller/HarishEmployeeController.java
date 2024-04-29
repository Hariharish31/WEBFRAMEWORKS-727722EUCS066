package com.example.ce1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce1.model.HarishEmployee;
import com.example.ce1.service.HarishEmployeeService;

@RestController
public class HarishEmployeeController {
    @Autowired
    HarishEmployeeService employeeService;

    @PostMapping("/employee")
    public HarishEmployee setMethod(@RequestBody HarishEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<HarishEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<HarishEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
