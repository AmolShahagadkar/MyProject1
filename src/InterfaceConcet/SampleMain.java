package InterfaceConcet;

public class SampleMain implements Sample2,Sample1 {
	
	public void m1(){
	
		System.out.println("This is method from super1 ");
		
	}

		public void m2(){
			
			System.out.println("This is method from super1 ");
	
		
	}


	public void m3(){
		System.out.println("This is method from super2 ");		
	}


	public void m4(){
		
		System.out.println("This is method from super2");
	
	}




public static void main(String[] args) {
	
	SampleMain sm=new SampleMain();
	
	
	

	sm.m2();
	sm.m3();
	sm.m4();
	sm.m1();
	
	
	
}



}
	
