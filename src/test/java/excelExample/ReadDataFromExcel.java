package excelExample;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	
	
	
	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream(".\\testData\\RegistrationData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//XSSFSheet sheet = workbook.getSheet("smokeTest");
		XSSFSheet sheet = workbook.getSheet("Student");
		
		System.out.println(sheet.getLastRowNum());   //record - rows
		System.out.println(sheet.getFirstRowNum()); 
		
		
		int RowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		System.out.println("Rows Count: " + RowCount);
		
		
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Column Count: " + columnCount);
		
		
		for (int i = 1; i <= RowCount; i++) {
			
			
			
			XSSFRow currentRow = sheet.getRow(i);
			
			
			String firstName = currentRow.getCell(0).toString();
			
			String lastName = currentRow.getCell(1).toString();
			String email = currentRow.getCell(2).toString();
			String mobile = currentRow.getCell(3).toString();
			String address = currentRow.getCell(4).toString();
			
			System.out.println("FirstName: " + firstName);
			System.out.println("Address: " + address);
			System.out.println("================================");
			
			
			
		}
		
		
		
		
		
		
		
	}

}
