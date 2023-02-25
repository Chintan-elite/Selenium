package oops;

class Employee
{
	Employee()
	{
		System.out.println("Hello");
	}
	
	Employee(int a)
	{
		System.out.println("int para. caaled");
	}
	
	Employee(String name,int a)
	{
		System.out.println("String ");
	}
	
	public void display()
	{
		System.out.println("runing display");
	}
	
}

public class O004_Contrtructor1 {
	public static void main(String[] args) {
		
		Employee e = new Employee();
		Employee e1 = new Employee(10);
		Employee e2 = new Employee("Hello",10);
		e2.display();
		
	}
}
