package com.example.day14ce2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14ce2.model.HarishBook;
import com.example.day14ce2.service.HarishBookService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Book Controller" ,description = "null")
public class HarishBookController {
    @Autowired
    HarishBookService bookService;

    @PostMapping("/api/book")
    public HarishBook addBook(@RequestBody HarishBook book)
    {
        return bookService.addBook(book);
    }

    @PutMapping("/api/book/{id}")
    public HarishBook updateBook(@PathVariable int id,@RequestBody HarishBook book)
    {
        return bookService.updateBook(id,book);
    }

    @GetMapping("/api/book")
    public List<HarishBook> getBooks()
    {
        return bookService.getBooks();
    }

    @GetMapping("/api/book/{id}")
    public Optional<HarishBook> getBook(@PathVariable int id)
    {
        return bookService.getBook(id);
    }
}
