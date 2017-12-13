package Pages;

import java.io.IOException;

import CommonMethods.CommonMethods;
import Utilities.LogFile;

public class FlightConfirmationPage {
	
	public static void flightConfirmation() {
		String title = CommonMethods.title();
		if(title.equalsIgnoreCase("Flight Confirmation: Mercury Tours"))
		{
			LogFile.info("Flight ticket is booked Successfully");
		}
		else {
			LogFile.info("Flight ticket is NOT booked Successfully");
		}
	}
	public static void logout(String locatorvalue) throws IOException
	{
		CommonMethods.clickfun(locatorvalue);
	}


}
