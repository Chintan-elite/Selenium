package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import util.DriverConnection;

public class B005_Linktext {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("https://www.amazon.in/");
		
		
		//driver.findElement(By.linkText("Best Sellers")).click();
		
		
		List<WebElement> links = driver.findElements(By.partialLinkText("Amazon"));
		
		for(WebElement link : links)
		{
			System.out.println(link.getText());
		}
		
		
		
		
		
		
		
	}
}
