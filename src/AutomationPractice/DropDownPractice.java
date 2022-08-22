package AutomationPractice;



//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\OM-PC\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		
		WebElement SignUp = driver.findElement(By.xpath("//a[text()='Sign Up']"));
		SignUp.click();
		Thread.sleep(2000);
		// identify the listbox which needs to be handled.
		
	    WebElement	birthday=driver.findElement(By.xpath("//select[@name='birthday_day']"));
	    
	   // create the object of select class and pass  the respective element
		 Select s=new Select(birthday);
		 
	   // To  handle the values use any method
		
	    //(1):- s.selectByIndex(index);   //0==> n-1
	    //(2):- s.selectByValue(arg0);     // string
		//(3):- s.selectByVisibleText(arg0);  // string
		 
		//s.selectByIndex(18); // date -19
		//s.selectByValue("19"); // date - 19 
		 s.selectByVisibleText("19");  // date - 19
		 
		 WebElement birthMonth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		 
		 Select s1 = new Select(birthMonth);
		 //s1.selectByIndex(4); // month- May
         //s1.selectByValue("1"); // month - jan 
		   s1.selectByVisibleText("Mar");// month - march
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("2015");
		
//		List<WebElement> years = s2.getOptions();
//		System.out.println("Total Years in the list "+ years.size());
//		
//		for (int i=0; i< years.size();i++) {
//			String year1 = years.get(i).getText();
//			System.out.println(i+" "+year1);
//		}
	
		// advanced for loop.
//		int j=1;
//		for(WebElement year1:years) {
//			System.out.println(j+" "+year1.getText());
//						j++;
//		}
		
		// check the default option.
//		WebElement birthyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
//		Select s3 = new Select(birthyear);
//		String firstopt = s3.getFirstSelectedOption().getText();
//		System.out.println(firstopt);
//		
		
		
		
		
	}

}
