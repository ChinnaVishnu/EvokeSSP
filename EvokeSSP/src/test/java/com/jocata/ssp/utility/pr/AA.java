package com.jocata.ssp.utility.pr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AA {
	@Test 
	public void LoginTest()
	{
	 WebDriver driver = new FirefoxDriver();
	 driver.get("someurl")

	 Login_Page lp = new Login_Page(driver);
	 lp.genericClick(driver, lp.link1);
	}
}
