package oops;

abstract class Abs
{
	public abstract void display();
}

class AbsImpl extends Abs
{

	@Override
	public void display() {
		System.out.println("Running display");
	}
	
}

public class O013_AbstractDemo {
	public static void main(String[] args) {
		
		
		//Abs a = new Abs();
		AbsImpl impl = new AbsImpl();
		impl.display();
	}
}
