package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class C006HAshmapDemo {
	public static void main(String[] args) {
		
//		HashMap<Integer, String> data = new HashMap<>();
//		data.put(10, "Java");
//		data.put(20, "Java");
//		data.put(30, "Android");
//		data.put(40, "SQL");
//		//data.put(10, "ORacle");
//		
//		System.out.println(data);
		
		System.out.println("********************");
		
		LinkedHashMap<Integer, String> data = new LinkedHashMap<>();
		data.put(10, "Java");
		data.put(20, "Java");
		data.put(30, "Android");
		data.put(40, "SQL");
		//data.put(10, "ORacle");
		System.out.println(data);
		
		
	}
}