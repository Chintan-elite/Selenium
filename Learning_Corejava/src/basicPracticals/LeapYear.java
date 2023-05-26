package basicPracticals;

public class LeapYear {
	public static void main(String[] args) {
		
		
		int year = 1600;
		boolean leap = false;
		if(year%4==0)
		{
			leap=true;
			if(year%100==0)
			{
				if(year%400==0)
				{
					leap=true;
				}
				else
				{
					leap=false;
				}
			}
		}
		else
		{
			leap=false;
		}
		
		
		if(leap)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not leap year");
		}
	
		
		
	}
}
