package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import CommonMethods.CommonMethods;
import ConstantValues.LocatorValues;

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
