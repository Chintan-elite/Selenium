package thread;

class Th1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("th1 : "+i);
		}
	}
}

class Th2 extends Thread
{
	public void run()
	{
		char ch = 'A';
		for(int i=1;i<=26;i++)
		{
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("th2 : "+ch);
			ch++;
		}
	}
}



public class T001_Thread1 {
	public static void main(String[] args) {
		
		Th1 t1= new Th1();
		Th2 t2 = new Th2();
		
		
		t1.start();
		t2.start();
		
		
	}
}
