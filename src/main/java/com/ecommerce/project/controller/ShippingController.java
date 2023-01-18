package com.ecommerce.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.model.Shipping;
import com.ecommerce.project.service.ShipppingService;

@RestController
@RequestMapping("/shpping")
public class ShippingController {
	

	@Autowired
	ShipppingService shippingService;
	
	@PostMapping("/post")
	public ResponseEntity<Shipping> saveShipping(@RequestBody Shipping shipping) throws Exception{
		shippingService.saveShipping(shipping);
		return new ResponseEntity<>(shipping,HttpStatus.ACCEPTED);
	}
}

	
	


