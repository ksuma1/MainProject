package test.TestCases;

import test.CommonMethods.CommonMethods;
import test.ConstantValues.ConstantValues;
import test.ConstantValues.LocatorValues;
import test.Pages.SignonPage;
import test.Utilities.LogFile;

public class TC02 {

	public static void tc02() throws Exception {
		
		LogFile.TestcaseStart("TC002");
		//Enter User Credentials
		CommonMethods.browsertype(ConstantValues.btype());
		CommonMethods.siteopen(ConstantValues.signonlink());
		SignonPage.EnterUsercredentials(LocatorValues.Signon_uname,ConstantValues.uname(), LocatorValues.Signon_password,ConstantValues.password(), LocatorValues.Signon_login);
		SignonPage.validateCredentials();
		CommonMethods.browserclose();
		
	}


}
