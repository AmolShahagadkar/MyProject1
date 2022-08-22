package MethodOverlodingConcepts;

public class ConstructorOverloading {
	
	ConstructorOverloading(){
		
		System.out.println("This is zero arrgument constructor");
	}
	
	ConstructorOverloading(int a){
		
		System.out.println("This is argument constructor"+a);
	}
	
	ConstructorOverloading(int a,int b){
		
		System.out.println("This two is argument constructor"+a+b);
		
	}
	ConstructorOverloading(int a,double b){
		
		System.out.println("This two is argument constructor"+a+b);
		
	}
	ConstructorOverloading(double a,int b){
		System.out.println("This two is argument constructor"+a+b);
		
	}
	
	ConstructorOverloading(double a,int b,double c){
		
	System.out.println("This three is argument constructor"+a+b+c);
	}
	
	public static void main(String[] args) {
		
		
		new  ConstructorOverloading();
		new ConstructorOverloading(5);
		new ConstructorOverloading(5,5);
		new ConstructorOverloading(5,5.2);
		new ConstructorOverloading(10.5,5);
		new ConstructorOverloading(10.5,5,5.5);
		
		
	}
}
