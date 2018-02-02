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
import com.jocata.ssp.database.ContactJocataDatabase;
import com.jocata.ssp.database.Randomwords;
import com.jocata.ssp.loggers.LoggerHelper;
import com.jocata.ssp.testcases.Tc_04FillContcatjocata;
import com.relevantcodes.extentreports.LogStatus;

public class ContactPage {

	public String user = "Raghu";

	private final Logger log = LoggerHelper.getLogger(ContactPage.class);

	public WebDriver driver;

	public ContactPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Contact']")
	WebElement Contact;

	@FindBy(xpath = "//input[@id='name']")
	WebElement FullName;

	@FindBy(xpath = "//input[@id='organization']")
	WebElement organization;

	@FindBy(xpath = "//input[@id='con_email']")
	WebElement email;

	@FindBy(xpath = "//input[@id='mobileNo']")
	WebElement mobileNo;

	@FindBy(xpath = "//select[@id='reason']")
	WebElement reason;

	@FindBy(xpath = "//textarea[@id='message']")
	WebElement message;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement submit;

	public void fillthedetails() throws InterruptedException {

		log.info("Filling the details of contact Fields ......");

		Contact.click();
		FullName.clear();
		Randomwords word = new Randomwords();

		String dynamicname = word.stp();

		System.out.println(user + dynamicname);

	 	String everychangename = user + dynamicname;
	 	
	 	System.out.println("User name " +  user + dynamicname);

		ExtentTestManager.getTest().log(LogStatus.INFO, "Username.." + user + dynamicname);

		FullName.sendKeys(user + dynamicname);
		organization.clear();
		organization.sendKeys("Ram");
		email.clear();
		email.sendKeys("raghu.ajjiboina@jocata.com");

		mobileNo.clear();
		mobileNo.sendKeys("9030828504");
		String screenBSNL = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenBSNL));
		Select dropdown = new Select(reason);
		dropdown.selectByVisibleText("Request for Information/Proposal");
		message.clear();
		message.sendKeys("This is Automation Testing ");

		submit.click();

		String userdetails = ContactJocataDatabase.getEmployeesFromDataBase();

		System.out.println("User name in the database" + userdetails);
		ExtentTestManager.getTest().log(LogStatus.INFO, "User name in the database" + userdetails);

		if (userdetails.equals(everychangename)) {

			
			ExtentTestManager.getTest().log(LogStatus.PASS, "User Name    Sucessfully Saved in the database");

		} else {

			ExtentTestManager.getTest().log(LogStatus.INFO, "User Name  Not  Saved in the database");
			ExtentTestManager.getTest().log(LogStatus.FAIL, "User Name  Not  Saved in the database");

		}

	

		
		
	}

	public String SucessMessage() {

		String area = driver.findElement(By.cssSelector(".content>h1")).getText();

		return area;

	}

	/*public void validationdatabse() {

		String userdetails = ContactJocataDatabase.getEmployeesFromDataBase();

		System.out.println("User Details" + userdetails);

		if (userdetails.equals(everychangename)) {

			ExtentTestManager.getTest().log(LogStatus.INFO, "User Name Sucessfully Saved in the database");
			ExtentTestManager.getTest().log(LogStatus.PASS, "User Name    Sucessfully Saved in the database");

		} else {

			ExtentTestManager.getTest().log(LogStatus.INFO, "User Name  Not  Saved in the database");
			ExtentTestManager.getTest().log(LogStatus.FAIL, "User Name  Not  Saved in the database");

		}

	}*/

}
