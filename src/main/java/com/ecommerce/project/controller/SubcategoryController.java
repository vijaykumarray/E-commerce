package com.ecommerce.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.model.Subcategory;
import com.ecommerce.project.service.SubcategoryService;

@RestController
@RequestMapping("/subcategory")
public class SubcategoryController {
	

	@Autowired
	SubcategoryService subcategoryTableService;
	
	@PostMapping("/post")
	public Subcategory saveSub(@RequestBody Subcategory subcategoryTable) {
		subcategoryTableService.saveSubTable(subcategoryTable);
		return subcategoryTable; 
	}

}



