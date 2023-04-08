package basic;




import org.openqa.selenium.JavascriptExecutor;


import org.openqa.selenium.WebDriver;

import util.DriverConnection;

public class B020_Screenshot {
	

	
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://www.amazon.com/");
		
		MyScreenShot.screenShot(driver,"D:\\test\\home.png");
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		
		MyScreenShot.screenShot(driver,"D:\\test\\footer.png");
		
		
		
	}
}
