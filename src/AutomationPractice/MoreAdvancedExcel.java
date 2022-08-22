package AutomationPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MoreAdvancedExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
        FileInputStream file ;    // declaration only once  ==> local
		
		file = new FileInputStream("C:\\Users\\OM-PC\\Desktop\\ExcelParctice.xlsx");
		int rowno =WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		System.out.println("Total Number of rows:- "+rowno);
		file = new FileInputStream("C:\\Users\\OM-PC\\Desktop\\ExcelParctice.xlsx");
		int cols= WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
		System.out.println("Total Number of cols:- "+ cols);
		
		for(int i= 0; i<=rowno; i++) {
			for(int j=0; j<cols;j++) {
				file = new FileInputStream("C:\\Users\\OM-PC\\Desktop\\ExcelParctice.xlsx");
				String data = WorkbookFactory.create(file).getSheet("Sheet3").getRow(i).getCell(j).getStringCellValue();
				System.out.print(data+ " ");
			}
			System.out.println();
		}
	}

}
