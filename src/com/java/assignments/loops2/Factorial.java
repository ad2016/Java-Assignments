package com.java.assignments.loops2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		   int no,result=1;  		   
		   Scanner s = new Scanner(System.in);
		   System.out.println( "Enter the number: " );	
	       no = s.nextInt(); 
		  
	       for(int i=1;i<=no;i++){    
		      result=result*i;    
	       }    
	       System.out.println("The factorial of "+no+" = "+result);    
	}  

}
