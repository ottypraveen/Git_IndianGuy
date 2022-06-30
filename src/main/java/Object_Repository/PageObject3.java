package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject3 {
	
	
	WebDriver driver;
	
	By chekboxText=By.xpath("//div[@class='right-align']/fieldset/label[2]");
	By checkbox=By.xpath("//input[@id='checkBoxOption2']");
	By Selectdropdownoption=By.xpath("//select[contains(@id,'dropdown')]");
	
	
	
	
	public PageObject3(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement getcheckBoxText()
	{
		return driver.findElement(chekboxText);
	}
	public WebElement getcheckbox()
	{
		return driver.findElement(checkbox);
	}
	public WebElement getSelectdropdownoption()
	{
		return driver.findElement(Selectdropdownoption);
	}
	
	
}