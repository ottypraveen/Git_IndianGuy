package Selenium_Practise_3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Object_Repository.PageObject8;
import resources.baseToAll;

public class testCase8 extends baseToAll{
	WebDriver driver;
	@BeforeTest
	public void getInitializeDriver() throws IOException
	{
		driver=InitializeDriver();
	}
	
	@Test
	public void getTestCase8() throws IOException, InterruptedException
	{
		PageObject8 po8=new PageObject8(driver);
//		String urlofSOAPUI=po8.getsoapUILink().getAttribute("href");
//		URL url=new URL(urlofSOAPUI);
//		
//		HttpURLConnection conn=(HttpURLConnection) url.openConnection();
//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		
//		System.out.println(conn.getResponseCode());
		
		
		List<WebElement> links=po8.AlLinks();
		
		for(WebElement link:links)
		{
			String urloflink=link.getAttribute("href");
			System.out.println(urloflink);
			URL url1=new URL(urloflink);
			HttpURLConnection conn1=(HttpURLConnection) url1.openConnection();
			conn1.setRequestMethod("HEAD");
			conn1.connect();
			int responseCode=conn1.getResponseCode();
			System.out.println(responseCode);
			if(responseCode>400)
			{
				System.out.println("The link "+ " "+link.getText());
			}
			String clickOnLinks=Keys.chord(Keys.CONTROL,Keys.ENTER);
			link.sendKeys(clickOnLinks);
			Thread.sleep(5000);
			
			
			
			
		}
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
		
		
		
		
	}
	
	
	
	
	@AfterTest
	public void getTeardown()
	{
		driver.quit();
	}


}
