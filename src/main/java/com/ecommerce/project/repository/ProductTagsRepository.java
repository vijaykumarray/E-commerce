package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.project.model.ProductTags;

public interface ProductTagsRepository extends JpaRepository<ProductTags, Integer>{

}
