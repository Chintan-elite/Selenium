package oops;

class Sample1{
	public void display()
	{
		System.out.println("Running sample1 display....");
	}
}

class Sample2 extends Sample1
{
	@Override
	public void display() {
		System.out.println("Running sample2 display");
		//super.display();
	}
}

public class O012_MethodOverriding {
	public static void main(String[] args) {
		
		Sample2 sample = new Sample2();
		sample.display();
		main(5);
		
	}
	
	public static void main(int a) {
		System.out.println("main calling..."+a);
	}
}
