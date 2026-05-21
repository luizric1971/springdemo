package com.javalang.springdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javalang.springdemo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}