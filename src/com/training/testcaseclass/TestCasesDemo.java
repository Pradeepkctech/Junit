package com.training.testcaseclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestCasesDemo extends TestCase{
	int num;
	String name;
	
	@Before
	public void setUp() {
	}
	@Test
	public void test() {
		
		//Count the no of test cases
		System.out.println("the no of test cases =" +this.countTestCases() );
		
		//get the name of the current test case
		String name= this.getName();		
		System.out.println("The name of the test case = "+name);
		
		//set new name for the current test
		this.setName("testCase");
		String newName=this.getName();
		System.out.println("the name after changed using test Case methos ="+newName);
	}
	@After
public void tearDown() {
	
}
}
