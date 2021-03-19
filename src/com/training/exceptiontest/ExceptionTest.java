package com.training.exceptiontest;

import java.util.InputMismatchException;

import org.junit.Before;
import org.junit.Test;

public class ExceptionTest {
	
	int a,b;
	float c;
	@Before
	public void setUp() {
		a=5;
		b=0;
	}
	@Test(expected=	/* java.util.InputMisMatchException.class  */java.lang.ArithmeticException.class) // if the expected exception is not thrown in test case then the test case will be Error
	public void math() {
		c=a/b;
	}
}
 