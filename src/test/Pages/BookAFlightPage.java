package test.Pages;

import java.io.IOException;

import test.CommonMethods.CommonMethods;

public class BookAFlightPage {
	
	public static void Enterfirstname(String locatorvalue,String testdata) throws IOException
	{
		CommonMethods.textboxes(locatorvalue, testdata);
	}
	
	public static void Enterlastname(String locatorvalue,String testdata) throws IOException
	{
		
		CommonMethods.textboxes(locatorvalue, testdata);
	}
	
	public static void EntercardNumber(String locatorvalue,String testdata) throws IOException
	{
		CommonMethods.textboxes(locatorvalue, testdata);
	}
	
	public static void SecurePurchase(String locatorvalue) throws IOException
	{
		CommonMethods.clickfun(locatorvalue);
	}

}
