package com.java.assignment2.strings;

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print( "Enter a string: " );
        String st = s.nextLine(); 
        char[] c = st.toCharArray(); 
        for (int i=c.length-1; i>=0; i--){
        	System.out.print(c[i]);
        }
	}
}
