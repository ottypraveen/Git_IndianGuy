package Selenium_Practise_3;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.baseToAll;

public class testCase5 extends baseToAll {
	
	WebDriver driver;
	
	@Test(groups={"smoke"})
	public void getTestCase5() throws AWTException
	{
		
		int wheelAmt=15;
		System.setProperty("webdriver.chrome.driver", "C:/Users/User/Desktop/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=product/search&search");
		Robot robot=new Robot();
		driver.findElement(By.xpath("//div[@class='input-group']/input")).sendKeys("hp");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.close();
		
		
		
	}
	

}
