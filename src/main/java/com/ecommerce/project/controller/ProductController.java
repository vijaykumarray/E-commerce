package com.ecommerce.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.model.Product;
import com.ecommerce.project.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	

	@Autowired
	ProductService productService;
	
	@PostMapping("/post")
	public Product saveProduct(@RequestBody Product product) throws Exception {
		productService.saveProduct(product);
		return product;
	}

}



