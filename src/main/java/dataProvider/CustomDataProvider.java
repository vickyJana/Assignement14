package dataProvider;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {

	@DataProvider(name = "loginDetails")
	public static Object[][] getData() 
	{
		Object[][] arr = ExcelReader.getDataFromSheet("Login");
		return arr;
	}
	
	
	@DataProvider(name = "loginDetails1")
	public static Object[][] getData1() 
	{
		Object[][] arr = ExcelReader.getDataFromSheet("laLogin");
		return arr;
	}
	

}
