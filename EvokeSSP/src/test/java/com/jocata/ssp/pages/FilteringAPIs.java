package com.jocata.ssp.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jocata.ssp.base.ExtentTestManager;
import com.jocata.ssp.base.GetScreenshort;
import com.jocata.ssp.loggers.LoggerHelper;
import com.jocata.ssp.testcases.Tc_05FilteringAPIs;
import com.relevantcodes.extentreports.LogStatus;

public class FilteringAPIs {

	private final Logger log = LoggerHelper.getLogger(FilteringAPIs.class);
	public WebDriver driver;
	// private final Logger log = LoggerHelper.getLogger(FilteringAPIs.class);
	// WaitHelper waitHelper;

	@FindBy(xpath = "//span[text()='APIs']")
	WebElement APIS;

	@FindBy(xpath = "//select[@id='vertical']")
	WebElement vertical;

	public FilteringAPIs(WebDriver driver) {

		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		/*
		 * waitHelper = new WaitHelper(driver); TestBase testBase = new
		 * TestBase();
		 */
		// waitHelper.waitForElement(driver, AllLinks,new
		// Config(TestBase.OR).getExplicitWait());
	}

	public void clickAPIsMean() {

		APIS.click();
	}

	public void clickonFilters() throws InterruptedException {

		// WebElement mySelectElement = driver.findElement(By.id("mySelect"));

		Select dropdown = new Select(vertical);
		dropdown.selectByVisibleText("Identity");
		String screenBSNL = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenBSNL));
		Thread.sleep(3000);
		dropdown.selectByVisibleText("Address");
		Thread.sleep(3000);

		dropdown.selectByVisibleText("Financial/Tax");

		dropdown.selectByVisibleText("Legal");

		dropdown.selectByVisibleText("Social");
		dropdown.selectByVisibleText("Screening");

		dropdown.selectByVisibleText("Professional");
		dropdown.selectByVisibleText("Other");
		log.info("Pass");

	}

}
