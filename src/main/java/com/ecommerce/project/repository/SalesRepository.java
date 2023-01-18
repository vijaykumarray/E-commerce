package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.project.model.Sales;



public interface SalesRepository extends JpaRepository<Sales, Integer> {

}
