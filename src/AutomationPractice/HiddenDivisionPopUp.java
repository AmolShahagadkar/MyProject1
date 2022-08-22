package AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\OM-PC\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");
//	     WebElement Login	= driver.findElement(By.xpath("//a[text()='Login']"));
//	     Login.click();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.switchTo().frame("/html/body/div[2]/div/div/div/div");
//		
//        WebElement  Close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//        Close.click();
//	
	
	//-------------------------------------------------------------------------
        
		
		
		//ex 02
        driver.get("https://igrmaharashtra.gov.in/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 	   driver.findElement(By.xpath("/html/body/form/div[3]/div[6]/div/div/div[1]/button")).click();
	
	
	
	}

}
