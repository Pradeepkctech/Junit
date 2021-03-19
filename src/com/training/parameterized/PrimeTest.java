package com.training.parameterized;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeTest {
	private final Integer inputNumber;
	private final boolean expectedResult;
	private PrimeChecker primeChecker;
	@Before
	public void setUp() {
		primeChecker=new PrimeChecker();
		
	}
	
	public PrimeTest(Integer inputNumber,Boolean expectedResult) {
		this.inputNumber=inputNumber;
		this.expectedResult=expectedResult;
		
	}
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object [][] { {2,true},{6,false},{19,true},{22,false},{23,true}  });
		
	}
	@Test
	public void testPrime() {
		System.out.println("Parameterized number is;"+inputNumber);
		assertEquals(expectedResult,primeChecker.validate(inputNumber));
	}
	

}
