package com.ecommerce.project.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.model.Color;
import com.ecommerce.project.model.Product;
import com.ecommerce.project.model.ProductColor;
import com.ecommerce.project.repository.ColorRepository;
import com.ecommerce.project.repository.ProductColorRepository;
import com.ecommerce.project.repository.ProductRepository;

@Service
public class ProductColorService {
	

	@Autowired
	ColorRepository colorRepository;
	@Autowired
	ProductRepository productRepository;
	@Autowired
	ProductColorRepository productColorRepository;
	
	
	public void svaeProductColor(ProductColor productColor) throws Exception {
		Product product=productRepository.findById(productColor.getProductId()).orElse(null);
		Color color=colorRepository.findById(productColor.getColorId()).orElse(null);
		
		if (Objects.isNull(color)) {
			throw new Exception("no color present");
			
		}
		if (Objects.isNull(product)) {
			throw new Exception("no product");			
		}
		productColor.setColor(color);
		productColor.setProduct(product);
		productColorRepository.save(productColor);
		
	}
	
}



