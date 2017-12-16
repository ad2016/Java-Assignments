package com.java.assignments.secondassignment;

import java.util.Scanner;

public class BasicCalculatorMain extends BasicCalculator{

	public static void main(String[] args) {
		
	BasicCalculatorMain b = new BasicCalculatorMain();
	int addResult = b.addition(10, 5);
	System.out.println(addResult);
	int subResult = b.subtraction(10, 5);
	System.out.println(subResult);
	int mulResult = b.multiplication(10, 5);
	System.out.println(mulResult);
	int divResult = b.division(10, 5);
	System.out.println(divResult);
		
}
	
	


}


