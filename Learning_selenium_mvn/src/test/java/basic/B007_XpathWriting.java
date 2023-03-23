package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class B007_XpathWriting {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("file:///D:/workspace/Java/Selenium-Learning/Practice/src/main/webapp/index.html");
		
	//	WebElement ele =  driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
		WebElement ele =  driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]"));
		
		String data = ele.getText();
		System.out.println(data);
		
		driver.findElement(By.xpath("//form/input[1]")).sendKeys("test");
		
	}
}
