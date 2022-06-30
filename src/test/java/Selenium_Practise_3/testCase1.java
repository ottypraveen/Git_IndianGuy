package Selenium_Practise_3;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Object_Repository.PageObject1;
import resources.baseToAll;

public class testCase1 extends baseToAll {
	
	WebDriver driver;
	
	@BeforeTest
	public void getInitializeDriver() throws IOException
	{
		driver=InitializeDriver();
	}
	
	@Test(enabled=false)
	public void getTestCase1()
	{
		PageObject1 po1=new PageObject1(driver);
		w.until(ExpectedConditions.visibilityOf(po1.getRadioButton()));
		po1.getRadioButton().click();
		System.out.println(po1.getRadioButtonText().getText());
		Assert.assertEquals(po1.getRadioButtonText().getText(), "Radio Button Example");
		System.out.println("I am not Printed");
	}
	
	@AfterTest
	public void getTeardown()
	{
		driver.close();
	}

}
