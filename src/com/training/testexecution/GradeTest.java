package com.training.testexecution;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GradeTest {
	
	Student s1,s2,s3,s4;
	@Before
	public void setUp() {
		System.out.println("-----------------------------------------------------");
		System.out.println("In before Method");
		s1=new Student(1,"Ajith",35);
		s2=new Student(2,"Bharath",50);
		s3=new Student(3,"Chandru",60);
		s4=new Student(4,"Dinesh",70);
		
	}
	@Test
	public void testPass() {
		System.out.println("In test pass method");
		s1.grade();
		assertEquals("Pass Class",s1.grade());
		s1.display();
	}
	@Test
	public void testSecond() {
		System.out.println("in test second method");
		s2.grade();
		assertEquals("Second Class",s2.grade());
		s2.display();
	}
	@Test
	public void testFirst() {
		System.out.println("in test First method");
		s3.grade();
		assertEquals("First Class",s3.grade());
		s3.display();
	}
	@Test
	public void testDistinction() {
		System.out.println("in test Distinction method");
		s2.grade();
		assertEquals("Distinction",s4.grade());
		s4.display();
	}
}
