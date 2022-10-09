package app1_10;

public class Pattern {
	
	public static void spaceTop(int size, int i)
	{
		for(; i<size; i++)
			System.out.print("   ");
	}
	
	public static void spaceBottom(int size, int i)
	{
		for(; i>size; i--)
			System.out.print("   ");
	}
	
	public static void printElementTop(int i)
	{
		for(int j=1; j<=i; j++)
			System.out.print("1 ");
	}
	public static void printElementBottom(int size, int i)
	{
		for(int j=i-size; j<size; j++)
			System.out.print("1 ");
	}

}
