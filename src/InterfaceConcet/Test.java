package InterfaceConcet;

public class Test implements ABC {
 

	
	public void m1() {
		System.out.println(a);
		
	}


	public void m2() {
		System.out.println(a);
		
	}


	public void sum(int x, int y) {
		System.out.println(x+y);
		
	}

	
	public int difrence(int x, int y) {
	
		return(x-y);
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		t.m1();
		t.m2();
		t.sum(30,45);
		System.out.println(t.difrence(5,50));
	}
	

}
