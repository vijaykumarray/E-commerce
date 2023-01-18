package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.project.model.SalesDetails;

public interface SalesDetailsRepository extends JpaRepository<SalesDetails, Integer> {

}
