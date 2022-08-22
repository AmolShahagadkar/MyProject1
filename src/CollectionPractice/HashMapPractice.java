package CollectionPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapPractice {

	public static void main(String[] args) {
		
		// Declaration of hash map
		
		HashMap <Integer,String> hm = new HashMap<Integer,String>();
		
		// adding values in HashMap
		// for adding values ==> put() method are used
		
		hm.put(101,"ABC");
		hm.put(102,"PQR");
		hm.put(103,"XYZ");
		hm.put(104,"LMN");
		
		System.out.println(hm);
		
		// adding one more element :- you have to use next key
		// modify
		
		hm.put(102,"XYZ");
		
		System.out.println(hm);
		
		// remove the element
		
		hm.remove(102);
		System.out.println(hm);
		
		
		//size
		System.out.println(" "+hm.size());
		
		
		// to read hash map
		// advanced loop 
		
		for(Entry<Integer, String> m:hm.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
	
		
	}
}
