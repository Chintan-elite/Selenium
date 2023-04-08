package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class B017_Draganddrop {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("https://www.globalsqa.com/demo-site/draganddrop/");
		
		MyScreenShot.screenShot(driver, "D://test//d1.png");
		
		WebElement frame= driver.findElement(By.xpath("//*[@class='resp-tabs-container']/div[1]/p/iframe"));
		driver.switchTo().frame(frame);
		
		
		
		WebElement img1 = driver.findElement(By.xpath("//ul[@id='gallery']/li[1]"));
		WebElement img2 = driver.findElement(By.xpath("//ul[@id='gallery']/li[2]"));
		
		WebElement trash = driver.findElement(By.id("trash"));
		
		
		Actions builder = new Actions(driver);
		
		
	    builder.clickAndHold(img1)
				.moveToElement(trash)
				.release()
				.build().perform();
				
	    MyScreenShot.screenShot(driver, "D://test//d2.png");
		
		Action e2 =  builder.clickAndHold(img2)
		.moveToElement(trash)
		.release()
		.build();
		
		
		
		e2.perform();
		
		MyScreenShot.screenShot(driver, "D://test//d3.png");
		
	}
}
