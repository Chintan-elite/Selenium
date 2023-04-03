package basic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverConnection;

public class B011_AlertDemo {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/alerts");
		//implicite wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//explicite wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
//		driver.findElement(By.id("alertButton")).click();
//		Thread.sleep(5000);
//		Alert alert =  driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
		
		
		driver.findElement(By.id("timerAlertButton")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert =  driver.switchTo().alert();
		alert.accept();
		
		
		
		
		
		
	}
}
