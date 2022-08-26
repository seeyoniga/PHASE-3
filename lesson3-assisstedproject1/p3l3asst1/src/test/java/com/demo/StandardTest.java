package com.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StandardTest {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("This method beforeAll is called Before executing any Test");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("This method beforeEach is called Before Each Test ");
	}
	@Test
	public void testOne() {
		System.out.println("Test:1");
	}
	@Test
	public void testtwo() {
		System.out.println("Test:2");
	}
	@AfterEach
	public void afterEach() {
		System.out.println("This method afterEach is called After Each Test");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("This method afterAll is called after executing all the Test ");
	}
	

}
