package InterfaceConcet;

public class HybridInheritance extends LMN implements B1,B2 {

	@Override
	public void m3() {
		System.out.println("This is complte method for the interface B1");
		
	}

	@Override
	public void m2() {
		System.out.println("This is complte method for the interface B2");
		
	}

	@Override
	public void m4() {
		System.out.println("Logic ==>  1 time only");
		
	}
	
	public static void main(String[] args) {
		
		
		 HybridInheritance hi= new  HybridInheritance();
		 
		 hi.m1();
		 hi.m2();
		 hi.m3();
		 hi.m4();
		
		
	}

	  
	  
	  
}
