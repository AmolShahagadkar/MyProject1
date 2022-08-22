package AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic1 {

	
		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\OM-PC\\Desktop\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.youtube.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(2000);
			driver.close();
			
		}

	}



