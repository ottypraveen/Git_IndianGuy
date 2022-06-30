package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject4 {
	
	WebDriver driver;
	
	By openWindowButton=By.xpath("//button[@id='openwindow']");
	By FeaturedCourse=By.xpath("//h2[contains(text(),'Featured')]");
	By alertTextbox=By.xpath("//input[@name='enter-name']");
	By alertbutton=By.xpath("//input[@id='alertbtn']");
	
	
	
	
	public PageObject4(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getopenWindowButton()
	{
		return driver.findElement(openWindowButton);
	}
	
	public WebElement getFeaturedCourse()
	{
		return driver.findElement(FeaturedCourse);
	}
	
	public WebElement getalertTextbox()
	{
		return driver.findElement(alertTextbox);
	}
	
	public WebElement getalertbutton()
	{
		return driver.findElement(alertbutton);
	}
	
	

}
