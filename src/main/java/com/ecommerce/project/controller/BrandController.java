package com.ecommerce.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.model.Brand;
import com.ecommerce.project.service.BrandService;

@RestController
@RequestMapping("/brand")
public class BrandController {


	@Autowired
	BrandService brandTableService;
	
	@PostMapping("/post")
	public Brand brandAdd(@RequestBody Brand brandTable) {
		
		brandTableService.brandAdd(brandTable);
		return brandTable;
	}

}

	

