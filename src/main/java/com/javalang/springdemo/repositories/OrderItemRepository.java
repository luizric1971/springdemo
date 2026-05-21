package com.javalang.springdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javalang.springdemo.entities.OrderItem;
import com.javalang.springdemo.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}