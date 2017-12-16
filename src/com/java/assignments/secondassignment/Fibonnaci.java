package com.java.assignments.secondassignment;

import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		
		int no;
		int n1 = 0, n2 = 0, n3 = 1;
		
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        no = s.nextInt();
        
        System.out.print("The fibonacci Series for the number is :");
        for(int i = 1; i <= no; i++)
        {
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;       
            System.out.print( n1 +" ");
        }

	}

}
