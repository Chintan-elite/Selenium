package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener
{
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("test passed....");
	}
	
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test Failed.....");
	}
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test started....");
	}
	
	public void onFinish(ITestContext context) {
		
		System.out.println("test completed");
		
	}
	
	public void onStart(ITestContext context) {
		
		System.out.println("Test begun...");
	}
}
