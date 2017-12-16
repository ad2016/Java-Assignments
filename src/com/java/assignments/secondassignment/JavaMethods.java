package com.java.assignments.secondassignment;

public class JavaMethods {

	public static void main(String[] args) {
		
		Methods m = new Methods();
		boolean result = m.IsInteger("hello");
		boolean result1 = m.IsInteger("2");
		System.out.println(result);
		System.out.println(result1);
		boolean result3 = m.IsOddNumber("5");
		System.out.println(result3);
		boolean result4 = m.IsEvenNumber("4");
		System.out.println(result4);
		boolean result5 = m.IsPrimeNumber("6");
		System.out.println(result5);
	}
	
}

	class Methods extends JavaMethods{
	
	public boolean IsInteger(String str){
		
		try {
		    Integer.parseInt(str);
		} 
		catch (NumberFormatException e) {
		    return false;
		}
		return true;
	}
	
     public Boolean IsOddNumber(String str){
    	 
    	 int x = Integer.parseInt(str);
		 
    	 if((x%2)==0){
    		 return false;
    	 }
    	 else 
    		 return true;
	 }
     
     public Boolean IsEvenNumber(String str){
    	 
    	 int x = Integer.parseInt(str);
		 
    	 if((x%2)==0){
    		 return true;
    	 }
    	 else 
    		 return false;
	 }
     
     public boolean IsPrimeNumber(String str) {
    	 
    	 	int x = Integer.parseInt(str);
    	    for(int i=2;i<x;i++) {
    	        if(x%i==0)
    	            return false;
    	    }
    	    return true;
    	}

		
}
	


