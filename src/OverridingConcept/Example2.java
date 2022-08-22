package OverridingConcept;

public class Example2 extends Example{
	public static void m1() {
		
		System.out.println("This method from from child class");
	}
	
	public static void main(String[] args) {
		//Example2 e1 =new Example2();
		
	Example.m1();
	Example2.m1();
	
	Example e11=new Example2();
	e11.m1();
		
		
	}

}
