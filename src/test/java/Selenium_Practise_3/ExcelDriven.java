package Selenium_Practise_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriven {
	
	public ArrayList<String> getDataFromExcel(String testCase) throws IOException
	
	{
		ArrayList<String> a=new ArrayList<>();
		FileInputStream fisexcel=new FileInputStream("C:\\Users\\User\\FrameWorkNew\\Selenium_Practise_3\\TestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fisexcel);
		int worksheets=workbook.getNumberOfSheets();
		Row firstRow;
		
		for(int i=0;i<worksheets;i++)
		{
			
			if(workbook.getSheetName(i).equalsIgnoreCase("TestData"))
			{
				XSSFSheet worksheet=workbook.getSheetAt(i);
				Iterator<Row> rows=worksheet.rowIterator();
				firstRow=rows.next();
				Iterator<Cell> cells=firstRow.cellIterator();
				
				int k=0;
				int column=0;
				while (cells.hasNext())
				{
					
					Cell firstCell=cells.next();
					if(firstCell.getStringCellValue().equalsIgnoreCase("TestCase"))
					{
						column=k;
					}
					
				}
				
				while(rows.hasNext())
				{
					firstRow=rows.next();
					
					if(firstRow.getCell(column).getStringCellValue().equalsIgnoreCase(testCase))
					{
						Iterator <Cell> cv=firstRow.cellIterator();
						while(cv.hasNext())
						{
							
							a.add(cv.next().getStringCellValue());
							
						}
					}
				}
				
				
			}
			
		}
		return a;
		
	}

}
