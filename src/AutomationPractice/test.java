package AutomationPractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class test {
	
	public static void main(String[] args) {
		
	     // 1. To launch the browser 
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\OM-PC\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		 // 2. get the url
//		 driver.get("http://www.sbi.co.in");
		 
		 // 3.to close the browser  (it close current tab only)
//		 driver.close();
		 
		 // 4.quit to close browser (it close all tabs in browser)
//		 driver.quit();
		 
		 // 5. getcurrenturl() :- browser currenty which url hit.
		  
//		 String url=driver.getCurrentUrl();
//		 System.out.println(url);
		 
		 // 6. gettitile():-  grt current web page title
//		 String title = driver.getTitle();
//		 System.out.println(title);
		 
		// 7. Maximize ==> this method will be used to maximize browser.
//		 driver.manage().window().maximize();
		 
		 
		 // 8. Navigate :- get :- url hit
		   
//		 driver.navigate().to("https://www.facebook.com/");
//		 driver.navigate().to("http://www.sbi.co.in");
//		 driver.navigate().forward();
//		 driver.navigate().back();
//		 driver.navigate().refresh();
		 
		// 9. Set size  ==> setsize();
		 
		 Dimension d = new Dimension(50,200);
		 driver.manage().window().setSize(d);
		 
		//10. SetPosition:- browser Position
		 
//		 Point p=new Point(100,200);
//		 driver.manage().window().setPosition(p);
		 
		 
		 
	//	 System.out.println("__________________________________________________________________________");
		 
		 
		 // program for practice  flipcart
		 
		 // 1. lunching flipkart web site 
		 
//		 System.setProperty("webdriver.chrome.driver","C:\\Users\\OM-PC\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 
//		 WebDriver driver = new ChromeDriver();
		 
		 // 2. url
		 
//		 driver.get("https://www.flipkart.com/");
		 
		 
		 //3 . close
         
		// driver.close();
		 
		 // 4. quit
		 
		// driver.quit();
		 
		 // 5. maximize
		 
//		 driver.manage().window().maximize();
		 
		 
		 // 6. crrurent url
		 
//		 String c=driver.getCurrentUrl();
//		 System.out.println(c);
		 
		 // 7. title
		 
//		 String t=driver.getTitle();
//		 System.out.println(t);
		 
		 // 8. navigation
		 
//		 driver.navigate().to("https://www.amazon.in/");
//		 driver.navigate().back();
//		 driver.navigate().forward();
//		 driver.navigate().refresh();
		 
		 // 9. size
		 
//		 Dimension d= new Dimension(40,60);
//		 driver.manage().window().setSize(d);
		 
		 
		 // 10. position
		 
//		 Point p= new Point(40,60);
//		 driver.manage().window().getSize();
		 
		 
		 System.out.println("_________________________________________________________");
		 
		 // 1 set browser
		 
		
//		 System.setProperty("webdriver.chrome.driver","C:\\Users\\OM-PC\\Desktop\\chromedriver_win32\\chromedriver.exe");
//		 
//		 WebDriver driver = new ChromeDriver();
		 
		 //2  get link
		  
//		 driver.get("https://web.whatsapp.com/");
		 
		 // 3 get url
		  
//		 String s = driver.getCurrentUrl();
//		 System.out.println(s);
		 
		 // 4 get title
		 
//		  String t = driver.getTitle();
//		  System.out.println(t);
		  
		  
		  //5 maximize
		  
//		  driver.manage().window().maximize();
		  
		  // 6 url
		  
//		  driver.navigate().to("https://www.facebook.com/");
//		  driver.navigate().back();
//		  driver.navigate().forward();
//		  driver.navigate().refresh();
		  
		  
		  //7  size
//		  Dimension d=new Dimension(60,80);
//     	  driver.manage().window().setSize(d);
		  
		  // 8  position
//		  Point p=new Point(40,80);
//		  driver.manage().window().setPosition(p);
		  
		  // 9. close
//		  driver.close();
		  
		  // 10 quit
//		  driver.quit();
		 
		 
		 
		 
		  System.out.println("____________________________________________________________________");
		  
		  // new practice
		  
		 // launch browser
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\OM-PC\\Desktop\\chromedriver_win32\\chromedriver.exe");
	//	 WebDriver driver=new ChromeDriver();
		 
		 
		 //1. get url
		 driver.get("https://www.w3schools.com/");
		 
		 // 2 close
		 
//		 driver.close();
         
		 
		 // 3 quit
//		 driver.quit();
		 
		 // 4 get current url
		 
		 String s=driver.getCurrentUrl();
		 System.out.println(s);
		 
		 // 5. title 
		 String t =driver.getTitle();
		 System.out.println(t);		
		 
		 
		 // 6 maximize
		 
//		 driver.manage().window().maximize();
		 
		 // 7 . size
		 
	//	 Dimension d = new Dimension(70,80);
	//	 driver.manage().window().setSize(d);
		 
		 
		 // 8. position
		 
//		 Point p = new Point(70,80);
//		 driver.manage().window().setPosition(p);
				 
		 
		 //9. grt url
          
		  driver.navigate().to("https://www.facebook.com/");
		  driver.navigate().back();
		  driver.navigate().forward();
		  driver.navigate().refresh();
		  
		  
		 
		 
		 
		 
		 
		  
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
