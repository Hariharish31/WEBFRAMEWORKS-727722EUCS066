package com.example.day14ce2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce2.model.HarishBook;
import com.example.day14ce2.repository.HarishBookRepo;

@Service
public class HarishBookService {
   @Autowired
   HarishBookRepo bookRepo;

   public HarishBook addBook(HarishBook book)
   {
        return bookRepo.save(book);
   }

   public List<HarishBook> getBooks()
   {
        return bookRepo.findAll();
   }

   public Optional<HarishBook> getBook(int id)
   {
    return bookRepo.findById(id);
   }

   public HarishBook updateBook(int id,HarishBook book)
   {
        HarishBook avail = bookRepo.findById(id).orElse(null);
        if(avail!=null)
        {
            avail.setAuthor(book.getAuthor());
            avail.setAvailableCopies(book.getAvailableCopies());
            avail.setTitle(book.getTitle());
            avail.setTotalCopies(book.getTotalCopies());
            return bookRepo.save(avail);
        }
        else 
        return null;
   }
}
