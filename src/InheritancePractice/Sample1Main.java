package InheritancePractice;

public class Sample1Main extends Sample1 {
	
	int a=10;  // Global Variable

	public void test() {
		
		int a=40; // Local variable
		
		
		System.out.println(a);  // 40 Local variable
		System.out.println(this.a);  //  10 Global variable
		System.out.println(super.a);  // Parent class  variable
		}

	
	public static void main(String[] args) {
		Sample1Main s= new Sample1Main();
		s.test();
	}
	
}
