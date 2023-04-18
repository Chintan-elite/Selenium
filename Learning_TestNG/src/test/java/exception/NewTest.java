package exception;

import org.testng.annotations.Test;

public class NewTest {
	
//	@Test(expectedExceptions = ArithmeticException.class)
//	public void test()
//	{
//		int a =10;
//		int b = a/0;
//	}
//	
//	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
//	public void test1()
//	{
//		int a[] = new int[10];
//		a[11] = 560;
//	}
	
	@Test(expectedExceptions = Exception.class)
	public void test()
	{
		int a =10;
		int b = a/0;
	}
	
	@Test(expectedExceptions = Exception.class)
	public void test1()
	{
		int a[] = new int[10];
		a[11] = 560;
	}
}
