package com.example.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.HarishAuthor;
import com.example.q1.repository.HarishAuthorRepository;

@Service
public class HarishAuthorService {
    @Autowired
    private HarishAuthorRepository authorRepository;

    public HarishAuthor saveAuthor(HarishAuthor author) {
        return authorRepository.save(author);
    }

    public HarishAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<HarishAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public HarishAuthor updateAuthor(Long id, HarishAuthor author) {
        HarishAuthor existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
