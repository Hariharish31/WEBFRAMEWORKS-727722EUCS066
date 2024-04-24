package com.example.class_exercise_1.service;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.class_exercise_1.model.HarishChildren;
import com.example.class_exercise_1.repository.HarishChildrenRepo;


@Service
public class ChildrenService {

     @Autowired
     public HarishChildrenRepo childrenRepo;

     public List<HarishChildren> sort(String field) {
          return childrenRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }

     public HarishChildren save(HarishChildren children) {
          return childrenRepo.save(children);

     }

     public List<HarishChildren> sortedPage(int offset, int pagesize, String field) {
          Page<HarishChildren> sortedPage = childrenRepo
                    .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
          return sortedPage.getContent();
     }

     public List<HarishChildren> pagination(int offset, int pagesize) {
          Page<HarishChildren> pages = childrenRepo.findAll(PageRequest.of(offset, pagesize));
          return pages.getContent();

     }

}
