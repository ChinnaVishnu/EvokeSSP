package com.jocata.ssp.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.jocata.ssp.base.ExtentTestManager;
import com.jocata.ssp.base.mainbase;
import com.jocata.ssp.loggers.LoggerHelper;
import com.jocata.ssp.pages.Dashboardpage;
import com.relevantcodes.extentreports.LogStatus;

@Listeners(com.jocata.ssp.customListner.ListenerTest.class)


public class Tc_09Dashboarddatepicker extends mainbase {

	
	
	private final Logger log = LoggerHelper.getLogger(Tc_09Dashboarddatepicker.class);
	
	
	
	@Test(priority=8)
	public void clickinglinks() throws InterruptedException {

		ExtentTestManager.startTest(" Dashboard : Total Trancations  ");
		
		
		
		
		Dashboardpage dash=new Dashboardpage(driver);
		dash.clickdashboard();
		dash.clickcalender();
		log.info(" selecting Total Trancations SucessFully  ");

		ExtentTestManager.getTest().log(LogStatus.INFO, "Selecting Total Trancations SucessFully");


		
	}
	
	
}
