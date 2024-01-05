package com.soares.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soares.Course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
	
}
