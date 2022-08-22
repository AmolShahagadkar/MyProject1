package InheritancePractice;

public class ThiskeywordExample {
	
	// variable declaration
	
	int a;
	int b;
	
	// variable initialization  ==> obj method constructor
	
	
	public void getvalues(int a,int b) {
		
		this.a=a;
		this.b=b;
	}
	
	public void print() {
		
		System.out.println(a);
		System.out.println(b);
	}
		
	public static void main(String[] args) {
		
		
		ThiskeywordExample  tk =new ThiskeywordExample();
		tk.getvalues(25,25);
		tk.print();
	}
		
	

}
