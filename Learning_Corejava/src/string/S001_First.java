package string;

public class S001_First {
	public static void main(String[] args) {
		
		//string literal
		String s = "Hello world hello java";
		//string object
		String s1 = new String("hello");
		
		String s2 =  s.concat("World");
		System.out.println(s2);
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(3));
		System.out.println(s.indexOf("o"));
		System.out.println(s.lastIndexOf("o"));
		System.out.println(s.replace("o", "x"));
		System.out.println(s.concat("Hello"));
		System.out.println(s.substring(6));
		System.out.println(s.substring(6,9));
		
		String a[] = s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	
		char ch[] = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
		
		
	}
}
