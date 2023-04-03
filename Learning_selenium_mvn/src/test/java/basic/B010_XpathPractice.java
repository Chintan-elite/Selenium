package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class B010_XpathPractice {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/webtables");
		
		String name="Cierra";
		
		try {
			WebElement element =  driver.findElement(By.xpath("//*[text()='"+name+"']"));
			
			if(element.isDisplayed())
			{
				driver.findElement(By.xpath("//*[text()='"+name+"']/following-sibling::div[6]/div/span[1]")).click();
				
			}
		} 
		catch (Exception e)
		{
			System.out.println("Not Found");
			
		}
		
		
		
	}
}
