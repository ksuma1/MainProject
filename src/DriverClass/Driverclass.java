package DriverClass;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import CommonMethods.CommonMethods;
import ConstantValues.ConstantValues;

import TestCases.TC01;
import TestCases.TC02;
import Utilities.ExcelsheetReadWrite;
import reporter.JyperionListener;

@Listeners(JyperionListener.class)
public class Driverclass {
	public static boolean bvalue;
	
	@BeforeMethod
	public static void PreRequisite() throws Exception{
		
		ExcelsheetReadWrite.excelpath(ConstantValues.excelpath);
		DOMConfigurator.configure("log4j.xml");
		
	}
	
	@Test (priority=1)
	public static void TestCase1() throws Exception
	{
		bvalue = true;
		TC01.tc01();
		if(bvalue == true)
		{
			ExcelsheetReadWrite.WriteExcelsheet(ConstantValues.Testcases_Sheet, 1, ConstantValues.result, "PASS");
		}
		else
		{
			ExcelsheetReadWrite.WriteExcelsheet(ConstantValues.Testcases_Sheet, 1, ConstantValues.result, "FAIL");
			Assert.assertTrue(false);
		}	
		
	}
	
	@Test (priority=2)
	public static void Testcase2() throws Exception
	{
		bvalue = true;
		TC02.tc02();
		if(bvalue == true)
		{
			System.out.println("pass");
			ExcelsheetReadWrite.WriteExcelsheet(ConstantValues.Testcases_Sheet, 2, ConstantValues.result, "PASS");
		}
		else
		{
			System.out.println("fail");
			ExcelsheetReadWrite.WriteExcelsheet(ConstantValues.Testcases_Sheet, 2, ConstantValues.result, "FAIL");
			Assert.assertTrue(false);
		}			
	}
	@AfterSuite
	public void tearDown() {
		sendPDFReportByGMail("edurekapractice@gmail.com", "practice1", "abc.edureka@gmail.com", "PDF Report", "");
		//sendPDFReportByGMail("anshuman.eternal@gmail.com", "anshuman@eternal", "anshuman.patra@mindtree.com", "PDF Report", "");
		//CommonMethods.browserclose();
		
		
		}	

	
	private static void sendPDFReportByGMail(String from, String pass, String to, String subject, String body) {
		Properties props = System.getProperties();
		String host = "smtp.gmail.com";
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.user", from);
		props.put("mail.smtp.password", pass);
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

		Session session = Session.getDefaultInstance(props);
		MimeMessage message = new MimeMessage(session);

		try {
			// Set from address
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			// Set subject
			message.setSubject(subject);
			message.setText(body);

			BodyPart objMessageBodyPart = new MimeBodyPart();

			objMessageBodyPart.setText("Please Find The Attached Report File!");

			Multipart multipart = new MimeMultipart();

			multipart.addBodyPart(objMessageBodyPart);

			objMessageBodyPart = new MimeBodyPart();

			// Set path to the pdf report file
			String filename = System.getProperty("user.dir") + "\\Default test.pdf";
			// Create data source to attach the file in mail
			DataSource source = new FileDataSource(filename);

			objMessageBodyPart.setDataHandler(new DataHandler(source));

			objMessageBodyPart.setFileName(filename);

			multipart.addBodyPart(objMessageBodyPart);

			message.setContent(multipart);
			Transport transport = session.getTransport("smtp");
			transport.connect(host, from, pass);
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
		} catch (AddressException ae) {
			ae.printStackTrace();
		} catch (MessagingException me) {
			me.printStackTrace();
		}
		

	}

	
}
