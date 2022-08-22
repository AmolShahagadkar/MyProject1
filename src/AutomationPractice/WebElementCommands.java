package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
	     // we have located the elements but we havent performed any action.
		// method from interface ==>  webelement.
	   // some methods ==> intraction with the webpage. ==> actions on web elements.

	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\OM-PC\\Desktop\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	 // get link
	 driver.get("https://www.facebook.com/");
	 
	//1. sendkeys() :-  text field ==> data pass

//	 WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
//     Username.sendKeys("30thAprilFacebookAccount");
//     
//     
//     WebElement Pass = driver.findElement(By.xpath("//input[@id='pass']"));
//     Pass.sendKeys("123Amsh");
//     
//     driver.findElement(By.xpath("//input[@id='email']"));
//     
//   //2. click():- clicking ==> buttons/ radiobutton/ checkbox/ link 
//     
//	 WebElement LoginBt = driver.findElement(By.xpath("//button[@type='submit']"));
//	 LoginBt.click();
	 
//	 // singup page property 
//	 WebElement SignupLink = driver.findElement(By.xpath("//a[text()='Sign Up']"));
//	 SignupLink.click();
	 
	//3. isEnabled :- state of  the element.
	 
//	 WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
//	 System.out.println(Username.isEnabled());
//	 
//	 if(Username.isEnabled()==true) {
//		 
//		 System.out.println("The Element is Enable");
//	 } 
//	 else
//	 {
//		 System.out.println("The Element is diseble");
//		 
//	 }
	 
	//4. isDisplayed :- visualization of an element.
	 
//	 WebElement FBlogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
//	 
//	 FBlogo.isDisplayed();
//	 
//	 if(FBlogo.isDisplayed()==true) {
//		 
//		 System.out.println("FB logo is Displayed");
//	 
//	}
//      else
//	 {
//		 
//		 System.out.println("FB logo is not displayed");
//		 
//	 }
//	 
//	//5. isSelected :- checkbox and radioButton
//	 
//	 WebElement SingupLink = driver.findElement(By.xpath("//a[text()='Sign Up']"));
//	 SingupLink.click();
//	 
//	 WebElement WomenRadioBt = driver.findElement(By.xpath("//input[@value='1']"));
//	 WomenRadioBt.click();
//	 
//	 
//	 if(WomenRadioBt.isSelected()==true) {
//	 System.out.println("Women Radio button is selected");
//	 } else {
//		 System.out.println("Women Radio button is not selected");
//	 }
//	 
//	 
	 // 6.gettext:- method will help  you to extract the text component from the webelement.
//	 WebElement tagline = driver.findElement(By.xpath("//h2[starts-with(text(),'Facebook helps you')]"));
//     String ActualString = tagline.getText();
//	
//	
//	String ExpectedString = "Facebook helps you connect and share with the people in your life.";
//	
//	if (ActualString.equals(ExpectedString)) {
//		System.out.println("TestCase is Passed");
//	}else {
//		System.out.println("TestCase is failed");
//	}
//	 
//	//7. get attribute:- method is used to get the attribute value of any element.
//		
	 WebElement Username1 = driver.findElement(By.xpath("//input[@id='email']"));
	 System.out.println( Username1.getAttribute("aria-label"));
     }
	}
	

