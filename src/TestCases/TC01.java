package TestCases;

import CommonMethods.CommonMethods;
import ConstantValues.ConstantValues;
import ConstantValues.LocatorValues;
import Pages.BookAFlightPage;
import Pages.FindAFlightPage;
import Pages.FlightConfirmationPage;
import Pages.SelectAFlightPage;
import Pages.WelcomePage;
import Utilities.LogFile;

public class TC01 {
	
	public static void tc01() throws Exception
	{
		LogFile.TestcaseStart("TC001");
		CommonMethods.browsertype(ConstantValues.btype());
		CommonMethods.siteopen(ConstantValues.link());
		WelcomePage.username(LocatorValues.uname, ConstantValues.testdata());
		WelcomePage.password(LocatorValues.password,ConstantValues.testdata());
		WelcomePage.signin(LocatorValues.signin);
		
		FindAFlightPage.flightType(LocatorValues.type);	
		FindAFlightPage.passengerCount(LocatorValues.passengerCount, "1");
		FindAFlightPage.Airline(LocatorValues.Airline,"Blue Skies Airlines");
		FindAFlightPage.FindContinueclick(LocatorValues.Findcontinueclick);
		
		SelectAFlightPage.SelectflightDepart(LocatorValues.departflight);
		SelectAFlightPage.SelectflightReturn(LocatorValues.returnflight);
		SelectAFlightPage.SelectContinueClick(LocatorValues.SelectContinueClick);
		
		BookAFlightPage.Enterfirstname(LocatorValues.Enterfirstname, ConstantValues.firstname());
		BookAFlightPage.Enterlastname(LocatorValues.Enterlastname, ConstantValues.lastname());
		BookAFlightPage.EntercardNumber(LocatorValues.Entercardnumber,ConstantValues.cardnumber());
		BookAFlightPage.SecurePurchase(LocatorValues.SecurePurchase);
		
		FlightConfirmationPage.flightConfirmation();
		FlightConfirmationPage.logout(LocatorValues.logout);
		
		CommonMethods.browserclose();
		
		LogFile.TestcaseEnd();
	}
	
	}
	
	


