package statements;

import java.util.Scanner;

public class S005_Calc {
	public static void main(String[] args) {
		
		int choice = 0;
		do
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter value of b : ");
		int b = sc.nextInt();
		System.out.println("Enter choice :");
		System.out.println("0 :Exit");
		System.out.println("1 : add");
		System.out.println("2 : sub");
		System.out.println("3 : mul");
		System.out.println("4 : div");
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1 : System.out.println("Addition is : " + (a+b));
		break;
		case 2 : System.out.println("Substraction is : "+(a-b));
		break;
		case 3 : System.out.println("NMultiplication is : "+(a*b));
		break;
		case 4 : System.out.println("Division is : "+(a/b));
		break;
		case 0 : System.out.println("Exit !!!");
		break;
		default : System.out.println("invalid choice");
		}
		
		}while(choice!=0);
		
		
	}
}
