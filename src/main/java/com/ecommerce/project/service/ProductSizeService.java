package com.ecommerce.project.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.model.Product;
import com.ecommerce.project.model.ProductSize;
import com.ecommerce.project.model.Size;
import com.ecommerce.project.repository.ProductRepository;
import com.ecommerce.project.repository.ProductSizeRepository;
import com.ecommerce.project.repository.SizeRepository;

@Service
public class ProductSizeService {
	

	@Autowired
	ProductSizeRepository productSizeRepository;
	@Autowired
	ProductRepository productRepository;
	@Autowired
	SizeRepository sizeRepository;
	
	public void saveProductSize(ProductSize productSize) throws Exception {
		
		Product product=productRepository.findById(productSize.getProductId()).orElse(null);
		Size size=sizeRepository.findById(productSize.getSizeId()).orElse(null);
		if(Objects.isNull(size)) {
			throw new Exception("size ont persent");
		}
		if (Objects.isNull(product)) {
			throw new Exception("on persent");
			
			
		}
		
		productSize.setProduct(product);
		productSize.setSize(size);
		productSizeRepository.save(productSize);
		
	}

}



