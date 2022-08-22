package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAsssingment1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\OM-PC\\Desktop\\chromedriver_win32\\chromedriver.exe");;
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		 // singup page property 
		 WebElement SingnupLink = driver.findElement(By.xpath("//a[text()='Sign Up']"));
		 SingnupLink.click();
		 
		 // get title for verify
//		 String title = driver.getTitle();
//		 System.out.println(title);
		 
		 String expectedtitle = "Sign up for Facebook | Facebook";
		 String actualtitle = driver.getTitle();
		 System.out.println(actualtitle);  // 
		 
		 if(expectedtitle.equalsIgnoreCase(actualtitle)) {
			 System.out.println("Expected Web-page");
		 }else {
			 System.out.println("Unexpected Web-page"
			 		+ "");
		 }
		 
		 WebElement Firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		 Firstname.sendKeys("Abcd");
		 
		 
		 WebElement Lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		 Lastname.sendKeys("Efgh");
		 
		 WebElement MobNum = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		 MobNum.sendKeys("012345789655");
		 
		 WebElement NewPass= driver.findElement(By.xpath("//input[@type='password']"));
		 NewPass.sendKeys("sfshj1456");
		 
		 
		 WebElement Gender = driver.findElement(By.xpath("//input[@value='2']"));
		 Gender.click();
		 
		 
		 WebElement Submit = driver.findElement(By.xpath("//button[@name='websubmit']"));
		 Submit.click();
		 Thread.sleep(2000);
	     driver.quit();
		 
	
		 }
	}


////button[@name='websubmit']"));
//Submit.click();