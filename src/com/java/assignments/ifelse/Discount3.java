package com.java.assignments.ifelse;

import java.util.Scanner;

public class Discount3 {

	public static void main(String[] args) {
		
		double  discount, itemPrice, finalPrice;
		
		double totalPrice,noCookie, noCake, cookiePrice, cakePrice;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of cookie(s):  ");
		noCookie = s.nextDouble();
		
		cookiePrice = noCookie * 5/100;
		System.out.println("Price of the cookie(s) are: $ "+cookiePrice);
		
		System.out.println("Enter the number of cake(s):  ");
		noCake = s.nextDouble();
		
		cakePrice = noCake * 3/100;
		System.out.println("Price of the cake(s) are: $ "+cakePrice);
		
		totalPrice = cakePrice + cookiePrice;
		
		if(totalPrice >10){
			
			discount = totalPrice * 5 /100;
			finalPrice = totalPrice - discount;
			
			System.out.println(" A discount of $" + discount + " is applied to the item(s)");
			System.out.println("The final price is  $" +finalPrice);
			
		}
		else{
			
			System.out.println("The total price of the items is $ "+ totalPrice);
		}
	

	}

}
