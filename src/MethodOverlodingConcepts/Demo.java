package MethodOverlodingConcepts;

public class Demo {

	
	 // Method overloading
	
	public void sum(int a, int b) {
		
		System.out.println(a+b);
	}
	
	public void sum(int a, double b) {
		
		System.out.println(a+b);
	}
	
	public void sum(double a, int b) {
		System.out.println(a+b);
	}
		
	
	public void sum(double a, double b) {
		
		System.out.println(a+b);
	}
	
	public void sum(int a,int b,int c) {
		
		System.out.println(a+b+c);
	}
	
	public void sum(double a,double b,double c) {
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) {
		
		Demo d=new Demo();
		
		d.sum(5,5);
		d.sum(10,5.5);
		d.sum(4.5, 5);
		d.sum(5.5, 5.50);
		d.sum(10.5, 10.5,5.3);
		d.sum(40, 45, 40);
	}
}
