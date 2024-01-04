package com.soares.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soares.Course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
	
}
