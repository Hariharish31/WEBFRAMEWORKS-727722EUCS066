package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.AppConfig;

@RestController
@RequestMapping("/info")
public class ApiController {

    @GetMapping
    public String getInfo() {
        return "App Name: " + AppConfig.getAppName() + ", Version: " + AppConfig.getAppVersion();
    }
}
