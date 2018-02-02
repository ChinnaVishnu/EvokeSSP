package com.jocata.ssp.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.jocata.ssp.base.ExtentTestManager;
import com.jocata.ssp.base.GetScreenshort;
import com.jocata.ssp.base.mainbase;
import com.jocata.ssp.database.ContactJocataDatabase;
import com.jocata.ssp.database.Randomwords;
import com.jocata.ssp.loggers.LoggerHelper;
import com.jocata.ssp.pages.ContactPage;
import com.relevantcodes.extentreports.LogStatus;

public class Tc_04FillContcatjocata extends mainbase {

	
	public static String user = "Raghu";
	
	private final Logger log = LoggerHelper.getLogger(Tc_04FillContcatjocata.class);

	String exceptedMeaage = "Thank you for contacting us! We will get back to you soon!";

	// private final Logger log =
	// LoggerHelper.getLogger(Tc_04FillContcatjocata.class);

	@Test(priority=3)
	public void clickingApis() throws InterruptedException {

		ExtentTestManager.startTest(" Contact Jocata ");

		Thread.sleep(3000);
		ContactPage contact = new ContactPage(driver);
		contact.fillthedetails();

		String Verify = contact.SucessMessage();

		try {

			Assert.assertEquals(Verify, exceptedMeaage);

			// log.info( " Verifiying the Sucess Message......"+Verify);

		

			String screenBSNL = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenBSNL));

		} catch (Exception e) {

			// log.info( " Verifiying the not Sucessful ");

			ExtentTestManager.getTest().log(LogStatus.INFO, " Verifiying the not Sucessful  Message ");
		}

		if (Verify.equals(exceptedMeaage)) {
			
			
			System.out.println("Pass");
			
			ExtentTestManager.getTest().log(LogStatus.PASS, " Verifiying the Sucess  ......" + Verify);
			
			
		} else {
			
			
			ExtentTestManager.getTest().log(LogStatus.FAIL, " Verifiying the not Sucessful Message  "); 
			System.out.println("Fail");
			
			
		}

	
		
		

		
	}

}
