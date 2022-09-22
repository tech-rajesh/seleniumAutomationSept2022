package excelExample;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import utility.Constants;

public class ReadDataFromExcel2 {
	
	
	
	public static void main(String[] args) throws Exception {
		
		
		
		
		FileInputStream fis = new FileInputStream(Constants.filePath+Constants.fileName_xls);
		
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		
		HSSFSheet sheet = workbook.getSheet("smokeTest");
		//XSSFSheet sheet = workbook.getSheet("Student");
		
		System.out.println(sheet.getLastRowNum());   //record - rows
		System.out.println(sheet.getFirstRowNum()); 
		
		
		int RowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		System.out.println("Rows Count: " + RowCount);
		
		
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Column Count: " + columnCount);
		
		
		for (int i = 1; i <= RowCount; i++) {
			
			
			
			HSSFRow currentRow = sheet.getRow(i);
			
			
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
