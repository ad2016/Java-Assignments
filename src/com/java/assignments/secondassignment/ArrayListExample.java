package com.java.assignments.secondassignment;
import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		//ArrayList
		System.out.println("List of states using ArrayList: ");
		ArrayList<String> states = new ArrayList<String>();
		states.add("California");
		states.add("Texas");
		states.add("Florida");
		states.add("Alaska");
		states.add("Virginia");
		
		Iterator i =states.iterator();  
		while(i.hasNext()){  
		System.out.println(i.next()); 
		}
		System.out.println();	
		
		//HashSet
		System.out.println("List of states using HashSet: ");
		HashSet<String> states1 = new HashSet<String>();
		states1.add("California");
		states1.add("Texas");
		states1.add("Florida");
		states1.add("Alaska");
		states1.add("Virginia");
		
		Iterator it =states.iterator();  
		while(it.hasNext()){  
		System.out.println(it.next()); 
		}
		System.out.println();
		
		//TreeSet
		System.out.println("List of states using TreeSet: ");
		TreeSet<String> states2 = new TreeSet<String>();
		states2.add("California");
		states2.add("Texas");
		states2.add("Florida");
		states2.add("Alaska");
		states2.add("Virginia");
				
		Iterator iterator =states.iterator();  
		while(iterator.hasNext()){  
		System.out.println(iterator.next()); 
		}
				
	}

}
