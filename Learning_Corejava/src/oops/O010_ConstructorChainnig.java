package oops;

class P
{
	P()
	{
		System.out.println("P const. calling....");
	}
}

class Q extends P
{
	Q(){
		super();
		System.out.println("Q const. calling....");
	}
	Q(int i)
	{
		this("test");
		System.out.println("int para : "+i);
	}
	Q(String name)
	{
		this();
		System.out.println("My name is : "+name);
	}
}

class R extends Q
{
	R(){
		
		
		super(10);
		System.out.println("R const. calling...");
	}
}


public class O010_ConstructorChainnig {
	public static void main(String[] args) {
		
		R r = new R();
	}
}
