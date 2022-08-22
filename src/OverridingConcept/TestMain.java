package OverridingConcept;

public class TestMain {
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.property();
		p.marrage();
		
		Child c=new Child();
		c.property();
		c.marrage();
	}

}
