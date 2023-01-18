package com.ecommerce.project.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecommerce.project.dto.ResponseDto;
import com.ecommerce.project.dto.SignInDto;
import com.ecommerce.project.dto.SignInResponseDto;
import com.ecommerce.project.exceptions.AuthenticationFailException;
import com.ecommerce.project.exceptions.CustomException;
import com.ecommerce.project.model.AuthenticationToken;
import com.ecommerce.project.model.Users;
import com.ecommerce.project.repository.UsersRepository;

@Service
public class UserService  {

	@Autowired
	UsersRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;
   //	UserRepo userRepo;

	@Autowired
	AuthenticationTokenService authenticationTokenService;

    //	@Transactional
	public ResponseDto signUp(Users user) {
		
		
		// check if user is already present
		if (Objects.nonNull(userRepository.findByEmail(user.getEmail()))) {
			throw new CustomException("user already present");
		}

		// hash the password
		String encryptedpassword = user.getPassword();
		try {
			encryptedpassword = passwordEncoder.encode(user.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		user.setPassword(encryptedpassword);
		userRepository.save(user);
		System.out.println("     niiii      " + user);
		// create the token

		final AuthenticationToken authenticationToken = new AuthenticationToken(user);
		authenticationTokenService.saveConfirmationToken(authenticationToken);
		ResponseDto responseDto = new ResponseDto("success", "user created successful");
		return responseDto;
	}



	public SignInResponseDto signIn(SignInDto signInDto) {
		// find user by email
		Users user = userRepository.findByEmail(signInDto.getEmail());

		if (Objects.isNull(user)) {
			throw new AuthenticationFailException("user is not valid");

		} 
		try {
			if (user.getPassword().equals(passwordEncoder.encode(signInDto.getPassword()))) {
				throw new AuthenticationFailException("Login is successful \n\tWELCOME");
			}

		} 

		catch (Exception e) {

			e.printStackTrace();
		}

		AuthenticationToken token = authenticationTokenService.getToken(user);

		

		if (Objects.isNull(token.getToken())) {

			throw new CustomException("token is not present");
		}

		return new SignInResponseDto("sucess", token.getToken());

	}



}

