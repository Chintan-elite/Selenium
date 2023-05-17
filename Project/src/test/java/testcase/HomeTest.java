package testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import basic.Base;
import pageobject.LoginPage;

public class HomeTest extends Base {
		
	@Test
	public void test() throws IOException
	{
		driver = connectBrowser();
		driver.get("https://www.fb.com");
		
		LoginPage l = new LoginPage(driver);
		l.getEmail().sendKeys("test");
		l.getPass().sendKeys("tech");
		l.getLogin().click();	
	}
}
