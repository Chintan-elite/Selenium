package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Amazone {
	
	
		@Test
		public void test()
		{
			System.setProperty("webdriver.firefox.marionette", "D:\\Software\\Selenium_data\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("earphone");
			driver.findElement(By.id("nav-search-submit-button")).click();
			
			
			List<WebElement> elements= driver.findElements(By.cssSelector("span.a-size-medium.a-color-base.a-text-normal"));
			System.out.println(elements.size());
			for(WebElement ele : elements)
			{
				
				if(ele.getText().contains("Boult Audio Z40 True Wireless"))
				{
					System.out.println("yes");
					ele.click();
					break;
				}
				
			}
			
			driver.findElement(By.id("add-to-cart-button")).click();
		
		}
}
