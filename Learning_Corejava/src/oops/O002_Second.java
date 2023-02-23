package oops;

class Student
{
	int id = 20;
	String name="test";
	static String clg="svnit";
	
	public void display()
	{
		System.out.println(id+" "+name+" "+clg);
	}
	
	static public void sample()
	{
		System.out.println("running sample");
	}
	
}


public class O002_Second {
	public static void main(String[] args) {
		
		Student.clg="drstc";
		Student.sample();
		
		Student st1 = new Student();
		st1.id=50;
		st1.display();
		
		
		Student st2 = new Student();
		st2.name="xyz";
		st2.display();
		
		
		
		
		
	}
}
