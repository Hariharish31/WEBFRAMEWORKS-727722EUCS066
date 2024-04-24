package com.priyanshu.q_03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.priyanshu.q_03.model.HarishProduct;

@Repository
public interface HarishProductRepo extends JpaRepository<HarishProduct, Integer> {

}
