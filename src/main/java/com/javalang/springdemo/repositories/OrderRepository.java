package com.javalang.springdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javalang.springdemo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}