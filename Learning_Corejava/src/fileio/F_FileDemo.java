package fileio;

import java.io.File;
import java.io.IOException;

public class F_FileDemo {
		
		public static void main(String[] args) {
			
			
			File file = new File("D://mywork//demo");
			
			
			//System.out.println(file.isFile());
			//System.out.println(file.isDirectory());
			
			System.out.println(file.getAbsolutePath());
			
			file.mkdir();
			
//			if(file.exists())
//			{
//				System.out.println("File available");
//				file.delete();
//				System.out.println("File deleted");
//			}
//			else
//			{
//				System.out.println("File not available");
//				try {
//					file.createNewFile();
//					System.out.println("file created...");
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
			
			
		}
}
