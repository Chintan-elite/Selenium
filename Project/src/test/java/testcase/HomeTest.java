package testcase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basic.Base;
import pageobject.LoginPage;

public class HomeTest extends Base {
		
	@Test(dataProvider = "dp")
	public void test(String uname, String pass) throws IOException
	{
		driver = connectBrowser();
		driver.get("https://www.fb.com");
		
		LoginPage l = new LoginPage(driver);
		l.getEmail().sendKeys(uname);
		l.getPass().sendKeys(pass);
		l.getLogin().click();
		
		assertEquals(driver.getTitle(), "Log in to Facebook");
		
		driver.close();
	}
	
	@DataProvider(name="dp")
	public Object[][] getData()
	{
		Object obj[][] = new Object[3][2];
		
		obj[0][0] = "test@gmail.com";
		obj[0][1] = "test123";
		
		obj[1][0] = "tech1@gmail.com";
		obj[1][1] = "tech123";
		
		obj[2][0] = "abc2gmail.com";
		obj[2][1] = "abc123";
		
		return obj;	
	}
	
	
	
}
