package CollectionPractice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetP {
	public static void main(String[] args) {
		
		// cresting linkedhash set
		
		LinkedHashSet lhs=new LinkedHashSet();
		
		
		// adding values in elements
		
		lhs.add("A");
		lhs.add("B");
		lhs.add("C");
		lhs.add("D");
		lhs.add("E");
		lhs.add(1);
		
		// try to add the duplicate
		
		lhs.add("A");
		lhs.add("E");
		System.out.println(lhs);
		
		System.out.println("The size is:-"+lhs.size());
		System.out.println("To check the present element:-"+lhs.contains("C"));
		
		
		// remove 
		
		lhs.remove(1);
		
		System.out.println(lhs);
		
		
		
		// to read the elements
		
		Iterator itr=lhs.iterator();
		
		while(itr.hasNext()) {
			System.out.print(" "+itr.next());
			
		}
			
		
		
		
		
		
	}

}
