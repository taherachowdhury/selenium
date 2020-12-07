package javaCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
	
		// step 1 -Create object for ArrayList
		
		List<String> list = new ArrayList <String>(); 
		
		
		
		//List<String> list = new ArrayList <String>();
		
		list.add("lia");
		list.add("tima");
		list.add("kanon");
		list.add("Nameer");
		list.add("Wakil");
		 System.out.println(list);
		 
		 //get the count of size.
		 System.out.println(list.size());
		  System.out.println("................................");
		  
		  list.add("nameer");
		  System.out.println(list);  //.size()
		  
		  //print all item in the list
		  
		  for (int i= 0; i < list.size(); i++ ) {							//for loop
			  System.out.println(list.get(i));
		  }
			  System.out.println("........................................");
			  
	// remove/delete item from list
			  	list.remove(1);
			  	for (int i= 0; i < list.size(); i++ ) {
					  System.out.println(list.get(i));
				  }
			  	
			  	System.out.println("...............................");
			  	
			  	list.contains("lia");
			  	System.out.println(list.contains("lia"));
			  	
			  	list.clear();
			  	System.out.println(list.isEmpty());
			  	
			  	System.out.println("...............................");
			  	
			  	
			  	List<Integer> lst1 = new ArrayList<Integer>();
				lst1.add(123);
				lst1.add(101112);
				lst1.add(456);
				lst1.add(789);
				lst1.add(123);


				for (Integer eachLst : lst1) {               //each loop
					System.out.println(eachLst);
				}
			  	
			  	
				List<String> names = new LinkedList<String>();
				
				
				
				names.add("lia");
				names.add("tima");
				names.add("kanon");
				names.add("Nameer");
				
				//get the  list.
				 System.out.println(names);
				 
				//get the count of size.
				 System.out.println(names.size());
				 
				 List<Integer> num = new LinkedList<Integer>();
			
				 num.add(123);
			num.add(101112);
			num.add(456);
			num.add(789);
			
			for(Integer eachnum : num) {
				System.out.println(eachnum);
			}
			
			
				 
				
				
		
		 
	
	
	
	
	
	
	
	
	
	
	
	}
			  			  
					  
					  
			  	
	}
		  
		  
		  
		  
			  
		  
		  
		 
		 
		 
	


