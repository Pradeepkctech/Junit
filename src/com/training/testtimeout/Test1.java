package com.training.testtimeout;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1 {
	
	String name="Pradeep";
	MessageUtils messageUtils = new MessageUtils(name);
	
	@Test(timeout=10)
	public void printTest() {
		System.out.println("Inside printTest()");
		assertEquals(name,messageUtils.print());
		
	}
	
	@Test 
	public void welcomeTest() {
		System.out.println("Inside the welcomeTest()");
	name="Welcome"+"Pradeep";
		assertEquals(name,messageUtils.welcome());
	}

}
