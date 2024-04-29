package com.example.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.HarishAuthor;
import com.example.q1.model.HarishBook;
import com.example.q1.repository.HarishAuthorRepository;
import com.example.q1.repository.HarishBookRepository;

@Service
public class HarishBookService {
    @Autowired
    private HarishBookRepository bookRepository;
@Autowired
private HarishAuthorRepository authorRepository;
    public HarishBook saveBook(Long authorId, HarishBook book) {
        HarishAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public HarishBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

