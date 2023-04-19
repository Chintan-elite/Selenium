package listener;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class FBTestListener implements ITestListener {
	
		public void onTestFailure(ITestResult result) {
			
			WebDriver driver = (WebDriver) result.getTestContext().getAttribute("mydriver");
			String testName = result.getName();
			String path = "D://test//"+testName+".png";
			
			TakesScreenshot screenShot = (TakesScreenshot) driver;
			File source = screenShot.getScreenshotAs(OutputType.FILE);
			File dest = new File(path);
			
			
				try {
					Files.copy(source, dest);
					System.out.println("Screenshot taken");
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			
			
		}
	
}