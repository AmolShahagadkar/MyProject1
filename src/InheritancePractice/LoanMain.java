package InheritancePractice;

public class LoanMain {
	public static void main(String[] args) {
		
		Hloan hl = new Hloan();
		 
		hl.name("ABC");
		hl.age(40);
		hl.dateofbirth();
		hl.add();
		hl.adharcard();
		hl.bankpassbook();
		hl.mob();
		hl.pancard();
		
		hl.banglow();
		hl.newflat();
		hl.oldflat();
		
		System.out.println("_________________________________________________________________________");
		
		
		Ploan pl = new Ploan();
		
		pl.name("XYZ");
		pl.age(28);
		pl.dateofbirth();
		pl.add();
		pl.adharcard();
		pl.bankpassbook();
		pl.mob();
		pl.pancard();
		
		pl.personalloan();
		
		System.out.println("_______________________________________________________________________");
		Vloan vl = new Vloan();
		
		vl.name("LMN");
		vl.age(35);
		vl.dateofbirth();
		vl.add();
		vl.adharcard();
		vl.bankpassbook();
		vl.mob();
		vl.pancard();
		
		vl.twoweeler();
		vl.threeweeler();
		vl.fourweeler();
		vl.sixweeler();
		
		System.out.println("-------------------------------------------------------------------------");
		
		
		
	}

}
