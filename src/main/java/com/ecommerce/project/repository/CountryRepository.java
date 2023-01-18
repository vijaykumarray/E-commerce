package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.project.model.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {
	

}
