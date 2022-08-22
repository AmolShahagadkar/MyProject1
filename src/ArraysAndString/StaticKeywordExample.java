package ArraysAndString;

public class StaticKeywordExample {
	
	int empid;
	String empname;
	static int depno;
	
	public void getvalues(){
		
		System.out.println("The Employee id:" +empid);
		System.out.println("The Employee name:" +empname);
		System.out.println("The Employee department:" +depno);
		
		
	
	}
	public static void main(String[] args) {
		
		StaticKeywordExample ske1=new StaticKeywordExample();
		
		ske1.empid=101;
		ske1.empname="ABC";
		       depno=20;
		
		ske1.getvalues();
		
		
		
		System.out.println("-------------------------------------------------------------");
		
		StaticKeywordExample ske2=new StaticKeywordExample();
		
		ske2.empid=102;
		ske2.empname="DEF";
		       
		ske2.getvalues();
		
		System.out.println("-------------------------------------------------------------");
		
       StaticKeywordExample ske3=new StaticKeywordExample();
		
		ske3.empid=203;
		ske3.empname="XYZ";
		       
		ske3.getvalues();
		
		System.out.println("-------------------------------------------------------------");
		
		StaticKeywordExample ske4=new StaticKeywordExample();
		
		ske4.empid=105;
		ske4.empname="SGF";
		depno=30;
		       
		ske3.getvalues();
		
		
       System.out.println("-------------------------------------------------------------");
		
		StaticKeywordExample ske5=new StaticKeywordExample();
		
		ske5.empid=405;
		ske5.empname="EDR";
		depno=45;
		       
		ske5.getvalues();
		
		
		
	}
	

}
