package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseToAll {
	
	WebDriver driver;
	public WebDriverWait w;
	public WebDriver InitializeDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\User\\FrameWorkNew\\Selenium_Practise_3\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/Users/User/Desktop/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			w=new WebDriverWait(driver, 5);
					
			
			
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("Webdriver.firefox.driver", "C:/Users/User/Desktop/geckodriver.exe");
			driver=new FirefoxDriver();
			prop.getProperty("url");
			
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("Webdriver.IE.driver", "C:/Users/User/Desktop/geckodriver.exe");
			driver=new FirefoxDriver();
			prop.getProperty("url");
			
		}
		return driver;
		
				
				
	}

}
