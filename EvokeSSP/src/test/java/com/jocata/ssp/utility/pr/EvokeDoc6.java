package com.jocata.ssp.utility.pr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EvokeDoc6 {

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
    	

    	driver.findElement(By.xpath(".//*[@id='userId']")).sendKeys("iLend@gmail.com");
    	
    

    	driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("jocata");
    	

    	driver.findElement(By.xpath(".//*[@id='sign-in-form']/div[1]/input")).click();
    	
    	
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//span[contains(text(),'Dashboard')]")).click();
    	Thread.sleep(2000);
    	
    String testrr=	driver.findElement(By.xpath("//h1[@id='totalUsageBox']")).getText();
    	
    	System.out.println("Start"+testrr);
    	
    	
    	
    	Thread.sleep(2000);
    	
    	// WebElement table_element = driver.findElement(By.id("total_table_curr"));
    	 
    	 Thread.sleep(2000);
    	 List<WebElement> tr_collection=driver.findElements(By.xpath(".//*[@id='total_table_curr']/tbody/tr/td[5][last()]"));

         System.out.println("NUMBER OF columns IN THIS TABLE = "+tr_collection.size());
         int row_num,col_num;
         
         
         for (WebElement webElementss : tr_collection) {
			
    String pp=    	 webElementss.getText();
        	 //System.out.println("afhv..."+pp);
        	 
         	// System.out.println("mama..."+pp.substring(pp.length()-1));
         	 
         	 if(pp.contains(testrr)){
         		 System.out.println();
         		 System.out.println("mama..."+pp.substring(pp.length()-1));
         		 
         		 break;
         	 }
        	// break;
		}
        // row_num=1;
         
         
       /*  for(WebElement trElement : tr_collection)
         {
             List<WebElement> td_collection=trElement.findElements(By.xpath("td"));
             //System.out.println("NUMBER OF COLUMNS="+td_collection.size());
             col_num=1;
             for(WebElement tdElement : td_collection)
             {
                 System.out.println( "text="+tdElement.getText());
                 col_num++;
             }
           //  row_num++;
         } 
     }*/
	
}
}