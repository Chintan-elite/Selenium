package string;

public class S004_WrapperClass {
	public static void main(String[] args) {
		
		//autoboxing
		int i = 10;
		Integer i1 = i;
		//boxing
		Integer i2 = new Integer(i);
		
		//autounboxing
		Integer l = 50;
		int k = l;
		//unboxing
		int m = l.intValue();
		
		
		int a = 5645656;
		Integer b = a;
		int length =  b.toString().length();
		System.out.println(length);
		
		
		
		
		
		
		
		
		
	}
}
