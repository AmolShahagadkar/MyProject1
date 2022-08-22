package ConstructorPractice;

public class StudentMain {
	public static void main(String[] args) {
		
		// initialized by object
	   //  approach 1
		
//		Student s=new Student();
//		
//		s.roll=101;
//		s.name="Abc";
//		s.grade='A';
//		s.display();		
//				
System.out.println("-----------------------------------------------------------------------------");
		
		
		// Approach 2
//		
//		Student s1=new Student();
//		s1.getStudentdetails(102,"XYA",'B');
//		s1.display();
System.out.println("-------------------------------------------------------------------------------");

        // Aproach 3

        Student s3=new Student(103,"ABCD",'A');
        s3.display();
        

	
	}

}
