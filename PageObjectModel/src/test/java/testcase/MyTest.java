package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.NewCustomer;
import util.DriverConnection;

public class MyTest {
	
	@Test
	public void test()
	{
		WebDriver driver = DriverConnection.connect("https://demo.guru99.com/V4/");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername().sendKeys("mngr502539");
		loginPage.enterPassword().sendKeys("mEgYgYj");
		loginPage.login().click();
		
		HomePage homePage = new HomePage(driver);
		homePage.newCustomer().click();
		
		NewCustomer customer = new NewCustomer(driver);
		customer.enterName().sendKeys("Test");
		
		
	}
}
