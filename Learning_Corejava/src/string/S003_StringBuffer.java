package string;

public class S003_StringBuffer {
	public static void main(String[] args) {
		
		
		//syncrinosed //time consuming
		
		double startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("hello");
		for(int i=1;i<100000;i++)
		{
			sb.append("java");
		}
		double endTime = System.currentTimeMillis();
		
		
		
		//asycronised // less time
		double startTime1 = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("hello");
		for(int i=1;i<100000;i++)
		{
			sb1.append("java");
		}
		double endTime1 = System.currentTimeMillis();
		
		
		System.out.println("Time taken by buffer : "+(endTime-startTime));
		System.out.println("Time taken by builder : "+(endTime1-startTime1));
		

	}
}
