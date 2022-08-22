package JavaBasics;

public class Practice1 {
	
	public static void main(String[] args) 
	{
		
//		for(int i=1;i<=5;i++)                     // outer loop
//	{
//				 
//	 for(int j=1;j<=5;j++) 
//	 {                   // inner loop
//			 
//	  if(i==1||j==1||i==5||j==5) 
//	  {
//	            	                     // condition
//	             
//	 System.out.print("*");
//	 }
//	else
//	{
//				 
//	 System.out.print(" ");
//	}
//}		
//	 System.out.println();	
//			 
//	 }	
//		
		
		
		// This for  loop is for row increment
				for (int i=1;i<=5;i++) {
					for (int j=4;j>=i;j--) {
						System.out.print(" ");
					} // This for loop is to print spaces
					for (int k=1;k<=i;k++) {
						System.out.print("*");
					} // This for loop is to print *
					System.out.println();
				}
		
		
		
	}
}
	
	
		
	
	
