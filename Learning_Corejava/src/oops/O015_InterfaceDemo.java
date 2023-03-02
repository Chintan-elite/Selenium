package oops;

interface I1
{
	public void display();	
}

interface I2
{
	public void sample();
}

class InterImpl implements I1,I2
{

	@Override
	public void display() {
		System.out.println("Diplsay calling...");
	}

	@Override
	public void sample() {
		System.out.println("Sample running");
	}
	
}



public class O015_InterfaceDemo {
	public static void main(String[] args) {
		
		
		InterImpl i = new InterImpl();
		i.display();
		i.sample();
		
	}
}
