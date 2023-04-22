package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Hybridframework {
	
	WebDriver driver;
	
	@Test(dataProvider = "dp")
	public void test(String function, String keyword, String locator, String location, String data)
	{
		
		if(keyword.equals("browser"))
		{
			if(data.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "D:\\Software\\Selenium_data\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(data.equals("edge"))
			{
				System.setProperty("webdriver.edge.driver", "D:\\Software\\Selenium_data\\msedgedriver.exe");
				driver = new EdgeDriver();
			}
			
		} 
		else if(keyword.equals("url"))
		{
			driver.get(data);
		}
		else if(keyword.equals("click"))
		{
			if(locator.equals("id"))
			{
				driver.findElement(By.id(location)).click();
			}
			else if(locator.equals("name"))
			{
				driver.findElement(By.name(location)).click();
			}
			else if(locator.equals("xpath"))
			{
				driver.findElement(By.xpath(location)).click();
			}
		}
		else if(keyword.equals("type"))
		{
			if(locator.equals("id"))
			{
				driver.findElement(By.id(location)).sendKeys(data);
			}
			else if(locator.equals("name"))
			{
				driver.findElement(By.name(location)).sendKeys(data);
			}
			else if(locator.equals("xpath"))
			{
				driver.findElement(By.xpath(location)).sendKeys(data);
			}
		}
		else if(keyword.equals("select"))
		{
			if(locator.equals("id"))
			{
				WebElement value = driver.findElement(By.id(location));
				Select values = new  Select(value);
				values.selectByVisibleText(data);
						
			}
			else if(locator.equals("name"))
			{
				WebElement value = driver.findElement(By.name(location));
				Select values = new  Select(value);
				values.selectByVisibleText(data);
			}
			else if(locator.equals("xpath"))
			{
				WebElement value = driver.findElement(By.xpath(location));
				Select values = new  Select(value);
				values.selectByVisibleText(data);
			}
		}
		
		
		
	}
	
	@DataProvider(name="dp")
	public Object[][] getData()
	{
		ExcelReader rd = new ExcelReader("C:\\Users\\CHINTAN\\OneDrive\\Desktop\\test.xlsx","keyword1");
		int row = rd.getRowCount();
		int col = rd.getColCount();
		
		Object obj[][] = new Object[row-1][col];
		
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				String data = rd.getData(i, j);
				obj[i-1][j] = data;
			}
		}
		
		return obj;
		
	}
	
}
