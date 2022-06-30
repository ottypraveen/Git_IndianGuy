package Selenium_Practise_3;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Object_Repository.PageObject7;
import resources.baseToAll;

public class testCase7 extends baseToAll {
	
	WebDriver driver;
	
	@BeforeTest
	public void getInitializeDriver() throws IOException
	{
		driver=InitializeDriver();
	}
	
	@Test
	public void getTestCase7() throws InterruptedException
	{
		PageObject7 po7=new PageObject7(driver);
		Actions a=new Actions(driver);
		a.moveToElement(po7.getMousehoverOverButton()).clickAndHold().build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.DOWN,Keys.DOWN).build().perform();
		Thread.sleep(2000)
		;
		a.click().build().perform();
		
		
		
	}
	
	
	

	@AfterTest
	public void getTeardown()
	{
		driver.close();
	}

	
	
	
	

}
