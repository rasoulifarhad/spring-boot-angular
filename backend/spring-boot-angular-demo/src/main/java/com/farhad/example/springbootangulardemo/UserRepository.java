package com.farhad.example.springbootangulardemo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farhad.example.springbootangulardemo.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
}
