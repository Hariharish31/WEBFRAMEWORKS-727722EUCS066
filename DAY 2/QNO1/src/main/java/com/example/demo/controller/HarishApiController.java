package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.HarishAppConfig;

@RestController
@RequestMapping("/info")
public class HarishApiController {

    @GetMapping("/app")
    public String getInfo() {
        return "App Name: " + HarishAppConfig.getAppName() + ", Version: " + HarishAppConfig.getAppVersion();
    }
}
