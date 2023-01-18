package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.project.model.WishList;

public interface WishListRepository extends JpaRepository<WishList, Integer>{
	
	

}
