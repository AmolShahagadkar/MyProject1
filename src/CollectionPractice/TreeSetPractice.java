package CollectionPractice;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractice {
	public static void main(String[] args) {
		
		// declaration of tree set
		
		TreeSet ts=new TreeSet();
		
		// adding values in tree set
		
		ts.add("F");
		ts.add("E");
		ts.add("D");
		ts.add("C");
		ts.add("B");
		ts.add("A");
		
		System.out.println(ts);
		
		// adding duplicate values
		
		ts.add("A");
		System.out.println(ts);
		
		// getting first and last value
		
		System.out.println("First value:-"+ts.first());
		System.out.println("Last value:-"+ts.last());
		
		
		// imidiate values 
		
		String val="C";
		
		System.out.println();
		
		// removing first and last element == poll
		
		ts.pollFirst();
		ts.pollLast();
	    
		System.out.println(ts);
		
		// iterator
		
		Iterator itr = ts.iterator();
		
		while(itr.hasNext()) {
			System.out.print(" "+itr.next());
		}
	}

}
