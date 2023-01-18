package com.ecommerce.project.exceptions;

@SuppressWarnings("serial")
public class CustomException extends IllegalArgumentException {

	public CustomException(String msg) {
		super(msg);
	}
}
