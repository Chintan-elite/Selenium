package exception;


class Sample
{
	
	public void display()
	{
		
		try {
			Class.forName("exception.E001_Demo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("running...");
	}
	
}


public class E002_CompileTime {
	public static void main(String[] args) {
		
		
		
//			try {
//				Class.forName("exception.E001_Demo1");
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		
//			System.out.println("Hellooooo");
		
		
			Sample s = new Sample();
			
//				try {
//					s.display();
//				} catch (ClassNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				
//				try {
//					s.display();
//				} catch (ClassNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			
			s.display();
			s.display();
		
	}
}
