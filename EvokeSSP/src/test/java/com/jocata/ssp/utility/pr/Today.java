package com.jocata.ssp.utility.pr;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.jocata.ssp.loggers.LoggerHelper;
import com.jocata.ssp.testcases.Tc_07Profile;
import com.sun.jna.platform.win32.OaIdl.SYSKIND;

public class Today {

	private final static Logger log = LoggerHelper.getLogger(Today.class);

	
	static WebDriver driver;
	//sucess

	public static int linksCount;
	
	public static String[] links;
	
    public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.gecko.driver", "D:\\02.06.2016\\geckodriver.exe");
		 driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "https://evoke.jocata.com/home";
        //String expectedTitle = "Welcome: Mercury Tours";
        //String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

    	Thread.sleep(2000);
    	driver.findElement(By.xpath(".//*[@id='li_login']/a/div/i")).click();
    	Thread.sleep(2000);

    	driver.findElement(By.xpath(".//*[@id='userId']")).sendKeys("iLend@gmail.com");
    	
    	//Thread.sleep(2000);

    	driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("jocata");
    	//Thread.sleep(2000);

    	driver.findElement(By.xpath(".//*[@id='sign-in-form']/div[1]/input")).click();
    	
    	Thread.sleep(2000);
        
    	driver.findElement(By.xpath("//span[contains(text(),'Dashboard')]")).click();
    	Thread.sleep(2000);
    	
    
    	driver.findElement(By.xpath("//div[@id='reportrange']")).click();
    	
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//li[contains(text(),'Today')]")).click();
    	Thread.sleep(4000);
    	
		String todaytrasaction = driver.findElement(By.xpath("//h1[@id='totalUsageBox']")).getText();

		log.info("Today  TOTAL TRANSACTIONS...." + todaytrasaction);
		
		
		
		Thread.sleep(2000);
   	 WebElement table_element = driver.findElement(By.id("total_table_curr"));
   	 
   	 Thread.sleep(2000);
   	 List<WebElement> tr_collection=table_element.findElements(By.xpath("//table[@id='total_table_curr']/tbody/tr"));

        System.out.println("NUMBER OF ROWS IN THIS TABLE = "+tr_collection.size());
        int row_num,col_num;
        row_num=1;
        
        WebElement trElement=  tr_collection.get(tr_collection.size()-1);
        List<WebElement> td_collection=trElement.findElements(By.xpath("td"));
        
        WebElement tdElement=td_collection.get(td_collection.size()-1);
        
		
		
        String todaytabletranscation=tdElement.getText();
        
        log.info("Today Total  Table  TRANSACTIONS...." + todaytabletranscation);

    	
        if(todaytrasaction.equals(todaytabletranscation)){
        	
    		log.info("Today Total TOTAL TRANSACTIONS  Should Match ");

        	
        }else{
    		log.info("Today Total TOTAL TRANSACTIONS  Should Not  Match  ");
    		log.info("No Data Available For Specified Timeslice or Specified Values");
    		

        }
        
        
        Thread.sleep(3000);
    	driver.findElement(By.xpath("//div[@id='reportrange']")).click();
    	 Thread.sleep(3000);
        driver.findElement(By.xpath("//li[contains(text(),'Last 7 Days')]")).click();
        
        
        Thread.sleep(3000);
        
        log.info("pass");
    }
	
}
