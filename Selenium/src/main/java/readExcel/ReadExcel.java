package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		//open Workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/ReadExcel.xlsx");
		
		//Get Sheet
		XSSFSheet sheet = wb.getSheet("4chy");
		
		//Get row Count
		int rowCount =  sheet.getLastRowNum();
		System.out.println(rowCount);
		 
		//Get Column Count 
		 int columnCount = sheet.getRow(0).getLastCellNum();
		 System.out.println(columnCount);
		
		
		//Get row
		XSSFRow row = sheet.getRow(2);
		
		//Get Column
		XSSFCell cell = row.getCell(0);
		
		//Action- Read value
		String value = cell.getStringCellValue();
		//System.out.println(value);
		
	}

}

