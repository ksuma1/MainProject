package CommonMethods;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import ConstantValues.ConstantValues;
import DriverClass.Driverclass;
import Utilities.LocatorSplitValues;
import Utilities.LogFile;
import Utilities.Screenshots;


public class CommonMethods {
	
	public static WebDriver driver;
	public static WebDriver browsertype(String btype) {
		try {
			if (btype.equalsIgnoreCase("Chrome")) {
				System.setProperty(ConstantValues.chromdriver,ConstantValues.chrompath);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				} 
				else if(btype.equalsIgnoreCase("Firefox")){
				System.setProperty(ConstantValues.geckodriver,ConstantValues.geckopath);
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				} 
				else {
				System.out.println("Not valid browser name");
				}
			}catch (Exception e) {
				e.printStackTrace();
				
			}
				return driver;
	}
	public static void siteopen(String testData) {
		try {
			driver.get(testData);
		}catch (Exception e) {
			e.printStackTrace();
			
		}
	}		
	public static void browserclose() {	
		try {
			driver.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void textboxes(String locatorvalue,String testdata) throws IOException {
		try {
			driver.findElement(LocatorSplitValues.locatorvalue_Splitfun(locatorvalue)).sendKeys(testdata);
			LogFile.info("Textbox is working " + locatorvalue);
		}catch (Exception e) {
			e.printStackTrace();
			Screenshots.takescreenshot((TakesScreenshot) driver, locatorvalue);
			Driverclass.bvalue = false;
			LogFile.error("Textbox is NOT working " + locatorvalue);
		}

	}	
	public static void selectoption(String locatorvalue,String testdata) throws IOException {
		try {
		WebElement webele = driver.findElement(LocatorSplitValues.locatorvalue_Splitfun(locatorvalue));
		Select sel = new Select(webele);
		sel.selectByVisibleText(testdata);
		LogFile.info("Drop down button is working " + locatorvalue);
		}catch(Exception e) {
			e.printStackTrace();
			Screenshots.takescreenshot((TakesScreenshot) driver, locatorvalue);
			Driverclass.bvalue = false;
			LogFile.error("Drop down button is NOT working " + locatorvalue);
		}
	}
	public static void clickfun(String locatorvalue) throws IOException
	{
		try {
		driver.findElement(LocatorSplitValues.locatorvalue_Splitfun(locatorvalue)).click();
		LogFile.info("Click function is working " + locatorvalue);
		}catch(Exception e) {
			e.printStackTrace();
			Screenshots.takescreenshot((TakesScreenshot) driver, locatorvalue);
			Driverclass.bvalue = false;
			LogFile.error("Click function is NOT working " + locatorvalue);
		}
				
	}	

	public static String title()
	{
		return driver.getTitle();
	}

}
