package com.jocata.ssp.practise;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.jocata.ssp.base.ExtentTestManager;
import com.jocata.ssp.base.mainbase;
import com.jocata.ssp.loggers.LoggerHelper;
import com.jocata.ssp.pages.ProfilePage;
import com.relevantcodes.extentreports.LogStatus;

public class ZProfile extends mainbase {

	private final Logger log = LoggerHelper.getLogger(ZProfile.class);

	@Test(priority=6)
	public void clickinglinks() throws InterruptedException {

		ExtentTestManager.startTest(" Dashboard : Profile");

		ProfileVVPage Page = new ProfileVVPage(driver);
		Page.clicDashboard();
		Page.clicProfilepage();

		// Page.clicProfilepage();

		String name = Page.getthetext();

		log.info("name....." + name);
		driver.findElement(By.xpath(".//*[@id='fName']")).clear();
		driver.findElement(By.xpath(".//*[@id='fName']")).sendKeys("ilend");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		
		
		ExtentTestManager.getTest().log(LogStatus.INFO,   "Details are saved successfully");


	}
}