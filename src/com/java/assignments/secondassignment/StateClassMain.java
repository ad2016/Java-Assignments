package com.java.assignments.secondassignment;

import java.util.ArrayList;
import java.util.Iterator;

public class StateClassMain {

	public static void main(String[] args) {
		
		ArrayList<StateClass> list = new ArrayList<StateClass>(); 		
		StateClass  s1 = new StateClass("California","Sacramento",9898);
	    StateClass  s2 = new StateClass("Texas","Austin",9808);
		StateClass  s3 = new StateClass("Alabama","Juneau",1298);
		StateClass  s4 = new StateClass("Alaska","Sacramento",7698);
		StateClass  s5 = new StateClass("Arizona","Phoenix",4498);
		StateClass  s6 = new StateClass("Arkansas","Little Rock",2298);
		StateClass  s7 = new StateClass("Colorado","Denver",5658);
		StateClass  s8 = new StateClass("Connecticut","Hartford",3434);
		StateClass  s9 = new StateClass("Delaware","Dover",2322);
		StateClass  s10 = new StateClass("Michigan","Lansing ",6655);
		 
		list.add(s1); 
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
	    list.add(s7);
		list.add(s8);
		list.add(s9);
		list.add(s10);	
	    
		Iterator i =list.iterator();  
		while(i.hasNext()){  
		System.out.println(i.next());    
	  }
	}
}
