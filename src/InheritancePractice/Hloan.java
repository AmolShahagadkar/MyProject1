package InheritancePractice;

public class Hloan extends Loan{
	
	public void banglow(){
		System.out.println("Loan requird above 1cr");
		System.out.println("Rate of interest 6.75%");
	}
	
	public void oldflat(){
		
		System.out.println("Loan requird below 1cr");
		System.out.println("Rate of intrest 7.25");
	}
	
	public void newflat() {
		
		System.out.println("Loan requird 1cr");
		System.out.println("Rare of intrest 7.75");
	}

}
