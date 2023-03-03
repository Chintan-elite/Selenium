package string;

public class S002_StringMethod {
	public static void main(String[] args) {
		
		
		String s1 = "java";
		String s2 = "selenium";
		String s3 = "java";
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
		
		System.out.println("**********************************");
		
		
		String str1 = new String("java");
		String str2 = new String("selenium");
		String str3 = new String("java");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1 == str3);
		
		
		String a = "hello";
		String b = "Hello";
		
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
		
	}
}
