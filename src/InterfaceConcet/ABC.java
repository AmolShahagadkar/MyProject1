package InterfaceConcet;

public interface ABC {
	
	int a=10;  // static or final variable
	int b=60;  // static and final
	void m1(); // public and abstract by default
	
	public abstract void m2();  // can declare like this also both also valid.
	
	void sum(int x, int y);  // method with parameter and no return type
	
	int difrence(int x , int y);  // method with parameter and return type

}


