package com.jocata.ssp.utility;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;		
import org.testng.ITestResult;

import com.jocata.ssp.base.ExtentTestManager;
import com.jocata.ssp.base.GetScreenshort;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.ITestListener;

public class ListenerTest implements ITestListener {

	WebDriver driver;
	
	
	 @Override		
	    public void onFinish(ITestContext Result) 					
	    {		
	                		
	    }		

	    @Override		
	    public void onStart(ITestContext Result)					
	    {		
	            		
	    }		

	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult Result)					
	    {		
	    		
	    }		

	    // When Test case get failed, this method is called.		
	    @Override		
	    public void onTestFailure(ITestResult Result) 					
	    {		
	    System.out.println("The name of the testcase failed is :"+Result.getName());
	    
	    ExtentTestManager.getTest().log(LogStatus.FAIL, "The name of the testcase failed is :"+Result.getName());
	    
	    String screenshortpath = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.PASS,
				"Screen short below :" + ExtentTestManager.getTest().addScreenCapture(screenshortpath));

	    
	    }		

	    // When Test case get Skipped, this method is called.		
	    @Override		
	    public void onTestSkipped(ITestResult Result)					
	    {		
	    System.out.println("The name of the testcase Skipped is :"+Result.getName());	
	    
	    ExtentTestManager.getTest().log(LogStatus.SKIP,"The name of the testcase Skipped is :"+Result.getName());
	    
	    
	    }		

	    // When Test case get Started, this method is called.		
	    @Override		
	    public void onTestStart(ITestResult Result)					
	    {		
	    System.out.println(Result.getName()+" test case started");					
	    }		

	    // When Test case get passed, this method is called.		
	    @Override		
	    public void onTestSuccess(ITestResult Result)					
	    {		
	    System.out.println("The name of the testcase passed is :"+Result.getName());					
	    }		

	
	
}
