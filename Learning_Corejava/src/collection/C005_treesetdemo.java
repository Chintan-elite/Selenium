package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class C005_treesetdemo {
	public static void main(String[] args) {
		
		
//		TreeSet<String> set = new TreeSet<>();
//		set.add("java");
//		set.add("selenium");
//		set.add("php");
//		set.add("android");
//		set.add("java");
//		
//		Iterator<String> itr = set.iterator();
//		//Iterator<String> itr = set.descendingIterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		TreeSet<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(20);
		set.add(5);
		set.add(15);
		set.add(9);
		
		
		Iterator<Integer> itr = set.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
