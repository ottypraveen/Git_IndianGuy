package Object_Repository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject2 {
	
	WebDriver driver;
	
	By AutoSuggestivetextbox=By.xpath("//div[@id='select-class-example'] //input[@id='autocomplete']");
	By autosuggestiveDropdown=By.xpath("//div[@class='ui-menu-item-wrapper']");
	
	
	public PageObject2(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement getAutoSuggestivetextbox()
	{
		return driver.findElement(AutoSuggestivetextbox);
	}
	
	public List<WebElement> getAutosuggestiveDropdown()
	{
		return driver.findElements(autosuggestiveDropdown);
	}
	

}
