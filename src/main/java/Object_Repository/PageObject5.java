package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject5 {
	
	WebDriver driver;
	
	By openTabButton=By.xpath("//a[@id='opentab']");
	
	
	public WebElement getOpenTabButton()
	{
		return driver.findElement(openTabButton);
	}
	

}
