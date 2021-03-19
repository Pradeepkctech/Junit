package com.training.parameterized;

public class PrimeChecker {
	public boolean validate(final Integer primenumber) {
		for(int i=2;i <(primenumber/2);i++) {
			if(primenumber%i==0) {
				return false;
			}
		}
		return true;
		
	}

}
