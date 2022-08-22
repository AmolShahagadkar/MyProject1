package AutomationPractice;

public class ExceptionHandlingPractice {
	
	public static void main(String[] args) {
		
System.out.println("The program is started");
		
		// 1 arithmatic exception.
		
//		int a=100;
//		System.out.println(100/0); 
		
		//2. Null pointer exception
		
//		String s= null;
//		System.out.println(s.length());
		
		// 3. Number Format exception
		
//		String s ="abcdef";
//		int i = Integer.parseInt(s);
//		System.out.println(i);
		
		//4. ArrayIndexOutOfBoundsException
//		int a [] = new int [5];    // 0 ==> 4
//		a[10] =5000;
//		
		
		
		// Exception Handelling
//	try {	
//		int a=100;
//		System.out.println(100/0);
//	}  catch (Exception e1) {
//		e1.printStackTrace();
//		System.out.println("Exception captured by generic block");
//	}
//	finally {
//		System.out.println("This is Finally block--> excuted with try block as well as catch block");
//	}
		
	
	
	// 2nd risky code
	try {
	String s= null;
	System.out.println(s.length());
	}catch (Exception e1) {
		e1.printStackTrace();
		System.out.println("Exception captured by generic block");
	}finally {
		System.out.println("This is Finally block2--> excuted with try block as well as catch block");
	}	
		System.out.println("The program is finished");
	}
		
	

}
