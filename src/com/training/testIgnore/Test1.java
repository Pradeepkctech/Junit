package com.training.testIgnore;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class Test1 {
	
	String name="Pradeep";
	MessageUtils messageUtils = new MessageUtils(name);
	@Ignore  //after adding@Ignore annotation this testcase was skipped during execution
	@Test
	public void printTest() {
		System.out.println("Inside printTest()");
		assertEquals(name,messageUtils.print());
		
	}
	
	@Test (timeout=000)
	public void welcomeTest() {
		System.out.println("Inside the welcomeTest()");
	name="Welcome"+"Pradeep";
		assertEquals(name,messageUtils.welcome());
	}

}
