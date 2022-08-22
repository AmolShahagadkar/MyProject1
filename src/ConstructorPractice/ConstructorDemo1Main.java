package ConstructorPractice;

public class ConstructorDemo1Main {
	public static void main(String[] args) {
		ConstructorDemo1 t=new ConstructorDemo1();
		
		// zero argument
		t.test();
		
		
		System.out.println("--------------------------------------------------------------------------");
		// argument
		ConstructorDemo1 t1=new ConstructorDemo1(40,"Dsfsg");
            
		t1.test();
	}

	
	
}
