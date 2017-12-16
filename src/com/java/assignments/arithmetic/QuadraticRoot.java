package com.java.assignments.arithmetic;

import java.util.Scanner;

public class QuadraticRoot {
	public static void main(String[] args) {
		
		double a, b,c, discriminant;
		double root1, root2;
		
		Scanner s = new Scanner(System.in);
		System.out.print( "Enter the value of a: " );
        a = s.nextDouble();
        System.out.print( "Enter the value of b: " );
        b = s.nextDouble();
        System.out.print( "Enter the value of c: " );
        c = s.nextDouble();
        
        discriminant = b*b - 4*a*c;
        
        if(discriminant > 0){
        
        	System.out.println("The roots are real!");
	        root1 = (-b + Math.sqrt( discriminant ) )/ (2*a);
	        root2 = (-b - Math.sqrt( discriminant ) )/ (2*a);
	        System.out.println("The roots1 are: "+ root1);
	        System.out.println("The roots2 are: " + root2);
        
        }
        else
        {
        	System.out.println("The roots are imaginary!");
        }
		
		
	}

}
