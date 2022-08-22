package AutomationPractice;



import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class fluentWait {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\OM-PC\\Desktop\\chromedriver_win32\\chromedriver.exe");;
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		// fluent wait does not supported by selenium letest verson
		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver);
//		.args (10,TimeUnit.SECONDS);
//		.pollingEvery(2,TimeUnit.SECONDS);
//		.ignoring(NoSuchElementException.class);
//
//		
//		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver);
//		.withTimeout(Duration.ofSeconds(30));
//		.pollingEvery(Duration.ofSeconds(2));
//		.ignoring(NoSuchElementException.class);
		
		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(10, TimeUnit.SECONDS)
			       .pollingEvery(2, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);
					
					
					Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
				    .withTimeout(Duration.ofSeconds(30))
				    .pollingEvery(Duration.ofSeconds(2))
					 .ignoring(NoSuchElementException.class);
					

	
		
		
	}
}
