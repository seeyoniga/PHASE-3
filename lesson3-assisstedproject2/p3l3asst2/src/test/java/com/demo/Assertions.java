package com.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Assertions {

	public boolean checkAge(int age) {
		 
		 return age>=21;
		 
	 }
	 
	 @Test
	 public void testAsserions() {		 
		 assertEquals(26,16+10);
		 assertNotEquals(8,16+10);		 
		 assertTrue(checkAge(23));
		 int a=30;
		 int b=20;
		 assertTrue(b<a);
		 assertFalse(a<b);		 
		 String n=null;
		 assertNull(n);	 
		 String myname="seeyo";
		 assertNotNull(myname);
		 
	 }
	 
	 @Test
	 @DisplayName("Test Exception using Lambda")
	 public void testThrow() {
		 
		 assertThrows(RuntimeException.class, ()->
		 {throw new RuntimeException("not valid");});
		 
		 assertThrows(ArithmeticException.class, ()->
		 {int x=10/0;System.out.println(x);});
		 
		 assertThrows(NullPointerException.class, ()->
		 {String x=null;System.out.println(x.toLowerCase());});
	 }

}
