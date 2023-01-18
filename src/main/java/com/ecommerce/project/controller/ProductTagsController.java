package com.ecommerce.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.model.ProductTags;
import com.ecommerce.project.service.ProductTagsService;

@RestController
@RequestMapping("/producttags")
public class ProductTagsController {
	

	@Autowired
	ProductTagsService productTagsService;
	
	@PostMapping("/post")
	public ResponseEntity<ProductTags> saveProductTags(@RequestBody ProductTags productTags) throws Exception{
		productTagsService.saveProductTags(productTags);
		return new ResponseEntity<>(productTags,HttpStatus.ACCEPTED);
	}

}


