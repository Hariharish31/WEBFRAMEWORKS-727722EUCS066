package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HarishApiController {
    @GetMapping("/studentName")
    public String welcomeStudent(@RequestParam(name="id") String name) {
        return "Welcome " + name + "!";
    }
}
