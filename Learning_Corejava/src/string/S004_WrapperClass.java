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
		//System.out.println(length);
		
		
		
//		int x = 0;
//		Integer y = null;
//		System.out.println(x);
//		System.out.println(y);
		
		
		
		try {
			String s = "fddddf";
			String s2 = "2222";
			Integer s1 = Integer.parseInt(s);
			Integer s3 = Integer.parseInt(s2);
			System.out.println(s+s2);
			System.out.println(s1+s3);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("program runing....");
		
		
		
	}
}
