package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class F003_fileWriterDemo {
	public static void main(String[] args) {
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("D://mywork//home.txt");
			String s = "this is my io practical";
			fw.write(s);
			fw.flush();
			System.out.println("Done!!!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
