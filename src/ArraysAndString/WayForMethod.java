package ArraysAndString;

public class WayForMethod {
	
	
	int a=20;       // variable dec+ initilization
	int b=10;
	double d=200.25;
	
//	// case 1.  method will not accept parameter and will not return anything.
//	
//	public void sum() {
//		
//		System.out.println(a+b);
//	}
	
	
	// case 2.  method will not accept parameter and will return anything.
//	public double sum() {
//		
//		return a+d;
//	}
	
	
	// case 3.  method will accept parameter and will not return anything.
	
//	public void sum(int x,int y) {
//		
//		System.out.println(x+y);
//	}
//	
//	
//	 //case 4.  method will accept parameter and will return anything.

	public int sum(int x,int y) {
		
		return(x+y);
	}
	
	public static void main(String[] args) {
		// case1
		
		//WayForMethod wfm=new WayForMethod();
		//wfm.sum();
		
		
		
		// case2
		
//		WayForMethod wfm=new WayForMethod();
//		double z=wfm.sum();
//		System.out.println(z);
//		System.out.println(wfm.sum());
		
		
		//case3
//		WayForMethod wfm=new WayForMethod();
//		wfm.sum(50,40);
//		wfm.sum(100,100);
//		
		
		// case4
		
		WayForMethod wfm=new WayForMethod();
		//int z=wfm.sum(4,5);
		//System.out.println(z);
		
		System.out.println(wfm.sum(4,5));
		
		
		
	}

}
