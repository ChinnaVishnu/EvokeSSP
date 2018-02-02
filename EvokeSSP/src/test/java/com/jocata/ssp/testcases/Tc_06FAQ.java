package com.jocata.ssp.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.jocata.ssp.base.ExtentTestManager;
import com.jocata.ssp.base.mainbase;
import com.jocata.ssp.loggers.LoggerHelper;
import com.jocata.ssp.pages.FAQPage;
import com.relevantcodes.extentreports.LogStatus;

public class Tc_06FAQ extends mainbase {

	private final Logger log = LoggerHelper.getLogger(Tc_06FAQ.class);

	@Test(priority=5)
	public void clickinglinks() throws InterruptedException {

		ExtentTestManager.startTest(" FAQ Links ");

		FAQPage Faq = new FAQPage(driver);
		Thread.sleep(3000);
		Faq.clickOnFAQ();
		Faq.clickonFAQlinks();

		ExtentTestManager.getTest().log(LogStatus.INFO, "Sucess Fully Clicking FAQ Links ");

	}
}
