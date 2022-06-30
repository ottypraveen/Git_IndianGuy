package Selenium_Practise_3;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Object_Repository.PageObject4;
import resources.baseToAll;

public class testCase4 extends baseToAll {
	
	
	
WebDriver driver;
	
	@BeforeTest
	public void getInitializeDriver() throws IOException
	{
		driver=InitializeDriver();
	}
	
	@Test
	public void getTestCase5()
	{
		PageObject4 po4=new PageObject4(driver);
		po4.getopenWindowButton().click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> iterator=windows.iterator();
		String parentID=iterator.next();
		String childID=iterator.next();
		driver.switchTo().window(childID);
		w.until(ExpectedConditions.visibilityOf(po4.getFeaturedCourse()));
		String text=po4.getFeaturedCourse().getText();
		driver.switchTo().window(parentID);
		po4.getalertTextbox().sendKeys(text);
		po4.getalertbutton().click();
		driver.switchTo().alert().accept();
		
		
	}
	
	@Test(dataProvider="getData")
	public void getfourthTestCase(String uName, String pwd)
	{
		System.out.println(uName);
		System.out.println(pwd);
		
	}
	
	
	
	@AfterTest
	public void getTeardown()
	{
		driver.quit();
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] d=new Object[3][2];
		d[0][0]="firstuser";
		d[0][1]="firstPassword";
		
		d[1][0]="secondUser";
		d[1][1]="Seconduserpassword";
		
		d[2][0]="thirduser";
		d[2][1]="thirdpassword";
		
		return d;
		
		
	}
	
	
	
}
