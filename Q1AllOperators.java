package progs;
public class Q1AllOperators {
	public static void main(String args[])
	{
		int a=1;
		System.out.println("Unary operator ++a ="+a+" "+(++a));
		int b=2;
		System.out.println("Arithematic operator = "+(a+b)+" "+(++a-b));
		System.out.println("Ternary operator and relational operator"+((a>b)?a:b));
		System.out.println("logicat operator = "+(a != b));
		System.out.println("Bitwise operator = "+(a^b));
		System.out.println("Shift operator = "+(a>>1));
	}
}
