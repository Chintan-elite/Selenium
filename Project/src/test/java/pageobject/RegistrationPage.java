package pageobject;

class Demo
{
	public static String display()
	{
		System.out.println("sdisplay");
		return "hello";
	}
}

public class RegistrationPage {
	
	
	static public void main(String[] abc) {
		
//		String dt = Demo.display();
//		System.out.println(dt);
		
		System.out.println(abc.length);
		
		for(int i=0;i<abc.length;i++)
		{
			System.out.println(abc[i]);
		}
		
	}
}
