package com.jocata.ssp.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.jocata.ssp.base.ExtentTestManager;
import com.jocata.ssp.base.mainbase;
import com.jocata.ssp.loggers.LoggerHelper;
import com.jocata.ssp.pages.FilteringAPIs;
import com.relevantcodes.extentreports.LogStatus;

public class Tc_05FilteringAPIs extends mainbase {

	private final Logger log = LoggerHelper.getLogger(Tc_05FilteringAPIs.class);

	@Test(priority=4)
	public void filteringAPI() throws InterruptedException {
		try {
			ExtentTestManager.startTest("Filtering API's ");

			FilteringAPIs Filter = new FilteringAPIs(driver);
			Thread.sleep(4000);
			Filter.clickAPIsMean();
			Filter.clickonFilters();

			ExtentTestManager.getTest().log(LogStatus.INFO, "Sucess Fully Filtering API's   ");

		} catch (Exception e) {
			log.info(e.getMessage());
		}
	}
}
