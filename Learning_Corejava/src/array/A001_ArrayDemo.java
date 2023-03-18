package array;

public class A001_ArrayDemo {
	public static void main(String[] args) {
		
		
		//int a = 10;
		
		
		  int a[] = new int[2];
		  
		  a[0] = 10; a[1] = 20;
		  
		  for(int i=0;i<a.length;i++) { System.out.println(a[i]); }
		 
		
		int b[] = {10,20,30,40,50,60,70,80};
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		String sub[] = {"Java","php","python"};
		
		for(int i=0;i<sub.length;i++)
		{
			System.out.println(sub[i]);
		}
	}
}
