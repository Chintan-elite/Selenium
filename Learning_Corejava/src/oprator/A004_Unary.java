package oprator;

public class A004_Unary {
	
	public static void main(String[] args) {
		
		int a = 21;
		int b = a++ + ++a + --a + a-- + a--;
				
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
	}
	
	
}
