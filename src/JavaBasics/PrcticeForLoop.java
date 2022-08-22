package JavaBasics;

public class PrcticeForLoop {
	public static void main(String[] args) {
		
		
		// 1.  triangular pattern.
//		
//		for(int i=1; i<=5; i++) {                // outer loop(row)
//			for (int j =1 ; j<=i; j++) {         // inner loop(col.)
//			System.out.print("*");              //  print the *
//			}                                   // next line
//			System.out.println();
//		}
		 
		// 2.triangle pattern
		
//		for(int i=1; i<=5; i++) {                // outer loop(row)
//			for (int j =5 ; j>=i; j--) {         // inner loop(col.)
//			System.out.print("*");              //  print the *
//			}                                   // next line
//			System.out.println();
//		}
		
		
//		// 3.    4.  9.
		
		for(int i=1;i<=5;i++) 
		{                                     // outer loop(row)
			for (int j=4; j>=i; j--)
		{
			System.out.print(" ");        // print space
	}
				
			for(int k=1;k<=i;k++)
		{
		
				System.out.print("*");       //  print the *
		} 
		                                  
			System.out.println();           // next line
	}
		
		
	
//		for(int i=1;i<=4;i++)               // outer loop(row)
//		{                                     
//			for (int j=1; j<=i; j++)
//		{
//				System.out.print(" ");        // print space
//	}
//			
//			for(int k=5;k>i;k--)
//		{
//		
//				System.out.print(" *");       //  print the *
//		} 
//		                                  
//			System.out.println();           // next line
//		
//		}
		
		
		// 7. using 1 prog
//		for(int i=1; i<=5; i++) {                // outer loop(row)
//			for (int j =1 ; j<=i; j++) {         // inner loop(col.)
//			System.out.print("*");              //  print the *
//			}                                   // next line
//			System.out.println();
//		}
//		
//		for(int i=1; i<=4; i++) {                // outer loop(row)
//			for (int j =4 ; j>=i; j--) {         // inner loop(col.)
//			System.out.print("*");              //  print the *
//			}                                   // next line
//			System.out.println();
//		
//		
//		}
//	
		
		// 8 unig 3 prog
		
//		     for(int i=1;i<=5;i++) 
//			{                                     // outer loop(row)
//				for (int j=4; j>=i; j--)
//			{
//					System.out.print(" ");        // print space
//			}
//					
//				for(int k=1;k<=i;k++)
//			{
//			
//					System.out.print("*");       //  print the *
//			} 
//			                                  
//				System.out.println();           // next line
//			}
		

		
//		for(int i=1;i<=4;i++)                    // outer loop
//		 {
//			 
//		 for(int j=1;j<=i;j++)                   // loop for space
//		 {
//			 System.out.print(" ");
//		 }
//		
//	     for(int k=4;k>=i;k--)                   // inner loop for print star
//			 {
//				 
//				 System.out.print("*");
//	      }
//			System.out.println();	
//		 }
//		 
		 //------------------------------------------------------------------------------
		 
//		 for(int i=1;i<=5;i++)                     // outer loop
//		 {
//			 
//		 for(int j=1;j<=5;j++)                    // inner loop
//		 {
//			                                 
//			 if(i>=2 && i>=2 && j>=4 && j>=4)           // condition
//			 System.out.print("*");
//			 else
//				 System.out.print(" ");
//		 }
//		{
//				 System.out.println();	
//		 }
//	   }	 
//		 
//			for(int i=1; i<=5; i++) {                // outer loop(row)
//			for (int j =5 ; j>=i; j--) {         // inner loop(col.)
//			System.out.print("*");              //  print the *
//			}                                   // next line
//			System.out.println();

			//}
		
	}
}
