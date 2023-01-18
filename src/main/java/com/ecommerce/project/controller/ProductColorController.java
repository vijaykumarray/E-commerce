package com.ecommerce.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.model.ProductColor;
import com.ecommerce.project.service.ProductColorService;
@RestController
@RequestMapping("/productcolor")
public class ProductColorController {
	

	@Autowired
	ProductColorService colorService;
	@PostMapping("/post")
	
	public ResponseEntity<ProductColor>entity(@RequestBody ProductColor productColor) throws Exception{
		colorService.svaeProductColor(productColor);
		return new ResponseEntity<>(productColor,HttpStatus.ACCEPTED);
	}

}


