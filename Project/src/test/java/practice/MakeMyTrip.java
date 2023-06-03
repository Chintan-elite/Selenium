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
			driver.navigate().refresh();
			driver.manage().window().maximize();
			Thread.sleep(2000);
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
			
		//*********************date*************************
			
			String fromDate = "25";
			String fromMonth = "May";
			String fromYear = "2024";
			
			while(!driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText().contains(fromYear))
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
			
			
			while(!driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[2]/div/div")).getText().contains(fromMonth))
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
			
			
			
			List<WebElement> days = driver.findElements(By.xpath("//div[@class='DayPicker-Month']/div[3]/div/div"));
			
			for(WebElement day : days)
			{
				System.out.println(day.getText());
				if(day.getText().equals(fromDate))
				{
					System.out.println(day.getAttribute("aria-label"));
					if(day.getAttribute("aria-label").contains(fromMonth))
					{
						
						day.click();
						break;
					}
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
}
