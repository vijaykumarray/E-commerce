package com.ecommerce.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.model.Size;
import com.ecommerce.project.service.SizeService;

@RestController
@RequestMapping("/size")
public class SizeController {
	

	@Autowired
	SizeService sizeService;
	
	@PostMapping("/post")
	public ResponseEntity<Size> saveSize(@RequestBody Size size){
		sizeService.saveSize(size);
		return new ResponseEntity<>(size, HttpStatus.ACCEPTED);
	}

}


