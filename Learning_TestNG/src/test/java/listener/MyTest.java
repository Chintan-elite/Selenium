package listener;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class MyTest {
	
	
	@Test
	public void test1()
	{
		System.out.println("Runnig test1...");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Running test2...");
		assertTrue(false);
	}
}
