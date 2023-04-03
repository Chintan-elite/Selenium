package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class B013_FrameHandling {
	
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/frames");
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		//WebElement fm = driver.findElement(By.id("frame1"));
		
		driver.switchTo().frame(driver.findElement(By.id("frame1")));
		
		
		String dt = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(dt);
		
		driver.quit();
		
	}
}
