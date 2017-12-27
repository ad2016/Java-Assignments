package com.java.assignment2.exceptions;

public class MyException extends Exception{
	
	String a;
	
	MyException(String b) {
	     a=b;
	}
	
	public String toString()
    {
        return a;
    }
}
