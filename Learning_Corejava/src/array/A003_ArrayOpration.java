package array;

public class A003_ArrayOpration {
	public static void main(String[] args) {
		
		int a[] = {10,20,2,1,89,12,36,89};
		
		//sum
//		int sum = 0;
//		for(int i=0;i<a.length;i++)
//		{
//			sum = sum + a[i];
//		}
//		
//		System.out.println("Sum is : "+sum);
//		System.out.println("avg is : "+(sum/a.length));
		
		int max = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		
		System.out.println("max is : "+max);
		
		
	}
}
