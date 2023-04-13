package basic;

import org.testng.annotations.Test;

public class NewTest {
		
	@Test(priority = 2)
	public void alpha()
	{
		System.out.println("Running alpha test");
	}
	
	
	@Test(priority = 4)
	public void login()
	{
		System.out.println("Running login test");
	}
	
	@Test(priority = 3, enabled = false)
	public void home()
	{
		System.out.println("Running home test");
	}

	@Test(priority = 5)
	public void beta()
	{
		System.out.println("Running beta test");
	}
	
}