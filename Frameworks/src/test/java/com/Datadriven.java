package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.DriverConnection;

public class Datadriven {
	
	WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		 driver = DriverConnection.connect("https://www.facebook.com/");
		
	}
	
	@Test(dataProvider = "dp")
	public void login(String uname, String pass)
	{
		
		WebElement email =  driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys(uname);
		WebElement password =  driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys(pass);
		driver.findElement(By.name("login")).click();
		
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().back();
	}

	@DataProvider(name="dp")
	public Object[][] getdata()
	{
		
		ExcelReader rd = new ExcelReader("C:\\Users\\CHINTAN\\OneDrive\\Desktop\\test.xlsx","login");
		int row = rd.getRowCount();
		int col = rd.getColCount();
		
		Object obj[][] = new Object[row-1][col];
		
		
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println(i+" "+j);
				String data = rd.getData(i, j);
				obj[i-1][j] = data;
			}
		}
		
		return obj;
	}
	
	
}
