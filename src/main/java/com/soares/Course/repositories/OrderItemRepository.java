package com.soares.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soares.Course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	
	
}
