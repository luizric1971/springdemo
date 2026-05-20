package com.javalang.springdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javalang.springdemo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}