package test.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import test.CommonMethods.CommonMethods;
import test.ConstantValues.LocatorValues;

public class WelcomePage {
	
	
	public static void username(String locatorvalue,String testdata) throws IOException
	{
		CommonMethods.textboxes(locatorvalue,testdata);
	}
	public static void password(String locatorvalue,String testdata) throws IOException
	{
		CommonMethods.textboxes(locatorvalue, testdata);
	}
	public static void signin(String locatorvalue) throws IOException
	{
		CommonMethods.clickfun(locatorvalue);
	}

}
