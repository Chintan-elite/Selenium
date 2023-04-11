package basic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnnotationDemo {
	
	@Test
	public void test1()
	{
		System.out.println("Running test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Running test2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Runnig test3");
	}
	
	@Before
	public void beforeTest()
	{
		System.out.println("Running before every test");
	}
	
	@After
	public void afterTest()
	{
		System.out.println("Running after everyTest");
	}
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Running before all test");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("Running after all test");
	}
	
	
	
}
