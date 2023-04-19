package listener;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import util.DriverConnection;

public class FBTest {
		
	@Test
	public void titleCheck(ITestContext i)
	{
		WebDriver driver = DriverConnection.connect("https://www.facebook.com/");
		i.setAttribute("mydriver", driver);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Facebook – log in or sign";
		assertEquals(expectedTitle, actualTitle);
		
		
	}
	
	
	@Test
	public void loginCheck(ITestContext i)
	{
		WebDriver driver = DriverConnection.connect("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("dgeb34");
		driver.findElement(By.name("login")).click();
		
		i.setAttribute("mydriver", driver);
		//title verify
		String actual = driver.getTitle();
		String expected = "Log in";
		assertEquals(expected, actual);
		
		
	}
	
	
}
