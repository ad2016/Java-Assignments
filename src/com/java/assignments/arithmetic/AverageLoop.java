package com.java.assignments.arithmetic;

import java.util.Scanner;

public class AverageLoop {

	public static void main(String[] args) {
		
		int s1, s2, s3, s4, s5, s6, average, totalMarks;
		String name;
		
		for(int i=0;i<3;i++){
			
		
			Scanner s = new Scanner(System.in);
			System.out.println( "Enter the Student's name: " );	
	        name = s.nextLine();
	        System.out.println( "Enter Math mark: " );	
	        s1 = s.nextInt();
	        System.out.println( "Enter Science mark: " );	
	        s2 = s.nextInt();
	        System.out.println( "Enter English mark: " );	
	        s3 = s.nextInt();
	        System.out.println( "Enter History mark: " );	
	        s4 = s.nextInt();
	        System.out.println( "Enter Geography mark: " );	
	        s5 = s.nextInt();
	        System.out.println( "Enter French mark: " );	
	        s6 = s.nextInt();
	        
	        totalMarks = s1+s2+s3+s4+s5+s6;
	        average = totalMarks/6;
	        
	        System.out.println("*************************************");
	        System.out.println( "Student name: "+name );
	        System.out.println("Total marks secured: "+totalMarks);
	        System.out.println( "Average: "+average );
	        System.out.println("*************************************");
	        
		}

	}

}
