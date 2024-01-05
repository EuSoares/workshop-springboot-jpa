package com.soares.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soares.Course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
	
}
