package ArraysAndString;

public class StringPractice {
	public static void main(String[] args) {
	
	String s="Velocity";
	
	String s1=" I am leaving in Maharashtra ";
	
	// 1. Length () :- to find out the number of characters inside the string.
	System.out.println(s.length());
	System.out.println(s1.length());
	
	// 2. toUppercase() :- convert the lower case into the upper case.
	System.out.println(s.toUpperCase());
	
	// 3. tolowerCase() :- convert the uppercase or regular case letters into lower case.
	System.out.println(s.toLowerCase());
	
	// 4. charatAt():- this is used to find out the letter/alphabet available at particular index.
	System.out.println(s.charAt(4));
	
	
    // 5. indexOf() :- will help you to find out the index of any character/ first occuranace.
	System.out.println(s.indexOf("i"));
	
	// 6. lastIndexOf() :- will help you to find out the last occurance of any character.
	System.out.println(s.lastIndexOf("i"));
	
	// 7. trim() :- will help you to remove unwanted space at the starting or ending of the string.
	System.out.println(s1.trim());
	
	System.out.println(s1);
	
  }
}