package com.java.assignments.loops2;

import java.util.Scanner;

public class SecondWhileLoop {

	public static void main(String[] args) {

		int n1,n2, i=0,sum=0;
		
		while( i <100){
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the first integer " );	
        n1 = s.nextInt(); 
        System.out.println( "Enter the second integer " );	
        n2 = s.nextInt();
        
        sum = n1+n2+sum;
        System.out.println( "Sum: " +sum);	
		}

	}

}
