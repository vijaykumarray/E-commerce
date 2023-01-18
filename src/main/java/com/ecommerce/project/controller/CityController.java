package com.ecommerce.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.model.City;
import com.ecommerce.project.model.Country;
import com.ecommerce.project.service.CityService;
import com.ecommerce.project.service.CountryService;

@RestController
@RequestMapping("/mapping")
public class CityController {
	

	@Autowired
	CityService cityService;

	@Autowired
	CountryService countryService;

	@PostMapping("/test")
	public ResponseEntity<City> saveCity(@RequestBody City city) throws Exception {
		cityService.saveCity(city);
		return ResponseEntity.ok(city);
	}

	@PostMapping("/amzing")
	public Country country(@RequestBody Country country) {
		countryService.country(country);
		return country;
	}
	@GetMapping("/get")
	public List<City>gett(){
		return cityService.getAll();
	}
	
	@PutMapping("/put")
	public City udateCity(@RequestBody City cityTable) {
		cityService.putCity(cityTable);
		return cityTable;
	}

}



