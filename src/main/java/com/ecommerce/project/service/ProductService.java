package com.ecommerce.project.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.model.Brand;
import com.ecommerce.project.model.Product;
import com.ecommerce.project.model.Subcategory;
import com.ecommerce.project.model.Unit;
import com.ecommerce.project.repository.BrandRepository;
import com.ecommerce.project.repository.ProductRepository;
import com.ecommerce.project.repository.SubcategoryRepository;
import com.ecommerce.project.repository.UnitRepository;

@Service
public class ProductService {
	

	@Autowired
	ProductRepository productRepository;

	@Autowired
	BrandRepository brandRepository;
	
	@Autowired
	SubcategoryRepository subCategoryRepo;
	
	@Autowired
	UnitRepository unitRepo;

	public void saveProduct(Product product) throws Exception
	{
	Brand brand=brandRepository.findById(product.getBrandId()).orElse(null);
	Subcategory subcategory=subCategoryRepo
			.findById(product.getSubcategoryId()).orElse(null);
	Unit unit=unitRepo.findById(product.getUnitId()).orElse(null);
	
	if (Objects.isNull(unit)) {
		throw new Exception("no unit table present");
		
	}if (Objects.isNull(subcategory)) {
		throw new Exception("no subcategory");
		
	}if (Objects.isNull(brand)) {
		throw new Exception("no brand");
		
	}
		
		product.setBrand(brand);
		product.setSubcategory(subcategory);
		product.setUnit(unit);
		
		
//		productTable.setBrandId(productTableRepo.getById(1));
//		productTable.setUnitId();
//		productTable.setSubcategoryId();
		productRepository.save(product);
	}

}



