package com.java.assignments.arithmetic;

import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hours;
		double  payRate, salary;
		String name;
		
		Scanner s = new Scanner(System.in);
		System.out.print( "Enter Employee name: " );
        name = s.nextLine();
		
		System.out.println("Enter the number of hours:  ");
		hours = s.nextInt();
		
		System.out.println("Enter the rate per hour:  ");
		payRate = s.nextDouble();
		
		salary =  hours * payRate;
		
		System.out.print( "*********************************************** " );
		System.out.println();
		
		System.out.println("Employee: "+ name);
		System.out.println("No of hours worked: "+ hours);
		System.out.println("Rate per hour: "+payRate);
		System.out.println("The salary of the employe "+name+" is $"+ salary);
		
		System.out.print( "*********************************************** " );

	}

}
