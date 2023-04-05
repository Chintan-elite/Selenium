package basic;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class B015_DatePicker {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date : ");
		String myDate = sc.next();
		System.out.println("Enter month : ");
		String myMonth = sc.next();
		System.out.println("enter year : ");
		String myYear = sc.next();
		
		
		
		WebDriver driver = DriverConnection.connect("https://www.globalsqa.com/demo-site/datepicker/");
		
		WebElement myframe = driver.findElement(By.xpath("//*[@class='resp-tabs-container']/div[1]/p/iframe"));
		
		
		
		driver.switchTo().frame(myframe);		
			
		driver.findElement(By.id("datepicker")).click();
		
		
		String year = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		int i1 = Integer.parseInt(year);
		int i2 = Integer.parseInt(myYear);
		
		
		if(i2>i1)
		{
			while(!driver.findElement(By.className("ui-datepicker-year")).getText().equals(myYear))
			{
				driver.findElement(By.xpath("//*[@data-handler='next']/span")).click();	
			}
			
			while(!driver.findElement(By.className("ui-datepicker-month")).getText().equals(myMonth))
			{
				driver.findElement(By.xpath("//*[@data-handler='next']/span")).click();	
			}
		}
		else if(i2<i1)
		{
			while(!driver.findElement(By.className("ui-datepicker-year")).getText().equals(myYear))
			{
				driver.findElement(By.xpath("//*[@data-handler='prev']/span")).click();	
			}
			
			while(!driver.findElement(By.className("ui-datepicker-month")).getText().equals(myMonth))
			{
				driver.findElement(By.xpath("//*[@data-handler='prev']/span")).click();	
			}
		}
		else if(i1==i2)
		{
			
			while(!driver.findElement(By.className("ui-datepicker-month")).getText().equals("January"))
			{
				driver.findElement(By.xpath("//*[@data-handler='prev']/span")).click();	
			}
			
			while(!driver.findElement(By.className("ui-datepicker-month")).getText().equals(myMonth))
			{
				driver.findElement(By.xpath("//*[@data-handler='next']/span")).click();	
			}
			
		}
			
		
	
		
		
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for(WebElement date : dates)
		{
			if(date.getText().equals(myDate))
			{
				date.click();
				break;
			}
		}
		
		
		
		
		
	}
	
	
}
