package javaCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		//Set <Integer> obj = new  HashSet<Integer>();
		//Set <Integer> obj = new  TreeSet<Integer>();
		Set <Integer> obj = new LinkedHashSet <Integer>();
		
		//add item in set 
		obj.add(123);
		obj.add(456);
		obj.add(789);
		obj.add(147);
		
		//get size
		System.out.println(obj);    		//output [147, 789, 456, 123]
		System.out.println(obj.size()); 	//output- 4
		
		System.out.println("..........................");
		
		//Add more item
		obj.add(852);
		
		//print/display all item (for each loop)
		for (Integer eachobj : obj) {
			System.out.println(eachobj);
			 
		}
		System.out.println(".................");

		//Delet Item from set use Remove item 
		
		obj.remove(852);
		for (Integer eachobj : obj) {
			System.out.println(eachobj);
		}
		System.out.println(".................");
	
		
		//contains in set/output true/fals
		obj.contains(147);
		System.out.println(obj.contains(147));
		 
		System.out.println(".....................");
		//clear the set
		
		obj.clear();
		System.out.println(obj.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	}

}
