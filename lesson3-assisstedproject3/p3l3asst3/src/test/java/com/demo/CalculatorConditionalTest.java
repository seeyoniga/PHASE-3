package com.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorConditionalTest {

private Calculator calc;
	
	@BeforeEach
	public void setup() {
		calc= new Calculator();
		System.out.println("Calculator Initiated");
	}
	
	@AfterEach
	public void tearDown() {
		calc=null;
		System.out.println("Calculator Closed");
	}
	@Test
	public void addtest() {
		assertEquals(26, calc.add(16,10));
	}
	@Test
	public void subtest() {
		assertEquals(26, calc.sub(30,4));
		assertNotEquals(26, calc.sub(12,14));
	}
	
	@Test
	public void multiplytest() {
		assertEquals(26, calc.multiply(13,2));
		assertNotEquals(26, calc.multiply(13, 10));
	}
	
	@Test
	public void dividetest() {
		assertEquals(26, calc.divide(52, 2));
		assertNotEquals(26, calc.divide(13, 3));
	}

}
