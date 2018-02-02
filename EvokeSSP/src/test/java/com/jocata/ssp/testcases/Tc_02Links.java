package com.jocata.ssp.testcases;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.jocata.ssp.base.ExtentTestManager;
import com.jocata.ssp.base.GetScreenshort;
import com.jocata.ssp.base.mainbase;
import com.jocata.ssp.loggers.LoggerHelper;
import com.relevantcodes.extentreports.LogStatus;

public class Tc_02Links extends mainbase {

	private static String homeWindow;
	private static String[] links = null;
	private static int linksCount = 0;

	private final Logger log = LoggerHelper.getLogger(Tc_02Links.class);

	@Test(priority=1)
	public void click() throws InterruptedException {
		try {

			ExtentTestManager.startTest(" Dashboard : News Links ");

			ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking one by one Links ");

			List<WebElement> all_links_webpage = driver.findElements(By.xpath("//marquee[@direction='up']/h4/a"));
			// Print total no of links on the webpage
			log.info("Print total no of links on the webpage----------------------------------------------------");
			linksCount = all_links_webpage.size();
			log.info(linksCount);
			links = new String[linksCount];// Following instruction stores each
											// link and Prints on console
			log.info("Print Links-----------------------------------------------------------------------------------");

			for (int i = 0; i < linksCount; i++) {
				links[i] = all_links_webpage.get(i).getAttribute("href");
				System.out.println(all_links_webpage.get(i).getAttribute("href"));

				ExtentTestManager.getTest().log(LogStatus.INFO,
						"NewsLinks...." + all_links_webpage.get(i).getAttribute("href"));

			}
			// Following instruction Return an opaque handle to this window that
			// uniquely identifies it within this driver instance.
			// This can be used to switch to this window at a later date
			homeWindow = driver.getWindowHandle().toString();
			// Visiting Each Link in on the Page

			log.info("Visiting Each Links------------------------------------------------------------------------");

			for (int i = 0; i < linksCount; i++) {

				String screenshortpath = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

				ExtentTestManager.getTest().log(LogStatus.INFO,
						"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenshortpath));

				driver.navigate().to(links[i]);
				Thread.sleep(6000);
				driver.switchTo().window(homeWindow);

			}

			Thread.sleep(2000);

			log.info("passs");

			ExtentTestManager.getTest().log(LogStatus.INFO, "Switch back Url");
			driver.get(Repository.getProperty("url"));

		} catch (Exception e) {
			System.out.println(e.getMessage());

			driver.get(Repository.getProperty("url"));
		}

	}

}
