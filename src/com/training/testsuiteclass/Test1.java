package com.training.testsuiteclass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1 {
	
	String name="Pradeep";
	MessageUtils messageUtils = new MessageUtils(name);
	
	@Test
	public void printTest() {
		System.out.println("Inside printTest()");
		assertEquals(name,messageUtils.print());
		
	}

}
