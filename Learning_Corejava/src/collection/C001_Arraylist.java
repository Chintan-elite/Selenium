package collection;

import java.util.ArrayList;

public class C001_Arraylist {
	
	public static void main(String[] args) {
		
		//default size : 10
		// newsize=oldsize*3/2 +1  : 10*3/2 + 1 = 16
		ArrayList<String> al = new ArrayList<>();
		al.add("Java");
		al.add("Php");
		al.add("Selenium");
		al.add("Node");
		al.add("Node");
		al.add(null);
		
		//al.add(1,"Android");
		//al.set(1, "android");
		//al.remove(3);
		
		//System.out.println(al.size());
		
		for(String s : al)
		{
			System.out.println(s);
		}
		
		
		
	}
}
