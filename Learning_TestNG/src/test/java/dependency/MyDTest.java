package dependency;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class MyDTest {
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Running login test");
		assertFalse(10>5);
	}
	
	@Test(priority = 2, dependsOnMethods = "login")
	public void home()
	{
		System.out.println("Running home test");
	}
	
	@Test(priority = 3,dependsOnMethods = "home")
	public void logout()
	{
		System.out.println("Runnig logout test");
	}
}
