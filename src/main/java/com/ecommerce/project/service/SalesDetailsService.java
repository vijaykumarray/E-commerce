package com.ecommerce.project.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.model.Product;
import com.ecommerce.project.model.Sales;
import com.ecommerce.project.model.SalesDetails;
import com.ecommerce.project.repository.ProductRepository;
import com.ecommerce.project.repository.SalesDetailsRepository;
import com.ecommerce.project.repository.SalesRepository;

@Service
public class SalesDetailsService {
	

	@Autowired
	SalesDetailsRepository detailsRepository;
	
	@Autowired
	SalesRepository repository;
	
	@Autowired
	ProductRepository productRepository;
	
	
	public void saveSalesDetails(SalesDetails details) throws Exception {
		Sales sales=repository.findById(details.getSalesId()).orElse(null);
		Product product =productRepository.findById(details.getProductId()).orElse(null);
		
		if (Objects.isNull(product)) {
			throw new Exception("product no");
			
		}
		if (Objects.isNull(sales)) {
			throw new Exception("not availble sales");
		}
		
		details.setProduct(product);
		details.setSales(sales);
		detailsRepository.save(details);
	}

}



