package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverConnection;

public class PracticeForm {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.id("firstName")).sendKeys("test");
		driver.findElement(By.id("lastName")).sendKeys("test");
		driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//*[@for='gender-radio-1']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9563524152");
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		
		String myYear = "2000";
		String myMonth = "March";
		String myDate = "10";
		
		
		
		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		Select months = new Select(month);
		months.selectByVisibleText(myMonth);
		
		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		Select years = new Select(year);
		years.selectByVisibleText(myYear);
		
		
		
		
		
		
		
		
	}
}
