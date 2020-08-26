package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class excelDataProvider {

	
	public static void main(String []args)
	{
		String filePath =  System.getProperty("user.dir");
		String excelPath=filePath+"/excel/Data.xlsx";
		excelDataProvider edp = new excelDataProvider();
		edp.testData(excelPath,"Esc");
	}
	
	
	
	@Test(dataProvider = "test1Data")
	public void test1(String usrnm, String psswrd)
	{
		System.out.println(usrnm);
		System.out.println(psswrd);
	}
	
	@DataProvider(name = "test1Data")
	public Object[][] getData()
	{
		String excelPath=System.getProperty("user.dir")+"/excel/Data.xlsx";
		excelDataProvider edp1 = new excelDataProvider();
		Object data[][] = edp1.testData(excelPath,"Esc");
		return data;
	}
	
	public Object[][] testData(String excelPath,String sheetName)
	{
		excelUtils eu = new excelUtils();
		
		String filePath =  System.getProperty("user.dir");
		int rc = excelUtils.getRowCount(excelPath, sheetName);
		int cc = excelUtils.getColCount(excelPath, sheetName);
		
		Object data[][] = new Object[rc-1][cc];
		
		for(int i=1;i<rc;i++)
		{
			for(int j=0;j<cc;j++)
			{
				String cData = excelUtils.getCellData(filePath+"/excel/Data.xlsx", sheetName, i, j);
				data[i-1][j] = cData;
			}
		}
		//excelUtils.getCellData(filePath+"/excel/Data.xlsx", "esc", 1, 0);
	//	excelUtils.getCellDataNumber(filePath+"/excel/Data.xlsx", "esc", 1, 1);
		
		return data;
	}
	
	

}
