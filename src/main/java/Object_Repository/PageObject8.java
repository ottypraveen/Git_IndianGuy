package Object_Repository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject8 {
	
	WebDriver driver;
	
	By soapUILink=By.xpath("//a[text()='SoapUI']");
	By AlLinks=By.xpath("//li[@class='gf-li']/a");
	
	
	
	
	
	public PageObject8(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}





	public WebElement getsoapUILink()
	{
		return driver.findElement(soapUILink);
		
	}
	
	public List<WebElement> AlLinks()
	{
		return driver.findElements(AlLinks);
		
	}


}
