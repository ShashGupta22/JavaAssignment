package progs;

public class Q3LeapYear {
	public static void main(String args[])
	{
		int year=1900;
		if(year%4==0 && year%100!=0)
			System.out.println("Leap year");
		else if(year%400==0)
			System.out.println("Leap year");
		else
			System.out.println("Not a leap year");
	}
}
