package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class C002_Arraylist {
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		
		
		ArrayList al = new ArrayList<>(a);
		al.add("Java");
		al.add(10);
		al.add(10.233);
		al.add('a');
		al.addAll(a);
		
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
//		for(Object s : al)
//		{
//			System.out.println(s);
//		}
		
		
//		for(int i=0;i<al.size();i++)
//		{
//			System.out.println(al.get(i));
//		}
//		
		
		
	}
}
