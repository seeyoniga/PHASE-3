package com.demo;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInfo;


class RepeatedTest {
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each ");
	}
	@DisplayName ("Testcase for Multiplication")
	@RepeatedTest(5)
	 void multiply (TestInfo testInfo) 
	 {
	        int a, b;
	        a=26;
	        b=10;
	        assertEquals(260, (a*b));
	}

}
