package Object_Repository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageObject6 {
	
	WebDriver driver;
	
	By namesOnTable=By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[2]//preceding-sibling::td");
	By Amounts=By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[2]//preceding-sibling::td//following-sibling::td[3]");
	By AmountofRaymond=By.xpath("//div[@class='tableFixHead']/table/tbody/tr //td[text()='Raymond']/following-sibling::td[3]");
	
	
	public pageObject6(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public List<WebElement> getNamesOnTable()
	{
		return driver.findElements(namesOnTable);
	}
	
	
	public List<WebElement> getAmounts()
	{
		return driver.findElements(Amounts);
	}
	
	public WebElement getAmountofRaymond()
	{
		return driver.findElement(AmountofRaymond);
	}
	
	
	
	
}
