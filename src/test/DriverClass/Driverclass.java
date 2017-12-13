package test.DriverClass;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import test.CommonMethods.CommonMethods;
import test.ConstantValues.ConstantValues;

import test.TestCases.TC01;
import test.TestCases.TC02;
import test.Utilities.ExcelsheetReadWrite;

public class Driverclass {
	public static boolean bvalue;
	
	@BeforeMethod
	public static void PreRequisite() throws Exception{
		
		ExcelsheetReadWrite.excelpath(ConstantValues.excelpath);
		DOMConfigurator.configure("log4j.xml");
		
	}
	
	@Test (priority=1)
	public static void TestCase1() throws Exception
	{
		bvalue = true;
		TC01.tc01();
		if(bvalue == true)
		{
			ExcelsheetReadWrite.WriteExcelsheet(ConstantValues.Testcases_Sheet, 1, ConstantValues.result, "PASS");
		}
		else
		{
			ExcelsheetReadWrite.WriteExcelsheet(ConstantValues.Testcases_Sheet, 1, ConstantValues.result, "FAIL");
			Assert.assertTrue(false);
		}	
		
	}
	
	@Test (priority=2)
	public static void Testcase2() throws Exception
	{
		bvalue = true;
		TC02.tc02();
		if(bvalue == true)
		{
			System.out.println("pass");
			ExcelsheetReadWrite.WriteExcelsheet(ConstantValues.Testcases_Sheet, 2, ConstantValues.result, "PASS");
		}
		else
		{
			System.out.println("fail");
			ExcelsheetReadWrite.WriteExcelsheet(ConstantValues.Testcases_Sheet, 2, ConstantValues.result, "FAIL");
			Assert.assertTrue(false);
		}			
	}
}
