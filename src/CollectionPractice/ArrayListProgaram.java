package CollectionPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProgaram {
	public static void main(String[] args) {
		
		// Array Declaration
		
		ArrayList <Integer> num = new ArrayList <Integer>();
		ArrayList <String> str = new ArrayList <String>();
		
		//Adding values In ArrayList
		
		num.add(19);
		num.add(16);
		num.add(181);
		num.add(170);
		num.add(89);
		num.add(211);
		num.add(856);
		num.add(105);
		
		str.add("30 April");
		str.add("Batch");
		
		
		
		
		System.out.println("Array List Before Sorting :" + num);
		
		
		// Sorting Array List in ascending order
		
		
		Collections.sort(num);
		System.out.println("Array List After Sorting ascending :" + num);
		
		
		// Sorting Array List in descending order
		
		Collections.sort(num,Collections.reverseOrder());
		
		System.out.println("Array List After Sorting descending :" + num);
		

			
	}

}
