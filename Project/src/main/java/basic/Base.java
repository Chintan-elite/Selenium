package basic;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
		
		
		public WebDriver driver;
		
		public WebDriver connectBrowser() throws IOException
		{
			
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream("D:\\workspace\\Java\\Selenium-Learning\\Project\\data.properties");
			prop.load(fis);
			
			String browser = prop.getProperty("browser");
			
			if(browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "D:\\Software\\Selenium_data\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
			
			}
			else if(browser.equals("edge"))
			{
				System.setProperty("webdriver.edge.driver", "D:\\Software\\Selenium_data\\msedgedriver.exe");
				driver = new EdgeDriver();
					
			}
			else if(browser.equals("ff"))
			{
				driver = new FirefoxDriver();
			}
			
			driver.manage().window().maximize();
			return driver;
		}
		
		
		
		
		
}
