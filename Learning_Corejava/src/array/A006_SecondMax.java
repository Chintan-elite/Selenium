package array;

public class A006_SecondMax {
	public static void main(String[] args) {
		
		int a[] = {10,20,304,56,89,1,50,304};
		
		int max = a[0];
		int secondmax = a[1];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secondmax=max;
				max = a[i];
			}
			else if((a[i]>secondmax) && (a[i]!=max))
			{
				secondmax=a[i];
			}
		}
		
		System.out.println("secondmax : "+secondmax);
		////max = 10   20 304 
		//s max : 20 10 20 56 89 304
		
		
	}
}
