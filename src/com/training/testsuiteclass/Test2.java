package com.training.testsuiteclass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test2 {
	
	String name="Pradeep";
	MessageUtils messageUtils=new MessageUtils(name);
	@Test
	public void welcomeTest() {
		System.out.println("Inside the welcomeTest()");
	name="Welcome"+"Pradeep";
		assertEquals(name,messageUtils.welcome());
	}

}
