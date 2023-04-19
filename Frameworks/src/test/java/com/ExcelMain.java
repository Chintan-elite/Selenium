package com;

public class ExcelMain {
	public static void main(String[] args) {
		
		ExcelReader rd = new ExcelReader("C:\\Users\\CHINTAN\\OneDrive\\Desktop\\test.xlsx","reg");
		
		int rows =  rd.getRowCount();
		System.out.println("Rows : "+rows);
		
		int cols = rd.getColCount();
		System.out.println("Cols : "+cols);
		
//		String data = rd.getData(2,1);
//		System.out.println(data);
		
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				String data = rd.getData(i, j);
				System.out.print(data+" ");
			}
			System.out.println();
		}
		
		
		
		
	}
}
