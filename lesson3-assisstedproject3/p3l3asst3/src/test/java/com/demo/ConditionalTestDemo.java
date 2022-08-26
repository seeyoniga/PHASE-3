package com.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class ConditionalTestDemo {
	
	@Test
	@DisabledOnOs({OS.WINDOWS})
	public void notrunOnWindows() {
		System.out.println("This machine is not running on Windows OS");
		
	}
	
	@Test
	@EnabledOnOs({OS.MAC})
	public void runOnMac() {
		System.out.println("This machine is running on MAC OS");
		
	}
	
	
	@Test
	@DisabledOnOs({OS.LINUX})
	public void notrunOnLinux() {
		System.out.println("This machine is not running on Linux OS");
		
	}

}
