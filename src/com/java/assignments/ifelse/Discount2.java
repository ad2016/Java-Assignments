package com.java.assignments.ifelse;

import java.util.Scanner;

public class Discount2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double  discount, itemPrice, finalPrice;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the item price:  ");
		itemPrice = s.nextDouble();
		
		if(itemPrice >10)
			
		{
			discount = itemPrice * 5 /100;
			finalPrice = itemPrice - discount;
			
			System.out.println("A 5% discount is applied for this item");
			System.out.println("A discount of $" + discount+" is applied to the item");
			System.out.println("The final price is  $" +finalPrice);
		}
		else
		{
			System.out.println("The item is not eligible for 5% discount");
		    System.out.println("The final price is  $" +itemPrice);
		}
		
		

	}

}
