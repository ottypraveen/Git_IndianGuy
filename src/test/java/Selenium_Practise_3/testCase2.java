package Selenium_Practise_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Object_Repository.PageObject2;
import resources.baseToAll;

public class testCase2 extends baseToAll {
	
	WebDriver driver;
	
	@BeforeTest
	public void getInitializeDriver() throws IOException
	{
		driver=InitializeDriver();
	}
	
	
	@Test
	public void getTestCase2() throws IOException
	{
//		ExcelDriven data=new ExcelDriven();
//		ArrayList<String> d=data.getDataFromExcel("ThirdTestCase");
//		
//
//		System.out.println(d.get(3));
//		
		
		/*FileInputStream fisexcel2=new FileInputStream("C:\\Users\\User\\FrameWorkNew\\Selenium_Practise_3\\TestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fisexcel2);
		XSSFSheet worksheet=workbook.getSheet("TestData");
		String testCase=worksheet.getRow(0).getCell(0).getStringCellValue();
		DataFormatter data1=new DataFormatter();
		String val=data1.formatCellValue(worksheet.getRow(2).getCell(3));
		System.out.println(val);*/
		
		
//		FileInputStream fisexcel=new FileInputStream("C:\\Users\\User\\FrameWorkNew\\Selenium_Practise_3\\TestData.xlsx");
//		XSSFWorkbook workbook=new XSSFWorkbook(fisexcel);
//		XSSFSheet worksheet= workbook.getSheet("TestData");
//		String testcase=worksheet.getRow(0).getCell(0).getStringCellValue();
//		DataFormatter data1=new DataFormatter();
//		System.out.println(data1.formatCellValue(worksheet.getRow(2).getCell(3)));
		
		
		/*FileInputStream fixexcel2=new FileInputStream("C:\\Users\\User\\FrameWorkNew\\Selenium_Practise_3\\TestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fixexcel2);
		XSSFSheet worksheet=workbook.getSheet("Testdata");
		
		String tc=worksheet.getRow(0).getCell(0).getStringCellValue();
		DataFormatter data1=new DataFormatter();
		
		System.out.println(data1.formatCellValue(worksheet.getRow(2).getCell(3)));*/
		
		
		
		FileInputStream fis1=new FileInputStream("C:\\Users\\User\\FrameWorkNew\\Selenium_Practise_3\\TestData.xlsx");
		XSSFWorkbook workbook1=new XSSFWorkbook(fis1);
		XSSFSheet worksheet=workbook1.getSheet("TestData");
		worksheet.getRow(3).getCell(2);
		
		
		
		ExcelDriven data=new ExcelDriven();
		ArrayList<String> d=data.getDataFromExcel("ThirdTestCase");
		PageObject2 po2=new PageObject2(driver);
		po2.getAutoSuggestivetextbox().sendKeys(d.get(3));
		List<WebElement> options=po2.getAutosuggestiveDropdown();
		for(int i=0;i<options.size();i++)
		{
			if(options.get(i).getText().equalsIgnoreCase("India"))
			{
				options.get(i).click();
				break;
			}
		}
	
		


		
		
		
	}
	
	@Parameters({"URL","APIKY"})
	@Test
	public void getTestCasesecond(String url, String key)
	{
		System.out.println(url);
		System.out.println(key);
	}
	@AfterTest
	public void getTeardown()
	{
		driver.close();
	}

}
