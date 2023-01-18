package com.ecommerce.project.userDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ecommerce.project.model.Users;
import com.ecommerce.project.repository.UsersRepository;

@Service

public class CustomUserDetailService implements UserDetailsService  {

	@Autowired
	UsersRepository userRepository; 
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user=userRepository.findByEmail(username);
		return user;
	}

}

