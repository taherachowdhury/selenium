package javaCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
		//Map<Key,Value> VariableName = new HashMap<Key, Value>();
		//put method help to add Entry(Key with Value)
		//Map <String,String> map = new HashMap<String, String>();
		//in Map key doesn't allows dup and Values allows dup, if we add new value its 	    
		//overwrited to the existing value and size of Map will be same.
		
		//Map <String,Integer> map = new HashMap<String, Integer>();
		Map<String,Integer> map = new TreeMap<String, Integer>();
		
		//put()-:	Add a new entry
		map.put("Mahid", 251);
		map.put("Mahrab", 212);
		map.put("Maisha", 183);
		map.put("Mahid", 261);
		System.out.println(map);
		System.out.println(map.size());
		
		//get(key)- value of the key/print value of maisha 183
		map.get("Maisha");
		System.out.println(map.get("Maisha"));
		
		//remove(Key)-: Remove Key and its value//just pass the Key it will delete Key and Value

		map.remove("Mahid");
		System.out.println(map);
		
		//containsKey(Key)-: Search by the key//return True or False
		System.out.println(map.containsKey("Mahrab"));
		
		//containsKey(Key)-: Search by the Value//return True or False
		System.out.println(map.containsValue(251));
		
		System.out.println(".....................");
		
		//clear()- Removes all map data/entry//return True/False

		map.clear();
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		
		// In Map (2 dimension)-for each Loop Syntax-
			
			
		
		
		
  
    for(Entry<String, Integer> eachmap : map.entrySet()) {
   	  
    	
    	System.out.println(eachmap.getKey() + "    " + eachmap.getValue());
    	
     }
		
		
		
		
		
		
		}
		
		
	

		
		
		
		
		
	
	
	
	}


		
	


