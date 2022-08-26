package com.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class NestedTest {


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All from Test 1");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All from Test 1");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each from Test 1");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each from Test 1");
	}

	@Test
	@DisplayName("Test from Test 1")
	void test1() {
		System.out.println("Test Cases of Test 1");
	}
	
	@Nested
	class test1a{
		
		@BeforeEach
		void setUp() throws Exception {
			System.out.println("Before Each from Sub Test 1");
		}

		@AfterEach
		void tearDown() throws Exception {
			System.out.println("After Each from Sub Test 1");
		}

		@Test
		@DisplayName("Sub Test")
		void testt1a() {
			System.out.println("Test Cases of Sub Test 1");
		}
		@Nested
		class test2{
			
			@BeforeEach
			void setUp() throws Exception {
				System.out.println("Before Each from Test 2");
			}

			@AfterEach
			void tearDown() throws Exception {
				System.out.println("After Each from Test 2");
			}

			@Test
			@DisplayName("Inner Test")
			void testt2() {
				System.out.println("Test Cases of Test 2");
			}
			
		}
	}
}
