package com.java.assignments.arithmetic;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		
		int x, result;
		
		Scanner s = new Scanner(System.in);
		System.out.print( "Enter the value of x: " );
        x = s.nextInt();
        
        result = 3*(x*x) - 8*x + 4;
        System.out.print( "Result: " +result);
        
	}
}
