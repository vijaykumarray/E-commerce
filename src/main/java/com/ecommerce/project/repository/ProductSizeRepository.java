package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.project.model.ProductSize;

public interface ProductSizeRepository extends JpaRepository<ProductSize, Integer> {

}
