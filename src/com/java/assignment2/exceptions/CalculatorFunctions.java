package com.java.assignment2.exceptions;

public class CalculatorFunctions implements Service {
	
	public int sum(int a, int b) {		
		return (a+b);
	}
	
	public int sub(int a, int b) {
		return (a-b);
	}
	
	public int mul(int a, int b) {
		return (a*b);
	}
	
	public int div(int a, int b) {
		return (a/b);
	}
	
	public int mod(int a, int b){
		return (a%b);
	}

}
