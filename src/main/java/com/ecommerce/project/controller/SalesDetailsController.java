package com.ecommerce.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.model.SalesDetails;
import com.ecommerce.project.service.SalesDetailsService;

@RestController
@RequestMapping("/salesDetails")
public class SalesDetailsController {
	
	
	@Autowired
	SalesDetailsService salesDetailsService;
	
	@PostMapping("/post")
	public ResponseEntity<SalesDetails>saveSalesDetails(@RequestBody SalesDetails details) throws Exception{
		salesDetailsService.saveSalesDetails(details);
	
		return new ResponseEntity<>(details,HttpStatus.ACCEPTED);
	}

}
