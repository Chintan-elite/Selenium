package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class B014_NestedFrame {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/nestedframes");
		
		driver.switchTo().frame(driver.findElement(By.id("frame1")));
		String p =  driver.findElement(By.xpath("//*[text()='Parent frame']")).getText();
		System.out.println(p);
		
		
//		List<WebElement> frames= driver.findElements(By.tagName("iframe"));
//		System.out.println(frames.size());
		
		driver.switchTo().frame(0);
		
		 String c = driver.findElement(By.xpath("//*[text()='Child Iframe']")).getText();
		System.out.println(c);
		
		driver.quit();
		
	}
}
