package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ecommerce.project.model.Users;

@EnableJpaRepositories
public interface UsersRepository extends JpaRepository<Users, Integer>{

	Users findByEmail(String email);
}
