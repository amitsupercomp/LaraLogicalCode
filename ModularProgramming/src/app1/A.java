package app1;

public class A {
	public static void main(String[] args) {
		printPattern(5);
	}
	
	public static void printPattern(int size)
	{
		for(int i=1; i<=size; i++)
		{
			printElement(i);
			System.out.println();
		}		
	}
	
	public static void printElement(int i)
	{
		for(int j=1; j<=i; j++)
			System.out.print("* ");
	}
}
