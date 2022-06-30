package Selenium_Practise_3;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Object_Repository.pageObject6;
import resources.baseToAll;

public class testCase6 extends baseToAll {
	
	WebDriver driver;
	

	@BeforeTest
	public void getInitializeDriver() throws IOException
	{
		driver=InitializeDriver();
	}
	
	
	
	@Test
	public void getTestCase6()
	{
		pageObject6 po6=new pageObject6(driver);
		for(WebElement name: po6.getNamesOnTable())
		{
			System.out.println(name.getText());
		}
		System.out.println("---------------------------------------");
		
		int sum=0;
		for(WebElement amount: po6.getAmounts())
		{
			System.out.println(Integer.parseInt(amount.getText()));
			sum=sum+Integer.parseInt(amount.getText());
		}
		System.out.println("--------------------------------------");
		System.out.println("sum is"+" "+sum);
		Assert.assertEquals(sum, 296);
		
		
		
		
		System.out.println("----------------------------------------");
		
		System.out.println("The Amount for Raymond is"+" "+Integer.parseInt(po6.getAmountofRaymond().getText()));
		
		
	}
	
	

	@AfterTest
	public void getTeardown()
	{
		driver.close();
	}


}
