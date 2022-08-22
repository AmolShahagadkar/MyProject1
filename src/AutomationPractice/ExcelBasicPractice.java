package AutomationPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelBasicPractice {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file =new FileInputStream("C:\\Users\\OM-PC\\Desktop\\ExcelParctice.xlsx");
	    String username = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
        System.out.println(username);	
        
	
	}

}
