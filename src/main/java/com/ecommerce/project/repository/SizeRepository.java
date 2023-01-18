package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.project.model.Size;

public interface SizeRepository  extends JpaRepository<Size, Integer>{

}
