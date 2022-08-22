package AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExicuterUsingUlilityClass {
	
	// Java Exicuter using utility class
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OM-PC\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//1. Drawing the border around the element.
		
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.switchTo().frame("iframeResult");
//		WebElement TryitBtn = driver.findElement(By.xpath("//button[text()='Try it']"));
//	    Utility.borderbyJS(driver, TryitBtn);
//	    
//	    
	    
        //2. Capture the title of the webpage.
		
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		//JavascriptExecutor js = ((JavascriptExecutor)driver);
//		//Utility.titlebyJS(driver);
//		System.out.println(Utility.titlebyJS(driver));
//		
//		
		
        // 3. Click on perticular element. // Element.click();
		
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.switchTo().frame("iframeResult");
//		WebElement Tryitbtn = driver.findElement(By.xpath("//button[text()='Try it']"));
//		Utility.clickbyJS(driver, Tryitbtn);
		
		
        // 4. Generate an alert.
		
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Utility.alertbyJS(driver,"This is alert by js");
		
		
		
//		//5 . Refreshing the page
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(2500);
//		Utility.refreshbyJS(driver);
		
		
		
		//6. Scrolling of the webpage.
		
				// scroll down.
						
//				driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
//				driver.manage().window().maximize();
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//				Utility.scrolldownbyJS(driver, 0, 2500);
				
				
		        // scroll  up
//				
//				driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
//				driver.manage().window().maximize();
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//				Utility.scrolldownbyJS(driver, 0,2500);
//				Thread.sleep(2500);
//				 Utility.scrolldownbyJS(driver, 0,-500);
//				
				
				// scroll into view :- this will scroll upto the perticular webelement.
				
				
				driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement element = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
			    Utility.clickbyJS(driver, element);
			    
			    
			    
			    
			    
	}
	  

}
