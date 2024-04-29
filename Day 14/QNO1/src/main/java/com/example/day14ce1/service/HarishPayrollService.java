package com.example.day14ce1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.model.HarishPayroll;
import com.example.day14ce1.repository.HarishPayrollRepo;

@Service
public class HarishPayrollService {
    @Autowired
    HarishPayrollRepo payrollRepo;

    public HarishPayroll addPayroll(Long id,HarishPayroll payroll)
    {
        HarishPayroll avail = payrollRepo.findById(id).orElse(null);

        if(avail!=null){
            avail.setAmount(payroll.getAmount());
            avail.setNoOfDaysWorked(payroll.getNoOfDaysWorked());
        return payrollRepo.save(avail);
        }
        else 
        return null;
    }

    public Optional<HarishPayroll> getPayroll(Long employeeId)
    {
        return payrollRepo.findById(employeeId);
    }
}
