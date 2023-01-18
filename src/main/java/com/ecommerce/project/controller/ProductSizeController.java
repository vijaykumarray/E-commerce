package com.ecommerce.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.model.ProductSize;
import com.ecommerce.project.service.ProductSizeService;

@RestController
@RequestMapping("/productsize")
public class ProductSizeController {
	

	@Autowired
	ProductSizeService productSizeService;
	
	@PostMapping("/post")
	public ResponseEntity<ProductSize> saveProductSize(@RequestBody ProductSize productSize) throws Exception
	{
		productSizeService.saveProductSize(productSize);
		return new ResponseEntity<>(productSize, HttpStatus.ACCEPTED );
	}

}



