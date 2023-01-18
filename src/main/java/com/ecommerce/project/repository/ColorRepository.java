package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.project.model.Color;

public interface ColorRepository extends JpaRepository<Color, Integer> {
	
	

}
