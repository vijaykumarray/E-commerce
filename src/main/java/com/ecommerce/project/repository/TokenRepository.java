package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ecommerce.project.model.AuthenticationToken;
import com.ecommerce.project.model.Users;

@EnableJpaRepositories
public interface TokenRepository extends JpaRepository<AuthenticationToken, Integer>{

	AuthenticationToken findByUser(Users user);

}