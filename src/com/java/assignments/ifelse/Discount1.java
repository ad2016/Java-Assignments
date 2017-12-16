package com.java.assignments.ifelse;

import java.util.Scanner;

public class Discount1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double  discount, itemPrice, finalPrice;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Item price:  ");
		
		itemPrice = s.nextDouble();
		
		discount = itemPrice * 5 /100;
		finalPrice = itemPrice - discount;
		
		System.out.println(" A discount of $" + discount + " is applied to the item");
		System.out.println("The final price is  $" +finalPrice);
		
		
		

	}

}
