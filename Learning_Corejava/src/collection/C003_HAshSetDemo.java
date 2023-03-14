package collection;

import java.util.HashSet;

public class C003_HAshSetDemo {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		set.add("java");
		set.add("selenium");
		set.add("php");
		set.add("android");
		set.add("java");
		
		
		for(String s : set)
		{
			System.out.println(s);
		}
		
		
		
		
		
	}
}
