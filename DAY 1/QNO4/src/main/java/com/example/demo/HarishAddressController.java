package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HarishAddressController {
    @GetMapping("/address")
    public HarishAddress addressobject(){
        HarishAddress obj = new HarishAddress();
        obj.setName("Harish");
        obj.setDoorNo(123);
        obj.setStreetName("Grandff Road");
        obj.setPincode(643215);
        obj.setArea("Ketti");
        obj.setDistrict("Niligiri");
        obj.setState("Tamil Nadu");
        obj.setCountry("India");
        return obj;
    }
}