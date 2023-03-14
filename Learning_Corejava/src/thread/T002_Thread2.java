package thread;

class Sample
{
	
}

class T1 extends Sample implements Runnable
{

	@Override
	public void run() {
		
		for(int i=0;i<10;i++)
		{
			System.out.println("t1 : "+i);
		}
		
	}
	
}

class T2 implements Runnable
{

	@Override
	public void run() {
		
		for(int i=0;i<10;i++)
		{
			System.out.println("t2 : "+i);
		}
		
	}
	
}


public class T002_Thread2 {
	public static void main(String[] args) {
		
		T1 t = new T1();
		T2 t2 = new T2();
		
		
		Thread th1 = new Thread(t);
		Thread th2 = new Thread(t2);
		
		
		th1.start();
		th2.start();
		
		
	}
}
