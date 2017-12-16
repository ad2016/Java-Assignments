package com.java.assignments.loops2;

import java.util.Scanner;

public class SquareWhileLoop {

	public static void main(String[] args) {
		
		int no, i=0,sum=0;
		
		while( i <100){
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter an integer " );	
        	no = s.nextInt();        
        	sum = (no*no) +sum;
       		System.out.println( "Sum: " +sum);	
		}

	}

}
