package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class democontroller {

    @GetMapping("/welcome")

    
    public String greetingss(){
        return "Welcome Spring Boot!";
    }
}

