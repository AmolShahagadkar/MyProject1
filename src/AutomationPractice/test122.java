package AutomationPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test122 {
	// Excel
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			
			
			FileInputStream file = new FileInputStream("C:\\Users\\OM-PC\\Desktop\\Abc.xlsx");
			String username = WorkbookFactory.create(file).getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();
				
			System.out.println(username);	
			
			
				
			
			
			
	
	}

}
