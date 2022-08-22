package CollectionPractice;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorPractice {
	public static void main(String[] args) {
		
		
		// vector declaration
		
		Vector v1 = new Vector();
		
		// adding values in vector
	 
		v1.add(15);
		v1.add("ABC");
		v1.add('A');
		v1.add(25);
		
		System.out.println("Vector list : "+ v1);
		
		
		
		// Modifying arraylist
	      v1.add(2, 'B');
	      System.out.println(v1);
	      
	      // Data replace
	      v1.set(2, "XYZ");
	      System.out.println(v1);
	      
	      // data remove.
	      //v.remove(4);
	      System.out.println(v1);
	      
	      v1.add(null);
	      v1.add(null);
	      v1.add(null);
	   
	      
	      // finding the capacity.
	      System.out.println("The capacity of vector is:- "+ v1.capacity());
	      System.out.println("The size of vector is:- "+ v1.size());
	      // checking the emptiness.
	      System.out.println(v1.isEmpty());
	      
	      // size.
	      System.out.println(v1.size());
	      
	      // location of information ==> index
	      
	      System.out.println(v1.indexOf(15));
	      System.out.println(v1.lastIndexOf(15));
	      
	      // Contains ==> check avaibility of the data
	      System.out.println(v1.contains("PQR")); 
	      
	      // get ==> will help you to find data at perticular index.
	      System.out.println(v1.get(1));
	      System.out.println(v1.get(2));
	      
	      
	      // to read full arraylist. ==> regular expression 
	      
	      for(int i=0; i<v1.size();i++) {
	    	  System.out.print(v1.get(i)+ " ");
	      }
	      
	      System.out.println();
	      
	      // advanced for loop.
	      
	      for (Object value:v1) {
	    	  System.out.print(value+ " ");
	      }
	      
	      System.out.println();
	      // iterator. => scope  ==>  full collection interface
	      Iterator itr = v1.iterator();
	      while(itr.hasNext()) {
	    	  System.out.print(itr.next()+ " ");
	      }
	      
	      
	      System.out.println();
	      //list iterator  => scope  ==> list interface
	      ListIterator litr = v1.listIterator();
	      while(litr.hasNext()) {
	    	  System.out.print(litr.next()+ " ");
	      }
	      System.out.println( );
	      System.out.println("---------------------------------------------------------------------");
	      
	      System.out.println("this is from enumerator");
	      
	       Enumeration en = v1.elements();
	      while(en.hasMoreElements()) {
	    	  System.out.print(en.nextElement()+ " ");
	      }
	      System.out.println();
	      System.out.println("---------------------------------------------------------------------");
	      
	      
	      System.out.println();
	      // reverse order.
	      
	      Collections.reverse(v1);
	      System.out.print(v1+ " ");
	      System.out.println();
	      
	     Iterator itr1 = v1.iterator();
	      while(itr1.hasNext()) {
	    	  System.out.print(itr1.next()+ " ");
	      }
	      
		
	}

}
