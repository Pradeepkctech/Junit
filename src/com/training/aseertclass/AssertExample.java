package com.training.aseertclass;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AssertExample {
	int num;
	String temp,str;
	@Before
public void setUp() {
	 num=5;
	temp = null;
	str="Junit is running Successfully";
	
}
	@Test
	public void test() {
		//check for equality
		assertEquals("Junit is running Successfully",str);
		
		//check for true condition
		assertTrue(num==5);
		
		//check for False condition
		assertFalse(num>10);
		
		//check for null value
		assertNull(temp);
		
		//check for not null value
		assertNotNull(str);
	}
}
