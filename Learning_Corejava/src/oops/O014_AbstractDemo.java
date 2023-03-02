package oops;

abstract class Account
{
	double balance=10000;
	public abstract void deposite(double amount);
	public abstract void withrow(double amount);
	public void getBalance()
	{
		System.out.println(balance);
	}
}

class Saving extends Account
{

	@Override
	public void deposite(double amount) {
		balance = balance+amount;
	}

	@Override
	public void withrow(double amount) {
		balance=balance-amount;
		
	}
	
}

class Loan extends Account
{

	@Override
	public void deposite(double amount) {
		balance = balance-amount;
	}

	@Override
	public void withrow(double amount) {
		balance=balance+amount;
		
	}

}

public class O014_AbstractDemo {
	public static void main(String[] args) {
		
		
//		Saving s = new Saving();
//		s.deposite(5000);
//		s.deposite(8000);
//		s.withrow(5000);
//		s.getBalance();
		
		
		
		Loan l = new Loan();
		l.deposite(2000);
		l.deposite(5000);
		l.withrow(10000);
		l.getBalance();
		
		
		
	}
}
