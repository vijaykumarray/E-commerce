package com.ecommerce.project.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.model.Product;
import com.ecommerce.project.model.ProductTags;
import com.ecommerce.project.model.Tags;
import com.ecommerce.project.repository.ProductRepository;
import com.ecommerce.project.repository.ProductTagsRepository;
import com.ecommerce.project.repository.TagsRepository;

@Service
public class ProductTagsService {
	

	@Autowired
	ProductTagsRepository productTagsRepository;
	@Autowired
	TagsRepository tagsRepository;
	@Autowired
	ProductRepository productRepository;
	
	
	public void saveProductTags(ProductTags productTags) throws Exception {
		Tags tags=tagsRepository.findById(productTags.getTagsId()).orElse(null);
		Product product=productRepository.findById(productTags.getProductId()).orElse(null);
		if (Objects.isNull(product)) {
			throw new Exception("product value no persent");
			
		}
		if (Objects.isNull(tags)) {
			throw new Exception("on tags");
			
		}
		
		productTags.setProduct(product);
		productTags.setTags(tags);
		productTagsRepository.save(productTags);
	}

}



