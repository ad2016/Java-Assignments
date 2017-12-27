package com.java.assignment2.strings;
import java.util.Scanner;

public class ReplaceSpacesInString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print( "Enter a string: " );
        String st = s.nextLine();       
        String[] stringArray = st.split(" ");       
        StringBuffer buffer= new StringBuffer();  
        for(String s1 : stringArray){ 
        	s1=s1.trim();
        	buffer.append(s1);
        	buffer.append("%20");
        }
        System.out.println( buffer.toString());
	}	
}
