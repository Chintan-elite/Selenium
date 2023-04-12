package basic;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.Calc;

@RunWith(Parameterized.class)
public class CalcTest_parameterised {
	
	int a,b,result;
	
	public CalcTest_parameterised(int a, int b, int result) {
		
		this.a = a;
		this.b = b;
		this.result = result;
	}

	@Test
	public void addTest()
	{
		Calc c = new Calc();
		int actualResult =  c.add(a, b);
		int expectedResult = result;
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Parameters
	public static List<Object[]> getData()
	{
		Object obj[][] = new Object[4][3];
		
		obj[0][0] = 10;
		obj[0][1] = 20;
		obj[0][2] = 30;
		
		obj[1][0] = 200;
		obj[1][1] = 100;
		obj[1][2] = 300;
		
		obj[2][0] = 110;
		obj[2][1] = 20;
		obj[2][2] = 130;
		
		obj[3][0] = 10;
		obj[3][1] = 200;
		obj[3][2] = 210;
		
		return Arrays.asList(obj);
		
	}
}
