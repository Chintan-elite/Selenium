package basicPracticals;

import java.util.Scanner;

public class B003_Summation {
	public static void main(String[] args) {
		
		int k;
		do
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of k : ");
		k = sc.nextInt();
		int sum=0;
		for(int i=1;i<=k;i++)
		{
			sum = sum + i;
		}
		
		System.out.println("sum is : "+sum);
		
		}while(k!=0);
	}
}
