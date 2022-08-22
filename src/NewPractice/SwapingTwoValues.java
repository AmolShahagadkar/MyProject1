package NewPractice;

public class SwapingTwoValues {
	
	public static void main(String[] args) {
		
		int a=10; 
		int b=50;
		
		System.out.println("Values before swapping:"+a+" "+b);
		
		// logic 01: without third variable using + and - 
		
		
		 a=a+b;       // a=10+50    a=60
		 b=a-b;       // b=60-50    b=10
		 a=a-b;      //  a=60-10    a=50
		 
		 System.out.println("Values after swapping:"+a+" "+b);
		 
		 
		 
//		 // Logic 02: without third variable using * and /
//		 
//		 a=a*b;         //a=10*50   a=500
//		 b=a/b;         //b=500/50  b=10
//		 a=a/b;         //a=500/10  a=50
//		 
//		 System.out.println("Values after swapping:"+a+" "+b);
//		 
//		 
//		 
//		 // Logic 03: Single Line without third variable 
//		 
//		 b=a+b-(a=b);
//		 
//		 System.out.println("Values after swapping:"+a+" "+b);
//		 
//		 
//		 
//		 // Logic 04: Bite Code Using xor (^) operator 
//		 
//		 a=a^b;       // 1010
//		 b=a^b;       
//		 a=a^b;
//		 
//		 System.out.println("Values after swapping:"+a+" "+b);
//		 
//		 
//		 // Logic 05: Third variable (Using thirs variable)
//		 int t=a;
//		 a=b;
//		 b=t;
//				 
		 
		 
	
	}

}
