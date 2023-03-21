package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class B004_FBSignUp {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Selenium_data\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		
		
//		WebElement signup =  driver.findElement(By.linkText("Create new account"));
//		signup.click();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("test");
		driver.findElement(By.name("lastname")).sendKeys("test");
		driver.findElement(By.name("reg_email__")).sendKeys("9874859685");
		driver.findElement(By.id("password_step_input")).sendKeys("test123");
		
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("10");
		
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByValue("4");
		
		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByIndex(3);
		

		List<WebElement> gender = driver.findElements(By.name("sex"));
		System.out.println(gender.size());
		gender.get(1).click();
		
		//driver.findElement(By.cssSelector("#u_2_5_pD")).click();
		
		
		
		driver.findElement(By.name("websubmit")).click();
		
		//driver.close();
		driver.quit();
	}
}
