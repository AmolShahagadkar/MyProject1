package JavaBasics;

public class VariablePractice {
	
	public static void main(String []args) {
		
		//1.student rollno :- 101==>numeric==>integer
		//2.student name   :- ABC PQR XYZ ==> string
		//3.grade          :- A ==>char
		
		
		//declaration of variable.
		
		 int roll_Number;
		 String Student_name;
		 char grade;
		 
		 
		 // Initialize the variable ==> assigning the values to the variables.
		 
		 roll_Number=101;
		 Student_name= "ABC PQR XYZ";
		 grade='A';
		 
		 //usage
		  
		 System.out.println(roll_Number);
		 System.out.println(Student_name);
		 System.out.println(grade);
		 
		 // Single line approach ==> declare and initialize 
		 
		 int roll_Number2 =201;
		 String name2 ="efg ijk lmn";
		 char grade2='B';
		 
		 System.out.println(roll_Number2);
		 System.out.println(name2);
		 System.out.println(grade2);
		 
		 //print this student information in one single line
		 
		 System.out.println(roll_Number2+name2+grade2);
		 
		 //printing with user massage
		 
		 System.out.println("student Rollnumber:-"+roll_Number2+"Student Name:-"+name2+"Student grade:-"+grade2);
		 
		 
		 // Generating five Student information
		 
		 // Student 301
		 
		 int roll_number3 = 301;
		 String name3 = "ACB QWE RTY";
		 char grade3 ='A';
		 
		 System.out.println("Student rollnumber:-"+roll_number3+"Student name:-"+name3+"student grade:-"+grade3);
		 
		 // Student 302
		 int roll_number4 = 302;
		 String name4 = "ASD FGH JKL";
		 char grade4 = 'A';
		 
		 System.out.println("Student rollnumber:-"+roll_number4+"Student name:-"+name4+"Student grade:-"+grade4);
		 
		 //Student 303
		 int roll_number5 = 303;
		 String name5 = "ZXC VBN MNB";
		 char grade5 = 'B';
		 
		 System.out.println("Student rollnumber:-"+roll_number5+"Student name:-"+name5+"Student grade:-"+grade5);
		 
		 // Student 304
		 int roll_number6 =304;
		 String name6 = "LKJ HGF SDF";
		 char grade6 = 'B';
		 
		 System.out.println("Student rollnumber:-"+roll_number6+"Student name:-"+name6+"Student grade:-"+grade6);
		 
		 // Student 305
		 int roll_number7 = 305;
		 String name7 = "POI UYT QWE";
		 char grade7 = 'A';
		 
		 System.out.println("Student rollnumber:-"+roll_number7+"Student name:-"+name7+"Student grade:-"+grade7);
		 
		 // Student 306
		 int roll_number8 = 306;
		 String name8 = "DFG HBN CDR";
		 char grade8 = 'C';
		 
		 System.out.println("Student rollnumber:-"+roll_number8+"Student name:-"+name8+"Student grade:-"+grade8);
		 
		 
		 
		 
		 
	}

}
