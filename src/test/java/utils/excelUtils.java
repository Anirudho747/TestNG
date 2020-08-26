package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtils {

/*	public excelUtils(String excelPath,String sheetName) throws IOException
	{
		XSSFWorkbook wb;
		
			//String filePath =  System.getProperty("user.dir");
			wb = new XSSFWorkbook(excelPath);
			XSSFSheet sheet = wb.getSheet(sheetName);
	}
*/	
	
	public static void main(String []args)
	{
		/*
		getRowCount();
		getCellData(0,0);
		getCellDataNumber(1,1);
		*/
	}
	
	public static int getRowCount(String excelPath,String sheetName)
	{
		XSSFWorkbook wb;
		int rowCount=0;
		try {
			String filePath =  System.getProperty("user.dir");
			//System.out.println(filePath);
			wb = new XSSFWorkbook(excelPath);
			XSSFSheet sheet = wb.getSheet(sheetName);
			rowCount = sheet.getPhysicalNumberOfRows();
		//	System.out.println(rowCount);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Occured");
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return rowCount;	
		
	
	}
	
	public static int getColCount(String excelPath,String sheetName)
	{
		XSSFWorkbook wb;
		int colCount=0;
		try {
			String filePath =  System.getProperty("user.dir");
			//System.out.println(filePath);
			wb = new XSSFWorkbook(excelPath);
			XSSFSheet sheet = wb.getSheet(sheetName);
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		//	System.out.println(colCount);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Occured");
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}	
		return colCount;
	}
	
	public static String getCellData(String excelPath,String sheetName,int rowNum,int colNum)
	{
		XSSFWorkbook wb;
		XSSFSheet sheet=null;
		try {
			String filePath =  System.getProperty("user.dir");
			//System.out.println(filePath);
			wb = new XSSFWorkbook(excelPath);
			sheet = wb.getSheet(sheetName);
		//	System.out.println(sheet.getRow(rowNum).getCell(colNum).getStringCellValue());
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Occured");
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return(sheet.getRow(rowNum).getCell(colNum).getStringCellValue());
	}
	
	public static double getCellDataNumber(String excelPath,String sheetName,int rowNum,int colNum)
	{
		XSSFWorkbook wb;
		XSSFSheet sheet=null;
		try {
			String filePath =  System.getProperty("user.dir");
			//System.out.println(filePath);
			wb = new XSSFWorkbook(excelPath);
			sheet = wb.getSheet(sheetName);
			//System.out.println(sheet.getRow(rowNum).getCell(colNum).getNumericCellValue());
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Occured");
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return (sheet.getRow(rowNum).getCell(colNum).getNumericCellValue());
	}
}
