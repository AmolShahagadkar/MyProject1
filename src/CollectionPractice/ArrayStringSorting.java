package CollectionPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayStringSorting {
	
	public static void main(String[] args) {
		
		// Array list declaration
		
		ArrayList <String> list = new ArrayList();
		
		// adding values in array list
		
		list.add("audi");
		list.add("Activa");
		list.add("Maruti 800");
		list.add("BMW");
		list.add("Bullet");
		list.add("nano");
		list.add("mercedez-Benz");
		
		System.out.println("Array List before sorting: " +list);
		
		// sorting the arraylist in ascending order
	  
		
		
		Collections.sort(list);
		System.out.println("After sorting array list: " +list);
		
		
		// sorting the arraylist in DESCENDING order
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("After sorting Descending array list:" + list);
		
	}

}
