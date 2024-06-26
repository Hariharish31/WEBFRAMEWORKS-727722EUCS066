package com.example.day6cw3.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cw3.model.HarishProduct;
import com.example.day6cw3.repository.HarishProductRepo;

@Service
public class HarishProductService {
    public HarishProductRepo productRepo;
    public HarishProductService(HarishProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(HarishProduct product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<HarishProduct> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<HarishProduct> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public HarishProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
