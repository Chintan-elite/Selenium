package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class B009_DynamicWebTable2 {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
		
		
		for(int i=1;i<=rows.size();i++)
		{
			String dt = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/th")).getText();
			System.out.print(dt+" ");
			
			List<WebElement> cols = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/td"));
			for(int j=0;j<cols.size();j++)
			{
				String data = cols.get(j).getText();
				System.out.print(data+" ");
			}
			
			System.out.println();
		}
		
		
		driver.quit();
		
		
	}
}
