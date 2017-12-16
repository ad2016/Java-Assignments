package com.java.assignments.secondassignment;

public class GenerateNumbers {

	public static void main(String[] args) {
		
		System.out.println("Generating 1000 numbers");
		for (int i=0; i<1000; i++) {
			System.out.println(i);
			}
		System.out.println();
		
		System.out.println("Generating multiple of 5 and less than 1000");
		for (int i = 0; i < 1000; i += 5){
			System.out.println(i);
		}
		System.out.println();
		
		System.out.println("Generate odd numbers upto 1000");
		for(int i=1;i<=1000;i++){
			if(i%2!=0)
			{
			System.out.println(i);
			}
		}
		System.out.println();

	}

}
