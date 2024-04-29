package com.example.ce1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.HarishAddress;
import com.example.ce1.repository.HarishAddressRepo;
import com.example.ce1.repository.HarishEmployeeRepo;

@Service
public class HarishAddressService {
    @Autowired
    HarishAddressRepo addressRepo;
    @Autowired
    HarishEmployeeRepo employeeRepo;
    public HarishAddress setAddressById(int id,HarishAddress address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
