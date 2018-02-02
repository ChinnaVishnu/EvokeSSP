package com.jocata.ssp.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.jocata.ssp.base.ExtentTestManager;
import com.jocata.ssp.base.mainbase;
import com.jocata.ssp.loggers.LoggerHelper;
import com.jocata.ssp.pages.HomePage;
import com.relevantcodes.extentreports.LogStatus;

public class Tc_08HomeLinks extends mainbase {

	private final Logger log = LoggerHelper.getLogger(Tc_08HomeLinks.class);

	@Test(priority=7)
	public void clickinglinks() throws InterruptedException {

		ExtentTestManager.startTest(" Home : Links");

		HomePage home = new HomePage(driver);

		home.clickinglinks();

		ExtentTestManager.getTest().log(LogStatus.INFO, "Sucess Fully Clicking Links  in HomePage    ");

	}
}