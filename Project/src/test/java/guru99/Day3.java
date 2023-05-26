package guru99;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Day3 {
		
	@Test(dataProvider = "dp")
	public void loginTest(String uname, String pass)
	{
		
		System.setProperty("webdriver.firefox.marionette", "D:\\Software\\Selenium_data\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(" http://www.demo.guru99.com/V4/");
		
		driver.findElement(By.name("uid")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("btnLogin")).click();
		
		
		
		try {
			
			Alert alert = driver.switchTo().alert();
			assertEquals(alert.getText(), "User or Password is not valid");
		
		
		} catch (Exception e) {
			//assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage");
			e.printStackTrace();
		}
			
	}
	
	@DataProvider(name="dp")
	public Object[][] getdata()
	{
		ExcelReader rd = new ExcelReader("C:\\Users\\CHINTAN\\OneDrive\\Desktop\\mytest.xlsx","guru");
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
