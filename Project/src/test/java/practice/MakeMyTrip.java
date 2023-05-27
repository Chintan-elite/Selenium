package practice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MakeMyTrip {

	
		@Test
		public void test() throws InterruptedException
		{
			System.setProperty("webdriver.firefox.marionette", "D:\\Software\\Selenium_data\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.makemytrip.com");
			
			String fromCity = "Surat, India";
			String toCity = "Ahmedabad, India";
			
			driver.findElement(By.id("fromCity")).click();
			driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(fromCity);
			Thread.sleep(2000);
			List<WebElement> cities = driver.findElements(By.xpath("//ul[@role='listbox']/li/div/div[1]/p[1]"));
			
			for(WebElement city : cities)
			{
				if(city.getText().equals(fromCity))
				{
					city.click();
					break;
				}
			}
			
			
		//****************************************************
			
			driver.findElement(By.id("toCity")).click();
			driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(toCity);
			Thread.sleep(2000);
			List<WebElement> cities1 = driver.findElements(By.xpath("//ul[@role='listbox']/li/div/div[1]/p[1]"));
			
			for(WebElement city : cities1)
			{
				if(city.getText().equals(toCity))
				{
					city.click();
					break;
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
}
