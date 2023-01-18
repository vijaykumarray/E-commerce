package com.ecommerce.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.model.Sales;
import com.ecommerce.project.service.SalesService;

@RestController
@RequestMapping("/sales")
public class SalesController {
	

	@Autowired
	SalesService salesService;
	
	@PostMapping("/post")
	public Sales saveSales(@RequestBody Sales sales) throws Exception
	{
		salesService.saveSales(sales);
		return sales;
	}
}
