package utils;

public class ExcelUtilsDemo {

	public static void main(String []args)
	{
	excelUtils eu = new excelUtils();
	String filePath =  System.getProperty("user.dir");
	
	excelUtils.getRowCount(filePath+"/excel/Data.xlsx", "esc");
	excelUtils.getCellData(filePath+"/excel/Data.xlsx", "esc", 1, 0);
	excelUtils.getCellDataNumber(filePath+"/excel/Data.xlsx", "esc", 1, 1);
	}

}
