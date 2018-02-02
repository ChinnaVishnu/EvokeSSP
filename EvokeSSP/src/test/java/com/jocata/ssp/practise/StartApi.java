package com.jocata.ssp.practise;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.jocata.ssp.base.ExtentTestManager;
import com.jocata.ssp.base.mainbase;
import com.jocata.ssp.loggers.LoggerHelper;
import com.jocata.ssp.pages.APIPage;
import com.relevantcodes.extentreports.LogStatus;

public class StartApi extends mainbase {

	private final Logger log = LoggerHelper.getLogger(StartApi.class);

	@Test(priority=2)
	public void clickingApis() throws InterruptedException {

		ExtentTestManager.startTest(" Navigation API's ");

		Thread.sleep(4000);

		try {
			APPPage Api = new APPPage(driver);
			Api.clickonAPIs();

			ExtentTestManager.getTest().log(LogStatus.INFO, " Navigation All Api's Successfully ");

		} catch (Exception e) {
			System.out.println("Navigation APi Fail" + e.getMessage());

			log.info("Fail" + e.getMessage());

			ExtentTestManager.getTest().log(LogStatus.FAIL, " Navigation All Api's Not  Successfully ");
			// ExtentTestManager.getTest().log(LogStatus.INFO, " Navigation All
			// Api's Not Successfully ");
		}
	}

}
