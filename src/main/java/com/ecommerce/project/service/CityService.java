package com.ecommerce.project.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.model.City;
import com.ecommerce.project.model.Country;
import com.ecommerce.project.repository.CityRepository;
import com.ecommerce.project.repository.CountryRepository;

@Service
public class CityService {
	

	@Autowired
	CityRepository cityRepository;
	
	@Autowired
	CountryRepository countryRepository;

	public void saveCity(City city) throws Exception {
		
	Country country	=countryRepository.findById(city.getCountryId()).orElse(null);
    //CountryTable countryTable=new CountryTable();
		if (Objects.isNull(country)) {
			throw new Exception("sfdfd");
			
		}
		city.setCountry(country);
		cityRepository.save(city);
	}
	public List<City>getAll(){
	return	cityRepository.findAll();
	}
	//Modification
	public City putCity(City city) {
		cityRepository.save(city);
		return city;
	}
}




