package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.HarishBook;

import java.util.Date;

@RestController
public class HarishBookController {

    @GetMapping("/book")
    public HarishBook getBookDetails() {
        // Creating a book object with the given details
        HarishBook book = new HarishBook("The Great Soldier", "G. Gyan", new Date());
        return book;
    }
}