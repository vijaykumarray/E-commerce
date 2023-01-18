package com.ecommerce.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.model.AuthenticationToken;
import com.ecommerce.project.model.Users;
import com.ecommerce.project.repository.TokenRepository;

@Service
public class AuthenticationTokenService {

	@Autowired
	TokenRepository tokenRepository;
	
	public void saveConfirmationToken(AuthenticationToken authenticationToken) {
		tokenRepository.save(authenticationToken);
	}

	public AuthenticationToken getToken(Users user) {
		
		return tokenRepository.findByUser(user);
	}
}


