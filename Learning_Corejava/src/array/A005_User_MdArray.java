package array;

import java.util.Scanner;

public class A005_User_MdArray {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of city : ");
		int city = sc.nextInt();
		System.out.println("Enter no of days : ");
		int days = sc.nextInt();
		
		int temp[][] = new int[city][days];
		
		for(int i=0;i<city;i++)
		{
			for(int j=0;j<days;j++)
			{
				System.out.println("enter Temp of city "+i+" and day "+j);
				temp[i][j] = sc.nextInt();
			
			}
		}
		
		
		for(int i=0;i<city;i++)
		{
			for(int j=0;j<days;j++)
			{
				System.out.println("Temp of city "+i+" and day "+j+" is "+temp[i][j]);
			}
		}
		
		sc.close();
		
		
		
		
	}
}
