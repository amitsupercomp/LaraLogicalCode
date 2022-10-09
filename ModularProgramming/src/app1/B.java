package app1;

public class B {
	public static void main(String[] args) {
		
		printPattern(5);
		printPattern(7);
		printPattern(9);
	}
	
	public static void printPattern(int size)
	{
		for(int i=1; i<=size; i++)
		{
			printSpace(size,i);
			printElement(i);
			System.out.print("\n");
		}
	}
	
	public static void printElement(int i)
	{
		for(int j=1; j<=i; j++)
			System.out.print("* ");
	}
	
	public static void printSpace(int size, int i)
	{
		for(int s=size; s>i; s--)
			System.out.print("  ");		
	}
}
