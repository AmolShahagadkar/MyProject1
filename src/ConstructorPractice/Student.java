package ConstructorPractice;

public class Student {
	
	   int roll;
	   String name;
	   char grade;
	   
	   
	   // by using constructor for approach 3 in main method
	   
	   Student(int rn,String nm,char g){  // user defined constructor with argument 
		   
		   roll=rn;
		   name=nm;
		   grade=g;
	}
	   
//	   public void getStudentdetails(int rn,String nm,char g) {
//		   
//		   roll=rn;
//		   name=nm;
//		   grade=g;
//		   
//		   
//	   }
	   
	   
	   
	   
	   // to print values 

	public void display(){
		   
		   System.out.println("The student roll no is:"+roll);
		   System.out.println("The student name is:"+name);
		   System.out.println("The student grade is:"+grade);
	   }

	     
}
