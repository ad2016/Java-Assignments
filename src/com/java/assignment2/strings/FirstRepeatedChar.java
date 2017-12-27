package com.java.assignment2.strings;
import java.util.*;

public class FirstRepeatedChar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print( "Enter a string: " );
		String st = s.nextLine();   
		char[] a = st.toCharArray();
		//System.out.println(Arrays.toString(a));
		char repeatedChar = repeatedchar(a);
		System.out.println("The first repeated character in the given string is: " +repeatedChar);
	}
	private static char repeatedchar(char[] a) {
		HashSet<Character> hs = new HashSet<>();
		for (int i=0; i<=a.length-1; i++){
			char c = a[i];
			if (hs.contains(c)){
				return c;
			}
			else {
				hs.add(c);
			}
		}
		return '0';
	}
}


