package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.project.model.City;

public interface CityRepository extends JpaRepository<City, Integer> {
	

}
