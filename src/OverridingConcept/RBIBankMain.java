package OverridingConcept;

public class RBIBankMain {
	
	public static void main(String[] args) {
		
		RBIBank r=new RBIBank();
		System.out.println(r.rateofIntrest());
		
		SBIBank s=new SBIBank();
		System.out.println(s.rateofIntrest());
		
		HDFCBank h=new HDFCBank();
		System.out.println(h.rateofIntrest());
		
		PNBBank p=new PNBBank();
		System.out.println(p.rateofIntrest());
	}

}
