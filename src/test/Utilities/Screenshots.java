package test.Utilities;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import test.ConstantValues.ConstantValues;

public class Screenshots {
	
	public static void takescreenshot(TakesScreenshot tc,String picname) throws IOException
	{
		SimpleDateFormat sd = new SimpleDateFormat("dd_MM_yy#hh_mm_ss");
		Date dt = new Date();
		File destinationfile = new File (ConstantValues.Screenshotpath+sd.format(dt)+picname+".jpeg");
		File SCtempstorageFile = tc.getScreenshotAs(OutputType.FILE);
		FileUtils.moveFile(SCtempstorageFile, destinationfile);
			
	}

}
