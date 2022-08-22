package LocatorsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\OM-PC\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Basic Locators.
		//  web site : https://www.angelone.in/
		
		//1. id  (login)
		
        driver.findElements(By.id("txtMobileNo"));
        
        //2. name
        driver.findElement(By.name("name"));
        
	}
}
