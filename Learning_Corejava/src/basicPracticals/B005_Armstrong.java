package basicPracticals;

public class B005_Armstrong {
	public static void main(String[] args) {
		
		
		int num = 153;
		int sum = 0;
		int temp = num;
		while(num!=0)
		{
			int rem = num%10;
			sum = sum + (rem*rem*rem);
			num = num/10;
			
		}
		
		if(sum==temp)
		{
			System.out.println("Number is armstrong");
		}
		else
		{
			System.out.println("Number is not armstrong");
		}
		
		
	
		
		
		
		
		
		
		
		
	}
}
