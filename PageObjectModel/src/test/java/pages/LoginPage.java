package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

		WebDriver driver;
		
		public LoginPage(WebDriver driver)
		{
			this.driver = driver;
		}
		
		By username = By.name("uid");
		By password = By.name("password");
		By loginButton = By.name("btnLogin");
		By resetButton = By.name("btnReset");
		
		
		public WebElement enterUsername()
		{
			return driver.findElement(username);
		}
		
		public WebElement enterPassword()
		{
			return driver.findElement(password);
		}
	
		public WebElement login()
		{
			return driver.findElement(loginButton);
		}
	
		public WebElement reset()
		{
			return driver.findElement(resetButton);
		}
}
