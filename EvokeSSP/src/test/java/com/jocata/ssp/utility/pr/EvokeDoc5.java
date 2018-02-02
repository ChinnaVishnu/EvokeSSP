package com.jocata.ssp.utility.pr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EvokeDoc5 {

	static WebDriver driver;
	

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
    	
    	

    	driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("jocata");
    	Thread.sleep(2000);

    	driver.findElement(By.xpath(".//*[@id='sign-in-form']/div[1]/input")).click();
    	
    	Thread.sleep(2000);
        
    	driver.findElement(By.xpath("//span[contains(text(),'Dashboard')]")).click();
    	
    	Thread.sleep(2000);
    String testrr=	driver.findElement(By.xpath("//h1[@id='totalUsageBox']")).getText();
    	
    	System.out.println("Start"+testrr);
    	
    	
    String vv=	driver.findElement(By.xpath(".//*[@id='total_table_curr']/tbody/tr[5]/td[5]")).getText();
    	System.out.println(vv);
    	
    	Thread.sleep(2000);
    	 WebElement table_element = driver.findElement(By.id("total_table_curr"));
    	 
    	 Thread.sleep(2000);
    	 List<WebElement> tr_collection=table_element.findElements(By.xpath(".//*[@id='total_table_curr']/tbody/tr[5]/td"));

     
    	 
    	 /**/
    	 
    	 int sum_price=1;
    	 for(WebElement e:tr_collection)
    	 {
    	 	sum_price= sum_price+Integer.parseInt(e.getText());
    	 }
    	 System.out.println("total price: "+sum_price);
    	 System.out.println("========================================================================");


    }
}
