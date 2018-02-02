package com.jocata.ssp.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jocata.ssp.base.ExtentTestManager;
import com.jocata.ssp.base.GetScreenshort;
import com.jocata.ssp.loggers.LoggerHelper;
import com.jocata.ssp.testcases.Tc_05FilteringAPIs;
import com.relevantcodes.extentreports.LogStatus;

public class ProfilePage {

	private final Logger log = LoggerHelper.getLogger(ProfilePage.class);

	public WebDriver driver;

	@FindBy(xpath = "//span[contains(text(),'Dashboard')]")
	WebElement Dashboard;

	@FindBy(css = "#bs-example-navbar-collapse-1 > div > div.col-lg-2.col-xs-6.user-det > ul > li > a")
	WebElement dropdown;

	@FindBy(css = "#bs-example-navbar-collapse-1 > div > div.col-lg-2.col-xs-6.user-det > ul > li > ul > li:nth-child(1) > a")
	WebElement Profile;

	
	/*@FindBy(xpath = "//a[contains(text(),'Profile')]")
	WebElement Profile;
	*/
	@FindBy(xpath = "//input[@id='fName']")
	WebElement fName;

	@FindBy(xpath = "//input[@id='lName']")
	WebElement lName;

	@FindBy(xpath = "//input[@id='role']")
	WebElement role;

	@FindBy(xpath = "//input[@id='phone']")
	WebElement phone;

	@FindBy(xpath = "//input[@id='email']")
	WebElement email;

	@FindBy(xpath = "//input[@id='organization']")
	WebElement organization;

	@FindBy(xpath = "//input[@value='Save']")
	WebElement Save;

	@FindBy(xpath = "//h2[contains(text(),'Details are saved successfully.')]")
	WebElement Detailssaved;

	@FindBy(css = "div.slide.navbar-header > div:nth-child(2)")
	WebElement Headingname;

	public ProfilePage(WebDriver driver) {

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

	public void clicDashboard() throws InterruptedException {
		Thread.sleep(6000);
		Dashboard.click();
	}

	public void clicProfilepage() throws InterruptedException {
		Thread.sleep(6000);
		dropdown.click();

		Thread.sleep(4000);
		Profile.click();
		fName.clear();
		fName.sendKeys("raghu");
		String screenshortpath = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenshortpath));
		lName.clear();
		lName.sendKeys("ilend");

		role.clear();
		role.sendKeys("Tester");

		phone.clear();
		phone.sendKeys("8374209585");

		email.clear();
		email.sendKeys("iLend@gmail.com");
		Thread.sleep(4000);
		organization.clear();
		organization.sendKeys("jocata");
		Save.click();
		Detailssaved.click();
		
		//ExtentTestManager.getTest().log(LogStatus.INFO, " Clicking FAQ Links..... " + link);


	}

	public String getthetext() {

		String head = Headingname.getText();

		return head;

	}

}
