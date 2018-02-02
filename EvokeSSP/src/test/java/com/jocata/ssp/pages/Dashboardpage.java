package com.jocata.ssp.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jocata.ssp.base.ExtentTestManager;
import com.jocata.ssp.base.GetScreenshort;
import com.jocata.ssp.loggers.LoggerHelper;
import com.relevantcodes.extentreports.LogStatus;

public class Dashboardpage {

	private final Logger log = LoggerHelper.getLogger(Dashboardpage.class);

	public WebDriver driver;

	public Dashboardpage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Dashboard')]")
	WebElement Dashboard;

	@FindBy(xpath = "//div[@id='reportrange']")
	WebElement reportrange;

	@FindBy(xpath = "//li[contains(text(),'Today')]")
	WebElement Today;

	@FindBy(xpath = "//li[contains(text(),'Last 7 Days')]")
	WebElement Last;

	@FindBy(xpath = "//li[contains(text(),'This Month')]")
	WebElement Month;

	@FindBy(xpath = "//li[contains(text(),'Last Six Months')]")
	WebElement Six;

	@FindBy(xpath = "//li[contains(text(),'One Year')]")
	WebElement Year;

	public void clickdashboard() throws InterruptedException {
		Thread.sleep(2000);
		Dashboard.click();
	}

	public void clickcalender() throws InterruptedException {
		Thread.sleep(3000);
		reportrange.click();

		Thread.sleep(3000);
		Today.click();

		Thread.sleep(3000);

		todaytranscation();

		reportrange.click();

		Thread.sleep(3000);
		Last.click();
		Thread.sleep(3000);

		lastsevendays();

		reportrange.click();
		Thread.sleep(3000);
		Month.click();
		Thread.sleep(3000);

		selectthismonth();

		reportrange.click();
		Thread.sleep(3000);
		Six.click();
		Thread.sleep(3000);

		selectlastsixmonth();
		reportrange.click();
		Thread.sleep(3000);
		Year.click();
		Thread.sleep(3000);

		selectoneyear();

	}

	public void todaytranscation() throws InterruptedException {

		Thread.sleep(2000);

		String todaytrasaction = driver.findElement(By.xpath("//h1[@id='totalUsageBox']")).getText();

		log.info(" Today TOTAL TRANSACTIONS...." + todaytrasaction);

		ExtentTestManager.getTest().log(LogStatus.INFO, "Today TOTAL TRANSACTIONS...." + todaytrasaction);

		Thread.sleep(2000);
		WebElement table_element = driver.findElement(By.id("total_table_curr"));

		Thread.sleep(2000);
		List<WebElement> tr_collection = table_element
				.findElements(By.xpath("//table[@id='total_table_curr']/tbody/tr"));

		System.out.println("NUMBER OF ROWS IN THIS TABLE = " + tr_collection.size());
		int row_num, col_num;
		row_num = 1;

		WebElement trElement = tr_collection.get(tr_collection.size() - 1);
		List<WebElement> td_collection = trElement.findElements(By.xpath("td"));

		WebElement tdElement = td_collection.get(td_collection.size() - 1);

		String todaytabletranscation = tdElement.getText();

		log.info("Today Total  Table  TRANSACTIONS...." + todaytabletranscation);

		ExtentTestManager.getTest().log(LogStatus.INFO, "Today Total  Table  TRANSACTIONS...." + todaytabletranscation);

		if (todaytrasaction.equals(todaytabletranscation)) {

			log.info("Today Total TOTAL TRANSACTIONS  Should Match ");

			ExtentTestManager.getTest().log(LogStatus.PASS, "Today Total TOTAL TRANSACTIONS  Should Match ");

			String screenBSNL = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

			ExtentTestManager.getTest().log(LogStatus.PASS,
					"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenBSNL));

		} else {
			log.info("Today Total TOTAL TRANSACTIONS  Should Not  Match  ");
			log.info("No Data Available For Specified Timeslice or Specified Values");

			ExtentTestManager.getTest().log(LogStatus.WARNING,
					"No Data Available For Specified Timeslice or Specified Values");
			String screenBSNL = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

			ExtentTestManager.getTest().log(LogStatus.WARNING,
					"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenBSNL));

		}

	}

	public void lastsevendays() throws InterruptedException {
		Thread.sleep(2000);

		String lastseventrasaction = driver.findElement(By.xpath("//h1[@id='totalUsageBox']")).getText();

		log.info("Last seven days  TOTAL TRANSACTIONS...." + lastseventrasaction);
		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Last seven days  TOTAL TRANSACTIONS...." + lastseventrasaction);

		Thread.sleep(2000);
		WebElement table_element = driver.findElement(By.id("total_table_curr"));

		Thread.sleep(2000);
		List<WebElement> tr_collection = table_element
				.findElements(By.xpath("//table[@id='total_table_curr']/tbody/tr"));

		System.out.println("NUMBER OF ROWS IN THIS TABLE = " + tr_collection.size());
		int row_num, col_num;
		row_num = 1;

		WebElement trElement = tr_collection.get(tr_collection.size() - 1);
		List<WebElement> td_collection = trElement.findElements(By.xpath("td"));

		WebElement tdElement = td_collection.get(td_collection.size() - 1);

		String lastseventranscation = tdElement.getText();

		log.info("Last seven days  Total  Table  TRANSACTIONS...." + lastseventranscation);
		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Last seven days  Total  Table  TRANSACTIONS...." + lastseventranscation);

		if (lastseventrasaction.equals(lastseventranscation)) {

			log.info("Last seven days  TOTAL TRANSACTIONS  Should Match ");
			ExtentTestManager.getTest().log(LogStatus.PASS, "Last seven days  TOTAL TRANSACTIONS  Should Match ");
			String screenBSNL = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

			ExtentTestManager.getTest().log(LogStatus.PASS,
					"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenBSNL));

		} else {
			log.info("Last seven days TRANSACTIONS  Should Not  Match  ");
			log.info("No Data Available For Specified Timeslice or Specified Values");
			ExtentTestManager.getTest().log(LogStatus.FAIL, "Last seven days  TOTAL TRANSACTIONS  Should Not Match ");

		}

	}

	public void selectthismonth() throws InterruptedException {

		Thread.sleep(2000);

		String Thismonth = driver.findElement(By.xpath("//h1[@id='totalUsageBox']")).getText();

		log.info("This month  TOTAL TRANSACTIONS...." + Thismonth);
		ExtentTestManager.getTest().log(LogStatus.INFO, "This month  TOTAL TRANSACTIONS...." + Thismonth);

		Thread.sleep(2000);
		WebElement table_element = driver.findElement(By.id("total_table_curr"));

		Thread.sleep(2000);
		List<WebElement> tr_collection = table_element
				.findElements(By.xpath("//table[@id='total_table_curr']/tbody/tr"));

		System.out.println("NUMBER OF ROWS IN THIS TABLE = " + tr_collection.size());
		int row_num, col_num;
		row_num = 1;

		WebElement trElement = tr_collection.get(tr_collection.size() - 1);
		List<WebElement> td_collection = trElement.findElements(By.xpath("td"));

		WebElement tdElement = td_collection.get(td_collection.size() - 1);

		String monthtabletranscation = tdElement.getText();

		log.info("This month  Total  Table  TRANSACTIONS...." + monthtabletranscation);

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"This month  Total  Table  TRANSACTIONS...." + monthtabletranscation);

		if (Thismonth.equals(monthtabletranscation)) {

			log.info("This month TOTAL TRANSACTIONS  Should Match ");
			ExtentTestManager.getTest().log(LogStatus.PASS, "This month TOTAL TRANSACTIONS  Should Match ");
			String screenBSNL = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenBSNL));

		} else {
			log.info("This month  TOTAL TRANSACTIONS Should Not  Match  ");
			log.info("No Data Available For Specified Timeslice or Specified Values");
			ExtentTestManager.getTest().log(LogStatus.FAIL, "This month TOTAL TRANSACTIONS  Should Not  Match ");

		}

	}

	public void selectlastsixmonth() throws InterruptedException {

		Thread.sleep(2000);

		String lastsixmonth = driver.findElement(By.xpath("//h1[@id='totalUsageBox']")).getText();

		log.info("Last Six Months TOTAL TRANSACTIONS...." + lastsixmonth);

		ExtentTestManager.getTest().log(LogStatus.INFO, "Last Six Months TOTAL TRANSACTIONS...." + lastsixmonth);

		Thread.sleep(2000);
		WebElement table_element = driver.findElement(By.id("total_table_curr"));

		Thread.sleep(2000);
		List<WebElement> tr_collection = table_element
				.findElements(By.xpath("//table[@id='total_table_curr']/tbody/tr"));

		System.out.println("NUMBER OF ROWS IN THIS TABLE = " + tr_collection.size());
		int row_num, col_num;
		row_num = 1;

		WebElement trElement = tr_collection.get(tr_collection.size() - 1);
		List<WebElement> td_collection = trElement.findElements(By.xpath("td"));

		WebElement tdElement = td_collection.get(td_collection.size() - 1);

		String sixmonthtabletranscation = tdElement.getText();

		log.info("Last Six Month  Total  Table  TRANSACTIONS...." + sixmonthtabletranscation);

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Last Six Month  Total  Table  TRANSACTIONS...." + sixmonthtabletranscation);

		if (lastsixmonth.equals(sixmonthtabletranscation)) {

			log.info("Last Six Month  Total  Table  TRANSACTIONS  Should Match ");

			ExtentTestManager.getTest().log(LogStatus.PASS,
					"Last Six Month  Total  Table  TRANSACTIONS  Should Match ");

			String screenBSNL = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

			ExtentTestManager.getTest().log(LogStatus.PASS,
					"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenBSNL));

		} else {
			log.info("Last Six Month  Total  Table  TRANSACTIONS  Should Not  Match   ");
			log.info("No Data Available For Specified Timeslice or Specified Values");

			String screenBSNL = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

			ExtentTestManager.getTest().log(LogStatus.PASS,
					"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenBSNL));

		}

	}

	public void selectoneyear() throws InterruptedException {

		Thread.sleep(2000);

		String oneyear = driver.findElement(By.xpath("//h1[@id='totalUsageBox']")).getText();

		log.info("One Year TOTAL TRANSACTIONS...." + oneyear);

		ExtentTestManager.getTest().log(LogStatus.INFO, "One Year TOTAL TRANSACTIONS...." + oneyear);

		Thread.sleep(2000);
		WebElement table_element = driver.findElement(By.id("total_table_curr"));

		Thread.sleep(2000);
		List<WebElement> tr_collection = table_element
				.findElements(By.xpath("//table[@id='total_table_curr']/tbody/tr"));

		System.out.println("NUMBER OF ROWS IN THIS TABLE = " + tr_collection.size());
		int row_num, col_num;
		row_num = 1;

		WebElement trElement = tr_collection.get(tr_collection.size() - 1);
		List<WebElement> td_collection = trElement.findElements(By.xpath("td"));

		WebElement tdElement = td_collection.get(td_collection.size() - 1);

		String oneyeartabletranscation = tdElement.getText();

		log.info("One Year  Total  Table  TRANSACTIONS...." + oneyeartabletranscation);

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"One Year  Total  Table  TRANSACTIONS...." + oneyeartabletranscation);

		if (oneyear.equals(oneyeartabletranscation)) {

			log.info("One Year  Total  Table  TRANSACTIONS Should Match ");

			ExtentTestManager.getTest().log(LogStatus.INFO, "One Year  Total  Table  TRANSACTIONS Should Match ");

			String screenBSNL = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenBSNL));

		} else {
			log.info("One Year  Total  Table  TRANSACTIONS  Should Not  Match   ");
			log.info("No Data Available For Specified Timeslice or Specified Values");

		}

	}

}
