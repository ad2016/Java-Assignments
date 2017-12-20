package com.java.assignments.secondassignment;
import java.util.*;

public class StateClass {
	
	
   String stateName, stateCapital;
   int stateCode;
   
   
   StateClass(String sName, String sCapital, int sZipcode){
	   stateName = sName;
	   stateCapital = sCapital;
	   stateCode = sZipcode;
   }
   public String toString(){
		String s = " State name: "+ this.stateName + "  State Capital: " + this.stateCapital + "  State Zipcode: " + this.stateCode; 
		return s;
   }
}



