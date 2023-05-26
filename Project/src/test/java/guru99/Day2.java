package guru99;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Day2 {
		
	@Test
	public void loginTest()
	{
		
		System.setProperty("webdriver.firefox.marionette", "D:\\Software\\Selenium_data\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(" http://www.demo.guru99.com/V4/");
		
		driver.findElement(By.name("uid")).sendKeys("mngr504935");
		driver.findElement(By.name("password")).sendKeys("uhUgAba");
		driver.findElement(By.name("btnLogin")).click();
		
		
		//assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage");
		
		String text = driver.findElement(By.xpath("//table[@class='layout']/tbody/tr/td/table/tbody/tr[3]/td")).getText();
		
		assertEquals(text, "Manger Id : mngr504935");
		
	}
}
