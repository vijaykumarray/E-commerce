package com.ecommerce.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	

	@Autowired
	CategoryService categoryTableService;
	
	@PostMapping("/post")
	public Category addCategory(@RequestBody Category categoryTable) {
		categoryTableService.addCategory(categoryTable);
		
		return categoryTable;
		
	}

}


