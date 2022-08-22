package MethodOverlodingConcepts;

public class MainMethodOverloading {
	
	public static void main(int x) {
		System.out.println("Single argument main method"+x);
	} 
	
	public static void main(int x, int y) {
		
		System.out.println("Two argument main method"+(x+y));
	}
	public  void main(int x, int y , int z) {
		System.out.println("Three argument main method"+(x+y+z));
	}
	
	public static void main(String[] args) {
		//MainMethodOverloading mo= new MainMethodOverloading();
		
		main(15);
		main(10,20);
		MainMethodOverloading mo= new MainMethodOverloading();
		mo.main(15,15,15);
	}
}
