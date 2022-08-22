package CollectionPractice;
//import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListPractice {
	public static void main(String[] args) {
		
		
		// Two Way of ArrayKist declaration 
		
		//1. common way of declaration => Homogeneous and heterogeneous 
		
		ArrayList al = new ArrayList();
		
		
		// 2. Generic Declaration ==>Homogeneous
		
		//ArrayList <String> a1 = new ArrayList<String>();
		//ArrayList <Integer> a2 = new ArrayList<Integer>();
		//ArrayList <Character> a3 = new ArrayList<Character>();
		
		
		//Adding the values inside the ArrayList
		
		al.add(15);  // inside the data structure start with 0 index
		al.add("ABC"); // index 1
		al.add('A');  // index 2
		al.add(15);   // index 3
		
		
		System.out.println(al);
		
		
		
		// add element on based existing index
		
		al.add(2,'B');     // it will shift the data from mentioned index
		System.out.println(al);
		
		 
		//  set method for replacement
		al.set(3,"XYZ");
		System.out.println(al);
		
		
	   // to remove the element from respective position
		al.remove(4);
		System.out.println(al);
		
		// Checking the emptiness 
		System.out.println("Checking the emptiness: "+al.isEmpty());
		
		
		// Checking the size of array
		System.out.println("Checking the  size of arraylist :"+al.size());
		
		// location of information ==. index 
		System.out.println(" the index of B"+al.indexOf('B'));
		System.out.println(al.lastIndexOf(15));
		
		
		// Contains == checking of availability of data
		
		System.out.println("Contains Method:" + al.contains("PQR"));
		
		
		// get == find data at perticuler index
		System.out.println(al.get(1));
		System.out.println(al.get(3));
		
		
		
		
		// To read array list 4 ways
		// 1. regular for loop
		// 2. enhanced for loop ( advanced for loop)	
		// 3.  Iterator
		// 4. List Iterator.	
		
			// 1. Regular for Loop.
		  System.out.println();
		for(int i=0;i<al.size();i++) {
			
			System.out.print( " "+al.get(i));
		}
		
		System.out.println();
		// 2. advanced for loop.
		
		
		for(Object value:al) {
			System.out.print(" "+value);
			
		}
		
		System.out.println( );
			
			// 3. Iterator
			// declaring the iterator.
			// for any class in collection
			
		 Iterator itr = al.iterator();
		 while(itr.hasNext()) {
			 
			 System.out.print(" "+itr.next());
		 }
			
		 System.out.println();
		 
		 
		// 4. ListIterator
			// is for only list interface clases.
		 
		 ListIterator litr=al.listIterator();
		 
		 while(litr.hasNext()) {
			 System.out.print(" "+litr.next());
		 }
		 
		 System.out.println( );
		 
		 
		 
		 
		 // reverse the array list
		 
		 
		 Collections.reverse(al);
		 System.out.print(al);
         
		 
		 System.out.println();
		 Iterator itr1 = al.iterator();
		 while(itr1.hasNext()) {
			 
			 System.out.print(" "+itr1.next());
		 }
	
		 

		   
	}
	}
	
	
	


