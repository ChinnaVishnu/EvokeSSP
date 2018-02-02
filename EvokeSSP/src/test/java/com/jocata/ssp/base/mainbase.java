package com.jocata.ssp.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public abstract class mainbase extends Utills {
	
	public static ExtentReports extent;
	public static ExtentTest test;
	public static Properties Repository = new Properties();
	 
   // private final String filePath = "ParallelMethodsTest.html";
	public File f;
	public FileInputStream FI;
	
	
	public static WebDriver selectBrowser(String browser) throws MalformedURLException {
		if (browser.equals("firefox") || browser.equals("FIREFOX")) {

			/*
			 * DesiredCapabilities dc = new DesiredCapabilities();
			 * dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
			 * UnexpectedAlertBehaviour.IGNORE); driver = new FirefoxDriver(dc);
			 */
			Augmenter aug = new Augmenter();
			DesiredCapabilities capability = DesiredCapabilities.firefox();
			driver = new RemoteWebDriver(new URL("http://192.168.1.4:5555/wd/hub"), capability);
			 
			 System.out.println("Connecting to " + driver);

			
			driver = aug.augment(driver);

			
			//driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
			return driver;
		} else if (browser.equals("chrome") || browser.equals("CHROME")) {
			System.out.println("chrome browser");
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\com\\actiTime\\BrowserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		} else if (browser.equals("ie") || browser.equals("IE")) {
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			return driver;
		}
		return null;
	}

	
	/*
	 * @BeforeSuite public void ram() throws IOException, InterruptedException{
	 * loadPropertiesFile(); selectBrowser(Repository.getProperty("browser"));
	 * impliciteWait(30); driver.get(Repository.getProperty("url"));
	 * impliciteWait(30);
	 * driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(Repository.
	 * getProperty("username"));
	 * driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(Repository.
	 * getProperty("password"));
	 * driver.findElement(By.xpath(".//*[@id='LoginButton']")).click();
	 * Thread.sleep(6000);
	 * driver.findElement(By.xpath("//td[@align='center']")).click();
	 * 
	 * }
	 */

	@BeforeSuite
	public void clickfrist() throws InterruptedException, IOException {
		
		//extent = ExtentManager.getReporter(filePath);
		
		loadPropertiesFile();
		selectBrowser(Repository.getProperty("browser"));
		Thread.sleep(5000);
		//impliciteWait(3000);
		Thread.sleep(5000);
		driver.get(Repository.getProperty("url"));
		
		//driver.get("http://www.google.com");
		Thread.sleep(5000);
		//impliciteWait(3000);
		
             driver.findElement(By.xpath("//span[text()='Sign In']")).click();
             Thread.sleep(5000);
             //impliciteWait(3000);
		WebElement element = driver.findElement(By.xpath("//input[@id='userId']"));
		//element.sendKeys("iLend@gmail.com");
		
	     element.sendKeys(Repository.getProperty("username"));
		mainbase.highLightElement(driver, element);
		 impliciteWait(3000);
		WebElement elementse = driver.findElement(By.xpath("//input[@id='passwd']"));
		
		//elementse.sendKeys("jocata");
		elementse.sendKeys(Repository.getProperty("password"));
		mainbase.highLightElement(driver, elementse);
		 impliciteWait(3000);
		driver.findElement(By.xpath("//input[@value='Sign-in']")).click();
		 impliciteWait(30);
		/*Thread.sleep(7000);
		driver.findElement(By.xpath("//td[@align='center']")).click();*/

		// BalloonPopUp.currentRunningTestCase(testCaseName);
	}

	public WebElement findElement(By by) {
		WebElement elem = driver.findElement(by);
		// draw a border around the found element
		if (driver instanceof JavascriptExecutor) {
			((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		}
		return elem;
	}

	public void loadPropertiesFile() throws IOException {

		f = new File("D:\\AUTOMATION REQUIRED DOCS\\config.properties");

		/* f=new
		 File(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
*/
		FI = new FileInputStream(f);
		Repository.load(FI);
	}

	public static void highLightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

			System.out.println(e.getMessage());
		}

		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);

	}

	public String[][] getTableArray(String xlFilePath, String sheetName, String tableName, String startname)
			throws Exception {
		String[][] tabArray = null;

		Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
		Sheet sheet = workbook.getSheet(sheetName);
		int startRow, startCol, endRow, endCol, ci, cj;
		Cell tableStart = sheet.findCell(tableName);
		startRow = tableStart.getRow();
		startCol = tableStart.getColumn();

		Cell tableEnd = sheet.findCell(tableName, startCol + 1, startRow + 1, 100, 64000, false);

		endRow = tableEnd.getRow();
		endCol = tableEnd.getColumn();
		System.out.println(
				"startRow=" + startRow + ", endRow=" + endRow + ", " + "startCol=" + startCol + ", endCol=" + endCol);
		tabArray = new String[endRow - startRow - 1][endCol - startCol - 1];
		ci = 0;

		for (int i = startRow + 1; i < endRow; i++, ci++) {
			cj = 0;
			for (int j = startCol + 1; j < endCol; j++, cj++) {
				tabArray[ci][cj] = sheet.getCell(j, i).getContents();
			}
		}

		return (tabArray);
	}

/*	@AfterClass
	public void getResult(ITestResult result, ITestContext testContext) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {
			String screenshortpath = GetScreenshort.capture(driver, "ScreenshortForExtentReport");
			ExtentTestManager.getTest().log(LogStatus.FAIL, result.getThrowable());

		}else if(result.getStatus() == ITestResult.SKIP){
			//logger.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
			ExtentTestManager.getTest().log(LogStatus.SKIP, result.getThrowable());
		}

		ExtentManager.getReporter().endTest(ExtentTestManager.getTest());
		ExtentManager.getReporter().flush();

	}*/

	
	   /* @AfterSuite
	    protected void afterMethod(ITestResult result) {
	        if (result.getStatus() == ITestResult.FAILURE) {
	        	
	        	String screenshortpath = GetScreenshort.capture(driver, "ScreenshortForExtentReport");
	            ExtentTestManager.getTest().log(LogStatus.FAIL, result.getThrowable());
	        } else if (result.getStatus() == ITestResult.SKIP) {
	            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
	        } else {
	            ExtentTestManager.getTest().log(LogStatus.PASS, "Test passed");
	        }
	        
	        ExtentManager.getReporter().endTest(ExtentTestManager.getTest());        
	        ExtentManager.getReporter().flush();
	    }
	
	 protected String getStackTrace(Throwable t) {
	        StringWriter sw = new StringWriter();
	        PrintWriter pw = new PrintWriter(sw);
	        t.printStackTrace(pw);
	        return sw.toString();	
	    }*/
	
	
	@AfterMethod
	public void getResult(ITestResult result, ITestContext testContext) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {
			String screenshortpath = GetScreenshort.capture(driver, "ScreenshortForExtentReport");
			ExtentTestManager.getTest().log(LogStatus.FAIL, result.getThrowable());
			
			
			 // String screenBSNL= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

	      		ExtentTestManager.getTest().log(LogStatus.FAIL,
	      				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenshortpath));

		}

		ExtentManager2.getReporter().endTest(ExtentTestManager.getTest());
		ExtentManager2.getReporter().flush();

	}

	
}
