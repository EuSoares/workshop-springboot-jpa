package com.soares.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soares.Course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
	
}
