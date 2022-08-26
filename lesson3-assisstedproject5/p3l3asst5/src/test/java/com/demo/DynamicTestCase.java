package com.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

class DynamicTestCase {

	@TestFactory
	Collection<DynamicTest> dynamicTestDemo(){
		
		return Arrays.asList(
				dynamicTest("Test 1", ()->assertTrue(26>10)),
				dynamicTest("Test 2", ()->assertFalse(10>26)),
				dynamicTest("Test 3", ()->assertEquals(26,16+10)),
				dynamicTest("Test 4", ()->assertNull(null)),
				dynamicTest("Test 5", ()->assertThrows(RuntimeException.class,
						()->{throw new RuntimeException("Not Valid");})),
				dynamicTest("Test 6", new MyExecutable())
		);
	}
	
	class MyExecutable implements Executable
	{

		@Override
		public void execute() throws Throwable {
			System.out.println("Returned From The Executable Class");
			
		}
		
	}

}