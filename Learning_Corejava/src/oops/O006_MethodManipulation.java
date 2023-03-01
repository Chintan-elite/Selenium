package oops;

class Demo
{
	public int add(int a,int b)
	{
		//System.out.println(a+b);
		return a+b;
	}
	
	public int square(int a)
	{
		//System.out.println(a*a);
		return a*a;
	}
	
	
}

public class O006_MethodManipulation {
	public static void main(String[] args) {
		
		
		Demo d = new Demo();
		int r = d.add(10, 20);
		int sq =  d.square(r);
		System.out.println(sq);
	}
}
