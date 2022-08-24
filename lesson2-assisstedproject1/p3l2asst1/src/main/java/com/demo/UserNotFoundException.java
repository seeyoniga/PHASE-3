package com.demo;

import java.util.Arrays;

public class UserNotFoundException extends Exception {

	public UserNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserNotFoundException [NOT FOUND WITH UID AS 0]";
	}
	
}
