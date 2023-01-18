package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.project.model.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Integer> {
	
	

}
