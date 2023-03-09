package fileio;


import java.io.FileOutputStream;
import java.io.IOException;



public class F001_OutputStramDemo {
	
	public static void main(String[] args) {
		
		FileOutputStream fos=null;
		try {
			fos = new FileOutputStream("D:\\mywork\\test.txt");
			System.out.println("File created...");
			
			String data = "Sun rises in east ??? asasa . dddds, ";
			byte b[] = data.getBytes();
			
			fos.write(b);
			System.out.println("Data written...");
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
