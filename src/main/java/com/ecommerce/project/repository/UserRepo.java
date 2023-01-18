package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.project.model.UserRole;

public interface UserRepo extends JpaRepository<UserRole, Integer>{

}

