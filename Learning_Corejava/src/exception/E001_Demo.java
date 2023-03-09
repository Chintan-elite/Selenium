package exception;

public class E001_Demo {
			
	public static void main(String[] args) {
		
		System.out.println("Program started");
		
		try {
			
			int a = 10;
			int j = a/0;
			System.out.println(j);
			
			int a1[] = new int[5];
			a1[6] = 500;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
//		catch (ArithmeticException e) 
//		{
//				e.printStackTrace();
//		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			e.printStackTrace();
//		}
		
		
		
		System.out.println("Program ended");
		
	}
}
