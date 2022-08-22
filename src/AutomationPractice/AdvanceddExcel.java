package AutomationPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceddExcel {
public static void main(String[] args) throws IOException {
	
//	for(int i=0;i<7;i++) {
//		
//		FileInputStream file = new FileInputStream("C:\\Users\\OM-PC\\Desktop\\s1.xlsx");	
//		String file1 =  WorkbookFactory.create(file).getSheet("sheet1").getRow(i).getCell(0).getStringCellValue();
//		System.out.println(file1);
//	
//	}
//	
	
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\OM-PC\\Desktop\\chromedriver_win32\\chromedriver.exe");;
	    WebDriver driver = new ChromeDriver();
	    ArrayList<String> al = new ArrayList<String>();
	    
	    for(int i=0;i<4;i++) {
	    
	    FileInputStream file2 = new FileInputStream("C:\\Users\\OM-PC\\Desktop\\ExcelParctice.xlsx");	
	    String value = WorkbookFactory.create(file2).getSheet("Sheet2").getRow(i).getCell(0).getStringCellValue();
	    al.add(value);
	    
	    	
	    }
	    
	    
	    for(int j= 0; j<al.size(); j++) {
			driver.get(al.get(j));
			System.out.println(driver.getTitle());

}

}
}