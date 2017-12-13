package test.Utilities;

import org.apache.log4j.Logger;

public class LogFile {
	
	 public static Logger logf = Logger.getLogger(LogFile.class.getName());
	 
	 public static void TestcaseStart(String message)
	 {
		
		 logf.info("====================================================");
		 logf.info("++++++++++++++++++++" +message+ "+++++++++++++++++++++");
		 logf.info("====================================================");
		 
	 }
	 public static void TestcaseEnd()
	 {
		
		 logf.info("====================================================");
		 logf.info("=================== END ======================");
		 
	 }
	 
	 public static void error(String message)
	 {
		 logf.error(message);
	 }
	 
	 public static void warn(String message)
	 {
		 logf.warn(message);
	 }
	 
	 public static void info(String message)
	 {
		 logf.info(message);
	 }

}
