package com.ecommerce.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.model.Subcategory;
import com.ecommerce.project.repository.SubcategoryRepository;

@Service
public class SubcategoryService {
	

	@Autowired
	SubcategoryRepository subcategoryRepository;
	
	public void saveSubTable(Subcategory subcategoryTable) {
		subcategoryRepository.save(subcategoryTable);
	}

}


