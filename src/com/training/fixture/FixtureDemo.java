package com.training.fixture;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FixtureDemo {
@Before
	public void setUp()
{  System.out.println("Execution of Before");
		}
@BeforeClass
	public static void setUpClass() {
		System.out.println("Execution of berforeClass class");
	}
	@Test
	public void testA() {
		System.out.println("the test A logics are tetsed here");
	}
	@Test
	public void testB() {
		System.out.println("the test B logics are tested here");
	}
	@AfterClass
public static void tearDownAll() {
	System.out.println("Execution of afterClass ");
}
	@After
public void tearDown()
{
	System.out.println("Execution of after ");
}
}
