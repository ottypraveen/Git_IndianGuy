package Selenium_Practise_3;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Object_Repository.PageObject3;
import resources.baseToAll;

public class testCase3 extends baseToAll {
	
WebDriver driver;
	
	@BeforeTest
	public void getInitializeDriver() throws IOException
	{
		driver=InitializeDriver();
	}
	
	
	@Test
	public void getTestCase3()
	{
		PageObject3 po3=new PageObject3(driver);
		w.until(ExpectedConditions.visibilityOf(po3.getcheckBoxText()));
		po3.getcheckbox().click();
		String opt=po3.getcheckBoxText().getText();
		System.out.println(opt);
		Select dropdown=new Select (po3.getSelectdropdownoption());
		List<WebElement> optionsindropdown=dropdown.getOptions();
		for(WebElement option: optionsindropdown)
		{
			System.out.println(option.getText());
		}
		
		dropdown.selectByVisibleText(opt);
		
	}
	

	@Test(groups={"smoke"})
	public void getsampleTestCase3()
	{
		System.out.println("This is TestCase3");
	}
	
	
	
	@AfterTest
	public void getTeardown()
	{
		driver.close();
	}


}
