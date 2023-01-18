package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.project.model.Tags;

public interface TagsRepository extends JpaRepository<Tags, Integer> {
	

}
