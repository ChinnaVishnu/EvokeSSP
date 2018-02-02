package com.jocata.ssp.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jocata.ssp.base.ExtentTestManager;
import com.jocata.ssp.base.GetScreenshort;
import com.jocata.ssp.loggers.LoggerHelper;
import com.jocata.ssp.testcases.Tc_06FAQ;
import com.relevantcodes.extentreports.LogStatus;

public class FAQPage {

	private final Logger log = LoggerHelper.getLogger(FAQPage.class);

	public WebDriver driver;

	public FAQPage(WebDriver driver) {
		super();

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='FAQ']")
	WebElement FAQ;

	@FindBy(xpath = "//ul[@class='sidebar-menu']/li")
	public List<WebElement> links;

	public void clickOnFAQ() {
		// log.info("clicked on FAQ in link...");
		log.info("clicked on FAQ in link...");
		
		
		FAQ.click();
	}

	public void clickonFAQlinks() throws InterruptedException {

		try {

			// List<WebElement> links =
			// driver.findElements(By.xpath("//ul[@class='sidebar-menu']/li"));
			int linkcount = links.size();
			log.info(links.size());
			for (WebElement myElement : links) {
				String link = myElement.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, " Clicking FAQ Links..... " + link);
				log.info(link);
				log.info(myElement);
				if (link != "") {
					myElement.click();
					String screenBSNL = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

					ExtentTestManager.getTest().log(LogStatus.INFO,
							"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenBSNL));
					Thread.sleep(2000);
					log.info("third");
				}
				// Thread.sleep(5000);
			}
		} catch (Exception e) {
			log.info("error " + e);
		}

		log.info("pass");

	}

}
