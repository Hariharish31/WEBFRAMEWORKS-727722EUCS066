package com.priyanshu.q_03.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priyanshu.q_03.model.HarishProduct;
import com.priyanshu.q_03.repository.HarishProductRepo;

@Service
public class HarishProductService {

    @Autowired
    private HarishProductRepo productRepo;

    public HarishProduct addProduct(HarishProduct product) {
        return productRepo.save(product);
    }

    public List<HarishProduct> getAllProducts() {
        return productRepo.findAll();
    }

    public Optional<HarishProduct> getProductById(int productId) {
        return productRepo.findById(productId);
    }

}
