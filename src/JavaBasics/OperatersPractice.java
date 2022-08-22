package JavaBasics;

public class OperatersPractice {
	
	public static void main (String []args ) {
		
		
		int a = 40;
		int b = 50;
		
		//Arithmetic operator : +,-,*,/,%
		
		System.out.println("--------------------------Arithmetic Operaters----------------------");
		System.out.println("sum of a and b is:"+(a+b));
		System.out.println("sub of a and b is:"+(a-b));
		System.out.println("mul of a and b is:"+(a*b));
		System.out.println("div of a and b is:"+(b/a));
		System.out.println("mod of a and b is:"+(b%a));
		
		//Relational operator (comparison operator )--> ==,<,>,<=,>=,!=
		
		System.out.println("--------------------------Relational Operator-----------------------");
		System.out.println("a is equal to b:"+(a==b)); //false
		System.out.println("a is lessthan b:"+(a<b)); //true
		System.out.println("b is greterthan a:"+(b>a)); // true
		System.out.println("b is lessthan eual to a:"+(b<=a)); // false
		System.out.println("a is gretterthan equal to b:"+(a>=b)); //false
		System.out.println("a ias not equal to b:"+(a!=b)); //true
		
		// Logical operator && || !
		//work between to boolean
		 
		boolean x=true;
		boolean y=false;
		
		System.out.println("---------------------------Logical Operator---------------------------");
		System.out.println(x&&y); //false
		System.out.println(x||y); // true
		System.out.println(!x);   // false
		System.out.println(!y);   // true
		
		
		// increment and decrement ---> ++ , --
		System.out.println("--------------------------increment and Decrement----------------------");
		a=40;
		a++;             //a=a+1;
		System.out.println(a);
		
		b=50;
		b--;            //b=b-1;
		System.out.println(b);
		
		
		
		
		
		
		
	}

}
