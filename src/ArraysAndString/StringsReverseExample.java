package ArraysAndString;

public class StringsReverseExample {
	
	// String reverse is important topics interviewer ask the reverse qutions
	
	// how to reverse string in java . and 2 palindrome
	public static void main(String[] args) {
		
		

		
		String  original = "madam";
		String reverse= "";
		
		for (int i=original.length()-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
		}
		System.out.println(reverse);
		
		if(original.equals(reverse)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
	}
}
		
	
	
	


