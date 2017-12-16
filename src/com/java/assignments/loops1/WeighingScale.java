package com.java.assignments.loops1;

import java.util.Scanner;

public class WeighingScale {

	public static void main(String[] args) {
		
		int w1, w2;
		
		do{
        	Scanner s = new Scanner(System.in);
    		System.out.println( "Enter the left side weight : " );	
            w1 = s.nextInt();
            System.out.println( "Enter the right side weight: " );	
            w2 = s.nextInt(); 
            
	        if(w1==w2){
	    		System.out.println("Both weights are same weights");
	    		}
	    		
	    	else
	    		{
	    			System.out.println("Both weights are NOT same weights");
	    		}
            
        	}while(w1!=w2);
		

		

	}

}
