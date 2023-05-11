package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By newCustomer =  By.linkText("New Customer");
	By editCustomer = By.linkText("Edit Customer");
	By deleteCustomer = By.linkText("Delete Customer");
	
	
	public WebElement newCustomer()
	{
		return driver.findElement(newCustomer);
	}
	
}
