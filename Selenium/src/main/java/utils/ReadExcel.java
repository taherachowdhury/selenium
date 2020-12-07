package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	//public static void main(String[] args) throws IOException {
		
	public String[][] readExcel () throws IOException {
	
	
	//open Workbook
				XSSFWorkbook wb = new XSSFWorkbook("./data/ReadExcel.xlsx");
				
				//Get Sheet
				//XSSFSheet sheet = wb.getSheet("4chy");
				XSSFSheet sheet = wb.getSheetAt(0);
				
				//Get row Count
				int rowCount =  sheet.getLastRowNum();
				//System.out.println(rowCount);
				 
				//Get Column Count 
				 int columnCount = sheet.getRow(0).getLastCellNum();
				 //System.out.println(columnCount);
				
				 //String [][] data = new String [2][3]; 
				 String [][]  data = new String [rowCount] [columnCount];
				 
				 
				 
				 //open For loop for row
				for (int i = 1; i <= rowCount; i++) {
				XSSFRow row = sheet.getRow(i);
					
					
				//open For loop for Column
					for (int j = 0; j <columnCount; j++) {
						XSSFCell cell = row.getCell(j);
						
						String value = cell.getStringCellValue();
						System.out.println(value);
						
						//data[0][0] = "CAN";
						//i=1; 1-1=0
						data [i-1] [j] = value;
				
					} //end For loop for Column
					
				} //end For loop for row
				
				return data;
		
		}

}

