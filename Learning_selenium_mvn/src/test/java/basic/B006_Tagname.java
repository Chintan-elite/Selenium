package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class B006_Tagname {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://www.amazon.in/");
		
		
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		for(WebElement link : allLinks)
		{
			System.out.println(link.getText());
		}
		
		
		
		
		
		
	}
	
	
}
