package progs;

public class Q2Prime {
	public static void main(String args[])
	{
		boolean flag=true;
		int a=8; //number to be checked
		for(int i=2;i<a/2;i++)
		{
			if(i%2==0)
			{
				flag=false;
				System.out.println("Not a prime number");
				break;
			}
		}
		if(flag)
			System.out.println("Prime Number");
	}
}
