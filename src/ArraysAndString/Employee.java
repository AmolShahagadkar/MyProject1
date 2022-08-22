package ArraysAndString;

public class Employee {
	
		
		// variable declaration static/non static
		
		int empid;         
		String empname;
		double empsal;
		int empdep;
		String job;
		
		public void display(){          // method--> logic--information
			
			System.out.println(empname);
			System.out.println(empid);
			System.out.println(empsal);
			System.out.println(empdep);
			System.out.println(job);
			
	}
		public static void main(String[] args) {
			
			Employee e=new Employee();
			
			e.empid=123;
            e.empname="ABCD";
            e.empsal=25456.45;
            e.empdep=12;
            e.job="tester";
            e.display();
			
			
		}
		
		
		
		
	}


