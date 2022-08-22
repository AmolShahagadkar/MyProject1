package AbstractPractice;

public  class DemoMain extends Demo1 {
	
	public void test2() {
		System.out.println("This is test 2 complted in concrete class");
		
	}
public static void main(String[] args) {
	
	DemoMain dm = new DemoMain();
	dm.test();
	dm.test1();
	dm.test2();
}
}
