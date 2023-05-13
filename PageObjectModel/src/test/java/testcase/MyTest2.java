package testcase;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MyTest2 {
	
	
	
		@Test
		public void test()
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\CHINTAN\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			EdgeDriver driver = new EdgeDriver();
			driver.get("https://www.facebook.com");
		}
		
}
