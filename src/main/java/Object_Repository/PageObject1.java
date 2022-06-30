package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject1 {
	
	 WebDriver driver;
	
	private By radiobuttonText=By.xpath("//div[@id='radio-btn-example']//legend");
	private By radioButton=By.xpath("//div[@id='radio-btn-example'] //input[contains(@value,'radio2')]");
	
	
	public PageObject1(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getRadioButtonText()
	{
		return driver.findElement(radiobuttonText);
	}
	
	public WebElement getRadioButton()
	{
		return driver.findElement(radioButton);
	}

}
