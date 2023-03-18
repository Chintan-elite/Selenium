package fileio;

import java.io.FileReader;
import java.io.IOException;

public class F004_FileReader {
	public static void main(String[] args) {
		
		try {
			FileReader rd = new FileReader("D://mywork//home.txt");
			
			 int i = rd.read();
			 
			 while(i!=-1)
			 {
				 char c = (char) i;
				 System.out.print(c);
				 i = rd.read();
			 }
			
			 rd.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
