package TestCases;

import CommonMethods.CommonMethods;
import ConstantValues.ConstantValues;
import ConstantValues.LocatorValues;
import Pages.SignonPage;
import Utilities.LogFile;

public class TC02 {

	public static void tc02() throws Exception {
		
		LogFile.TestcaseStart("TC002");
		//Enter User Credentials (taking username and password from Excel sheet)
		CommonMethods.browsertype(ConstantValues.btype());
		CommonMethods.siteopen(ConstantValues.signonlink());
		SignonPage.EnterUsercredentials(LocatorValues.Signon_uname,ConstantValues.uname(), LocatorValues.Signon_password,ConstantValues.password(), LocatorValues.Signon_login);
		SignonPage.validateCredentials();
		CommonMethods.browserclose();
		
	}


}
