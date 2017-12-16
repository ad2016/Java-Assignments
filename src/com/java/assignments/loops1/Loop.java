package com.java.assignments.loops1;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		
		int a, b, no, square;
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter a: " );	
        a = s.nextInt();
        System.out.println( "Enter b: " );	
        b = s.nextInt();
         
        no = a;
	    square = a*a;
	    
		do {
			System.out.println(no + " " + square);
			no = no + 1; 
			square = no * no;	
			}while (no <= b); 
	}

}
