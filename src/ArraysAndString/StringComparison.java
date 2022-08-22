package ArraysAndString;

public class StringComparison {
	public static void main(String[] args) {
		
		 String s0="Welcome";
		 String s1="WELCOME";
		 String s3="Welc";
		
		 //8. equqls() : compare two strings
		 
		 System.out.println(s0.equals(s1)); //boolean value ==> also check the case==> case sensitive method.
			
		//9. equalsingnorecase():- compare the two strings but the casing will not matter. ==> only validate the content
		
		 System.out.println(s0.equalsIgnoreCase(s1));  //true
		
		//10. contains() :- comapare one string is a part of another string ==> case sensitive
		
		System.out.println(s0.contains(s3));
		
		//11. isempty() :- will check given string is empty  or not.
		
		System.out.println(s1.isEmpty());  // boolean value true or false
		
		//12. concats :- will use to add two strings   (+ operators :- user message and program output)
		
		String s4="ABC";
		String s5="DEF";
		
		System.out.println(s4.concat(s5));
		System.out.println(s4.concat("GHI"));
		//  System.out.println(s4+s5);
		
		//13. startswith :- will check any string starts with a perticular pattern.
		
		System.out.println(s4.startsWith("AB"));   //boolean true false
		
		//14. endswith :- will check any string ends with a perticular pattern.
		
		System.out.println(s5.endsWith("EF"));
		
		
		//15. replace :- will help you to replace the part of the string by new string or new combination of characters

		String s6="This is a java Automation class";
		System.out.println(s6.replace("java", "python")); //temporary operation ==> this is  not permant
		
		String s7=s6.replace("java","python"); // permanent changed in string 
		System.out.println(s7);
		System.out.println(s6.replace("Automation","Devlopment"));
		
		//16. substring :- extract the part/portion of the string based on index
		
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(3,6));
		
		//17. split() :- to split your given string based  on specific pattern.
		
		String s8="This@is@java@automation@class";
		String words[]=s8.split("@");
		System.out.println(words.length);
		
		for(int i=0;i<words.length;i++) {
			System.out.print(" " +words [i]);
		}
		
	}

}


