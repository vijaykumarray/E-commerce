package com.ecommerce.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.model.Country;
import com.ecommerce.project.repository.CountryRepository;

@Service
public class CountryService {
	

	@Autowired
	CountryRepository countryRepository;
	
	public void country(Country countryTable) {
		countryRepository.save(countryTable);
	}
}


