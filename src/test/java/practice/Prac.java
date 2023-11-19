package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Prac {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(1, "Hello");  //adding element in  HashMap
		hm.put(3, "World");
		hm.put(24, "GoodBye");
		hm.put(56, "Nice");
		
		System.out.println(hm);
		System.out.println(hm.size());  //getting size
		System.out.println(hm.containsKey(24));  //returns boolean and checks for key
		System.out.println(hm.containsValue("Nice"));  //returns boolean and checks for value
		System.out.println(hm.get(56)); //gets value for key supplied
		System.out.println(hm.isEmpty());	//checks if HashMap is empty
		
		//use entrySet() method to convert HashMap into set and use iterator later to iterate
		Iterator is= hm.entrySet().iterator(); 
		while (is.hasNext()) {
			
			//cast is.next() of iterator as Map.Entry to use methods like getKey() and getValue()
			Map.Entry me=(Map.Entry)is.next(); 
			System.out.println((int)me.getKey());
			System.out.println((String)me.getValue());
		}
	}
}
