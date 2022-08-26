package com.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AuthenticateUser {

private User user;
	
	@BeforeEach
	public void setup() {
		user= new User();
		System.out.println("User class Initiated");
	}
	
	@AfterEach
	public void tearDown() {
		user=null;
		System.out.println("User class Closed");
	}
	@Test
	public void usernamenotnulltest() {
		assertNotNull(user.username());
	}
	@Test
	public void passwordnotnulltest() {
			assertNotNull(user.password());
	}
	@Test
	public void usernamevalidtest() {
		assertEquals("seeyo",user.username());
	}
	@Test
	public void passwordvalidtest() {
		assertEquals("seeyo",user.password());
	}
	
}
