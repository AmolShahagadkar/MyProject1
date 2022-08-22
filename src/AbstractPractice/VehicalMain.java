package AbstractPractice;

public class VehicalMain {

	public static void main(String[] args) {
		Bus b=new Bus();
		System.out.println(b.getnumberofwheel());
		//System.out.println(b.getseatcapacity());
		
		
		Car c= new Car();
		System.out.println(c.getnumberofwheel());
		
		Two t=new Two();
		System.out.println(t.getnumberofwheel());
		
	}
}
