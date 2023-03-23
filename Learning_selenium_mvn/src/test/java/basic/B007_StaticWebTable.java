package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.DriverConnection;

public class B007_StaticWebTable {
	
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		String ele =  driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[2]")).getText();
		System.out.println(ele);
		
		
		
		
	}
	
	
	
}
