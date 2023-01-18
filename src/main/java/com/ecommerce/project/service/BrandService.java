package com.ecommerce.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.model.Brand;
import com.ecommerce.project.repository.BrandRepository;

@Service
public class BrandService {

	@Autowired
	BrandRepository brandRepository;
	
	
	public void brandAdd(Brand brand) {
		brandRepository.save(brand);
	}

}



