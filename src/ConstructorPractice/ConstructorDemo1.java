package ConstructorPractice;

public class ConstructorDemo1 {
	
	// variable declaration
	int a;
	String str;
	
	// Zero argument constructor
	ConstructorDemo1(){
		System.out.println("This is user define zero arrgument:");
		
		a=20;
		str="ABCD";
		}
	
	
	
	
	// User define argument constructor
	
	ConstructorDemo1(int c,String d){
		System.out.println("This is user define argument constructor:");
		a=c;
		str=d;		
		
	}
	
	public void test() {
		
		System.out.println(a);
		System.out.println(str);
	}
	
	
	

}
