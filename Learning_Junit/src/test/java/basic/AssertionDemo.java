package basic;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertionDemo {
	
	@Test
	public void test()
	{
//		int a = 10;
//		int b = 20;
//		int c = 10;
		
		//assertEquals(b, a);
		//assertEquals(c, a);
		//assertTrue(a>b);
		//assertTrue(b>a);
		//assertFalse(a>b);
		//assertFalse(b>a);
		//assertNull(null);
		//assertNull(a);
		//assertSame(a, b);
		//assertSame(a, c);
		
		
		//String s = new String("Hello");
		//String s1 = new String("Hello");
		
		
		//assertEquals(s, s1);
		//assertSame(s, s1);
		
//		Integer i1 = new Integer(10);
//		Integer i2 = new Integer(10);
		
		//assertEquals(i1, i2);
		//assertSame(i1, i2);
		
		int a[] = {10,20,30,40,50,70};
		int b[] = {10,20,30,40,50,60};
		
		
		assertArrayEquals(a, b);
		
		
		
		
		
		
		
	}
	
	
}
