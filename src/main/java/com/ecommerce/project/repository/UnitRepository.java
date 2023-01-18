package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.project.model.Unit;

public interface UnitRepository extends JpaRepository<Unit, Integer> {
	
	

}
