package com.priyanshu.q_03.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.priyanshu.q_03.model.HarishProduct;
import com.priyanshu.q_03.service.HarishProductService;

@RestController
@RequestMapping("api")
public class HarishProductController {

    @Autowired
    HarishProductService productService;

    @PostMapping("/product/add")
    @ResponseStatus(HttpStatus.CREATED)
    public HarishProduct getAllProduct(@RequestBody HarishProduct product) {
        return productService.addProduct(product);
    }

    @GetMapping("/product")
    public ResponseEntity<List<HarishProduct>> getMethodName() {
        List<HarishProduct> list = productService.getAllProducts();

        if (list.isEmpty()) {
            return new ResponseEntity<>(new ArrayList<HarishProduct>(), HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<HarishProduct> getMethodName(@PathVariable int productId) {
        Optional<HarishProduct> product = productService.getProductById(productId);

        if (product.isPresent()) {
            return new ResponseEntity<>(product.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

}