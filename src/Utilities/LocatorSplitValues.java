package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;


import ConstantValues.ConstantValues;

public class LocatorSplitValues {
	
	public static By locatorvalue_Splitfun(String locatorName) throws Exception

		{
			Properties prop = new Properties();
			File f = new File(ConstantValues.propertyfilePath);
			FileInputStream fis = new FileInputStream(f);
			prop.load(fis);
			fis.close();

			String st = prop.getProperty(locatorName);
			String locatorType = st.split(":")[0];
			String locatorvalue = st.split(":")[1];
		
			if (locatorType.equalsIgnoreCase("name"))
				return By.name(locatorvalue);
			else if (locatorType.equalsIgnoreCase("cssSelector"))
				return By.cssSelector(locatorvalue);
			else if (locatorType.equalsIgnoreCase("xpath"))
				return By.xpath(locatorvalue);
			System.out.println(locatorvalue);
	
			return null;
		
		}

}
