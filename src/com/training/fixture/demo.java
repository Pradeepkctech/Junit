package com.training.fixture;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class demo {
static int beforeClassCount=1;
static int afterClassCount=1;
static int beforeCount=1;
static int afterCount=1;
@Before
public void setUp() {
	System.out.println("Execution count of before method is"+beforeCount++);
	
}
@BeforeClass
public static void setUpClass() {
	System.out.println("Execution count of beforeClass method is"+beforeClassCount++);
	
}
@Test
public void test1() {
	System.out.println("t1 method test codes");
}
@Test
public void test2() {
	System.out.println("t2 method test codes");
}
@Test
public void test3() {
	System.out.println("t3 method test codes");
}
@Test
public void test4() {
	System.out.println("t4 method test codes");
}
@Test
public void test5() {
	System.out.println("t5 method test codes");
}
@After
public void tearDown() {
	System.out.println("Execution count of after method is"+afterCount++);
}
@AfterClass
public static void tearDownClass() {
	System.out.println("Execution count of afterClass method is"+afterClassCount++);
}
}