package com.example.q1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.q1.model.HarishBook;
import com.example.q1.service.HarishBookService;

@RestController
public class HarishBookController {
    @Autowired
    private HarishBookService bookService;

    @GetMapping("/book/{bookId}")
    public ResponseEntity<HarishBook> getBookById(@PathVariable Long bookId) {
        HarishBook book = bookService.getBookById(bookId);
        if (book != null) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
