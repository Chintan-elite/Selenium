package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.DriverConnection;

public class B012_WindowHandling {
	
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/browser-windows");
		
		String mainWindow = driver.getWindowHandle();
		System.out.println("MainWondow : "+mainWindow);
		
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		for(String win : allWindows)
		{
			if(!win.equals(mainWindow))
			{
				driver.switchTo().window(win);
			}
		}
		
		
		String dt =  driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(dt);
		
//		driver.close();
//		driver.switchTo().window(mainWindow);
//		driver.close();
		
		driver.quit();
		
	}
}
