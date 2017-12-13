package Pages;

import java.io.IOException;

import CommonMethods.CommonMethods;

public class FindAFlightPage {
	
	public static void flightType(String locatorvalue) throws IOException
	{
		CommonMethods.clickfun(locatorvalue);
	}
	public static void passengerCount(String locatorvalue,String testdata) throws IOException
	{
		CommonMethods.selectoption(locatorvalue, testdata);
	}
	
	public static void Airline(String locatorvalue,String testdata) throws IOException
	{
		CommonMethods.selectoption(locatorvalue, testdata);
	}
	
	public static void FindContinueclick(String locatorvalue) throws IOException
	{
		CommonMethods.clickfun(locatorvalue);
	}
}
