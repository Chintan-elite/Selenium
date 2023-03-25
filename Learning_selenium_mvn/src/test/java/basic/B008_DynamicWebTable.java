package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class B008_DynamicWebTable {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		
		List<WebElement> hdata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		for(WebElement element : hdata)
		{
			System.out.println(element.getText());
		}
		
		List<WebElement> data = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		
		for(WebElement element : data)
		{
			System.out.println(element.getText());
		}
		
		driver.quit();
		
		
		
	}
}
