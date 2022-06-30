package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject7 {
	
	WebDriver driver;
	
	By mousehoverOverButton=By.xpath("//button[@id='mousehover']");
	
	
	
	
	
	
	public PageObject7(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}






	public WebElement getMousehoverOverButton()
	{
		return driver.findElement(mousehoverOverButton);
	}
	

}
