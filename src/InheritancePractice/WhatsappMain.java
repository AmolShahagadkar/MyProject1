package InheritancePractice;

public class WhatsappMain {
	
	
  public static void main(String[] args) {
	  
	  WhatsappV1 v = new WhatsappV1();
	  
	  v.textmsg();
	  
	  System.out.println("___________________________________________________________________________");
	  
	  WhatsappV2 va = new WhatsappV2();
	  
	  va.videocalling();
	  va.textmsg();
	  
	  System.out.println("____________________________________________________________________________");
	  
	  
	  WhatsappV3 vb=new WhatsappV3();
	   vb.videocalling();
	   vb.textmsg();
	   vb.adiocalling();
	   vb.payment();
	
	   System.out.println("____________________________________________________________________________");
	   
	  
	
}
}
