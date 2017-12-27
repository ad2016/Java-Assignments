package com.java.assignment2.exceptions;

import java.util.Scanner;

public class Test extends CalculatorFunctions{

	public static void main(String[] args) {

		int no1,no2,choice;
		Scanner s = new Scanner(System.in);
		System.out.print( "Enter number1: " );
		no1 = s.nextInt();
		System.out.println("Enter number2: ");
		no2 = s.nextInt();
		try
		{
			if(no1 < 0 || no2 <0)		
			{
				throw new MyException("Both the numbers should be positive");    
			}
			System.out.println("Enter the choice: ");

			System.out.println("*********************");
			System.out.println("1-Addition");
			System.out.println("2-Subtraction");
			System.out.println("3-Multiplication");
			System.out.println("4-Divison");
			System.out.println("5-Modulos");
			System.out.println("6-Exit"); 
			choice = s.nextInt();

			switch (choice) {
			case 1: 
				System.out.print("Adding two numbers:");				
				CalculatorFunctions c1 = new CalculatorFunctions();
				int sum = c1.sum(no1, no2);
				System.out.println("Result: "+sum);
				break; 
			case 2:
				System.out.print("Subtracting two numbers:");				
				CalculatorFunctions c2 = new CalculatorFunctions();
				int sub = c2.sub(no1, no2);
				System.out.println("Result: "+sub);
				break;
			case 3:
				System.out.print("Multiplying two numbers:");				
				CalculatorFunctions c3 = new CalculatorFunctions();
				int mul = c3.mul(no1, no2);
				System.out.println("Result: "+mul);
				break;
			case 4:
				System.out.print("Dividing two numbers:");				
				CalculatorFunctions c4 = new CalculatorFunctions();
				int div = c4.div(no1, no2);
				System.out.println("Result: "+div);
				break;
			case 5:
				System.out.print("Modulo operation:");				
				CalculatorFunctions c5 = new CalculatorFunctions();
				int mod = c5.mod(no1, no2);
				System.out.println("Result: "+mod);
				break;
			case 6: 
				System.out.println("Exit");
				break; 
			}

		}
		catch(MyException e)
		{
			System.out.println(e);  
		}

	}
}