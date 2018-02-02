package com.jocata.ssp.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jocata.ssp.base.ExtentTestManager;
import com.jocata.ssp.base.GetScreenshort;
import com.jocata.ssp.loggers.LoggerHelper;
import com.jocata.ssp.testcases.Tc_02Links;
import com.relevantcodes.extentreports.LogStatus;

public class HomePage {

	private final Logger log = LoggerHelper.getLogger(HomePage.class);

	public HomePage(WebDriver driver) {
		super();

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver driver;

	@FindBy(xpath = "//span[contains(text(),'Home')]")
	WebElement Home;

	@FindBy(xpath = "//a[contains(text(),'SME Loan')]")
	WebElement SMELoan;

	@FindBy(xpath = "//a[contains(text(),'Personal Loan')]")
	WebElement PersonalLoan;

	@FindBy(xpath = "//a[contains(text(),'Customer Verification')]")
	WebElement Customer;

	@FindBy(xpath = "//a[contains(text(),'Enhanced Due Diligence')]")
	WebElement Enhanced;

	public void clickinglinks() throws InterruptedException {

		log.info("Clicking the HomePage links ......");

		Thread.sleep(3000);
		Home.click();
		Thread.sleep(3000);
		SMELoan.click();
		Thread.sleep(3000);
		PersonalLoan.click();
		Thread.sleep(3000);
		Customer.click();
		String screenBSNL = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenBSNL));
		Thread.sleep(3000);
		Enhanced.click();

		Thread.sleep(3000);

		System.out.println("pass");
	}
}
