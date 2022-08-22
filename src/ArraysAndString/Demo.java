package ArraysAndString;

public class Demo {
	
	// 2 ststic method 
	// 2 non static method
	
	public static void test1() {

		// logic
		System.out.println("This is static method test1");
	}
	
	public static void test2() {
		//logic
		System.out.println("Trhis is static method test2");
		
	}
	
	// non static method
	
	public void test3() {
		
		System.out.println("This is non static method test3");
	}
	  
	 public void test4() {
		 System.out.println("This is non static method test4");
	 }
		
	 
	 public static void main(String[] args) {
		 
		// execute ==> main
			
			// call :- static method. ==> classname.methodname()
		 
		Demo.test1();
		Demo.test2();
		
		
		// call : - non static method == objectname.methodname()
        // object creation == classname objectname = new classname()
		Demo d=new Demo();
		
		d.test3();
		d.test4();
		
		test1();
		test2();
	}

}
