package com.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class DependencyInjectionTest {
	
	public DependencyInjectionTest(TestInfo info) {
		System.out.println(info.getDisplayName());
	}
	
	@Test
	@DisplayName("TEST METHOD")
	public void newtest(TestInfo info) {
		
		assertEquals("NEW TEST METHOD", info.getDisplayName());
	}

	@Test
	@DisplayName("NEW TEST METHOD")
	@Tag("TAG 1")
	public void newtest1(TestInfo info) {
		
		assertEquals("NEW TEST METHOD", info.getDisplayName());
		assertTrue(info.getTags().contains("TAG 1"));
	}

}