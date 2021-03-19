package com.training.testresult;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.*;

public class TestResultDemo extends TestResult {

	
	public synchronized void addError(Test test, Throwable t) {
		super.addError((junit.framework.Test)test, t);
	}
	public synchronized void addFailure(Test test ,AssertionFailedError t) {
		
		super.addFailure((junit.framework.Test)test, t);
	}
	@Test
	public void test() {
		
		assertEquals(6,5);
		
	}
	@Override
	public synchronized void stop() {
		
		
	}
	
	
	
}
