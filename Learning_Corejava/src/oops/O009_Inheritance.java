package oops;

class A { 
	int a=10;
	
	public void sample()
	{
		System.out.println("Runnig class A sample");
	}
}

class B extends A
{
	int a = 50;
	public void display()
	{
		System.out.println("A : "+super.a);
		System.out.println("A : "+a);
		System.out.println("Running class B display");
	}
	
	public void sample()
	{
		System.out.println("Runnig class B sample");
		super.sample();
	}
	
	
}

class C extends B
{
	
}



public class O009_Inheritance {
	public static void main(String[] args) {
		
		
		
		B b = new B();
		b.display();
		b.sample();
		
	}
}
