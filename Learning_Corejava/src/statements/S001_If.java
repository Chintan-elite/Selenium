package statements;

public class S001_If {
	public static void main(String[] args) {
		
		int a = 1000;
		int b = 200;
		int c = 3000;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is greater");
			}
			else
			{
				System.out.println("C is greater");
			}
		}
		else
		{
			if(b>c)
			{
			 System.out.println("B is greater");
			}
			else
			{
			 System.out.println("C is greater");
			}
		}
		
		
		
		
	}
}
