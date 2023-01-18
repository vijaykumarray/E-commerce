package com.ecommerce.project.exceptions;

@SuppressWarnings("serial")
public class AuthenticationFailException extends IllegalArgumentException{

	public AuthenticationFailException(String msg) {
		super(msg);
	}
}
