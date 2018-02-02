package com.jocata.ssp.utility.pr;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
public class Latest {

public static void main(String[] args) throws IOException, InterruptedException {
	
	WebDriver driver = new FirefoxDriver();
	 
    driver.get("http://demo.automationtesting.in/Register.html");
    Thread.sleep(2000);

    WebElement webElement = driver.findElement(By.cssSelector("#imagetrgt"));

    Screenshot screenshot = new AShot().takeScreenshot(driver,webElement);
    //ImageIO.write(screenshot.getImage(),"PNG",new File(System.getProperty("user.dir") +"\\ErrorScreenshots\\ElementScreenshot.png"));
    ImageIO.write(screenshot.getImage(),"PNG",new File("D:\\AdvancedRaghuEvoke\\ElementScreenshot.png"));

    Thread.sleep(2000);
    System.out.println("[apass");
	
}


}
