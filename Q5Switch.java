package progs;

public class Q5Switch {
	public static void main(String args[])
	{
		char c='n';
		switch(c)
		{
		case 'n':
			System.out.println("on");
			break;
		case 'f':
			System.out.println("off");
			break;
			default:
				System.out.println("Wrong input");
		}
	}
}
