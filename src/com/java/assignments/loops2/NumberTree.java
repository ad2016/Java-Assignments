package com.java.assignments.loops2;

public class NumberTree {

	public static void main(String[] args) {
		
		int rowNo= 8;
        
        for(int i=1;i<=rowNo;i++) {
        	
			// display no of spaces for each new row
            
        	for(int j=i;j<=rowNo-1;j++) {
                System.out.print(" ");
            }
			
			// display no of * for each new row 
        	
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println("");
            
        }
    
     }	
     

}
