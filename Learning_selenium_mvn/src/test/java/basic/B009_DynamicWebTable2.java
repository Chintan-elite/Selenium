package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class B009_DynamicWebTable2 {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("https://www.techlistic.com/p/demo-selenium-practice.html");
		
//		List<WebElement> head = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th"));
//		
//		for(WebElement h : head)
//		{
//			System.out.print(h.getText()+" ");
//		}
//		System.out.println();
//		
//		
//		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
//		
//		for(int i=1;i<=rows.size();i++)
//		{
//			WebElement bodyh =  driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/th"));
//			System.out.print(bodyh.getText()+" ");
//			
//			List<WebElement> cols =  driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/td"));
//			for(WebElement col : cols)
//			{
//				System.out.print(col.getText()+" ");
//			}
//			System.out.println();
//		}
//		
//		
//		WebElement footerh = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr/th"));
//		WebElement footerc = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr/td"));
//		
//		System.out.println(footerh.getText()+" "+footerc.getText());
//		
		
		//test1
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
		if(rows.size()==4)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		//test2
		List<WebElement> frowsh = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr/th"));
		List<WebElement> frowsc = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr/td"));
		
		if((frowsh.size()+frowsc.size())==2)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		//test3
		
		List<WebElement> brows = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
		
		int max =0;
		for(int i=1;i<=brows.size();i++)
		{
			String height =  driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/td[3]")).getText();
			Integer h = Integer.parseInt(height.substring(0,3));
			if(h>max)
			{
				max = h;
			}
			
		}
		
		System.out.println(max);
		
		
		
		
		
		driver.quit();
		
		
	}
}
