package ConstantValues;

import Utilities.ExcelsheetReadWrite;

public class ConstantValues {

	public static String chromdriver = "webdriver.chrome.driver";
	public static String geckodriver = "webdriver.gecko.driver";
	
	
//	public static String geckopath = "D://Selenium//geckodriver.exe";
//	public static String chrompath = "D://Selenium//chromedriver.exe";
//	public static String propertyfilePath = "D:\\eclipse-workspace\\MainProject\\locator.properties";
//	public static String excelpath = "D:\\eclipse-workspace\\MainProject\\TestData_project.xlsx";
//	public static String Screenshotpath = "D:\\eclipse-workspace\\MainProject\\Screenshots\\";
	
	
	public static String geckopath = "drivers/geckodriver.exe";
	public static String chrompath = "drivers/chromedriver.exe";
	public static String propertyfilePath = "locator.properties";
	public static String excelpath = "src/testdata/TestData_project.xlsx";
	public static String Screenshotpath = "Screenshots/";
	
	public static String expectedtitle = "Find a Flight: Mercury Tours:";
	public static int result = 2;
	public static String Testdata_Sheet = "TestData";
	public static String Testcases_Sheet = "TestCases";
	

	
	public static final String btype() {
		return ExcelsheetReadWrite.ReadExcelsheet(Testdata_Sheet, 1, 4);
	}
	public static final String link() {
		return ExcelsheetReadWrite.ReadExcelsheet(Testdata_Sheet, 2, 4);
	}
	public static final String testdata() {
		return ExcelsheetReadWrite.ReadExcelsheet(Testdata_Sheet, 3, 4);
	}
	public static final String firstname() {
		return ExcelsheetReadWrite.ReadExcelsheet(Testdata_Sheet, 12, 4);
	}
	public static final String lastname() {
		return ExcelsheetReadWrite.ReadExcelsheet(Testdata_Sheet, 13, 4);
	}
	public static final String cardnumber() {
		return ExcelsheetReadWrite.ReadExcelsheet(Testdata_Sheet, 14, 4);
	}
	
	public static final String uname() {
		return ExcelsheetReadWrite.ReadExcelsheet(Testdata_Sheet, 18, 4);
	}
	public static final String password() {
		return ExcelsheetReadWrite.ReadExcelsheet(Testdata_Sheet, 19, 4);
	}

	public static final String signonlink() {
		return ExcelsheetReadWrite.ReadExcelsheet(Testdata_Sheet, 17, 4);
	}

	
	


//	public static String signonlink = "http://newtours.demoaut.com/mercurysignon.php";
//	public static String link = "http://newtours.demoaut.com/";
//	//public static String btype = "Chrome";
//	public static String testdata = "mercury";
//	public static String firstname ="Snow";
//	public static String lastname ="Mahan";
//	public static String cardnumber = "123456";
	
}
