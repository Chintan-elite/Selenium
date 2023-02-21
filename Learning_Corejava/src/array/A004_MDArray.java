package array;

public class A004_MDArray {
	public static void main(String[] args) {
		
		
//		int a[][] = new int[2][3];
//		
//		a[0][0] = 20;
//		a[0][1] = 30;
//		a[0][2] = 40;
//		
//		a[1][0] = 50;
//		a[1][1] = 60;
//		a[1][2] = 70;
		
		
		int a[][] = {{20,30,40},{50,60,70}};
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		
		
		
	}
}
