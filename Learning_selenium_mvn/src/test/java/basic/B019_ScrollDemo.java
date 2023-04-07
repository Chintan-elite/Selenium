package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class B019_ScrollDemo {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/automation-practice-form");
		
		WebElement element = driver.findElement(By.id("currentAddress"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("window.scrollBy(0,100)");
		
		//js.executeScript("arguments[0].scrollIntoView();", element);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
}
