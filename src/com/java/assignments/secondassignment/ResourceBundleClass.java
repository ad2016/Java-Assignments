package com.java.assignments.secondassignment;
import java.util.*;

public class ResourceBundleClass {

	public static void main(String[] args) {
	
		try {
			ResourceBundle rb = ResourceBundle.getBundle("company");
			Enumeration<String> com = rb.getKeys(); //https://www.tutorialspoint.com/java/util/resourcebundle_getkeys.htm
			while (com.hasMoreElements()) {
				String eValue = com.nextElement();
				String result = rb.getString(eValue);
				System.out.println(eValue + ": " + result);
			}
		} catch (Exception error) {
			System.out.println("Error retrieving properties file: " + error);
		}

	}

}
