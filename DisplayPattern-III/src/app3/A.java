package app3;

public class A {
	
	private static void spaceTop(int size, int i)
	{
		for(;i<size; i++)
			System.out.print("   ");
	}
	
	private static void spaceBottom(int size, int i)
	{
		for(; i>size; i--)
			System.out.print("   ");
	}
	
	private static void printElementTop(int i)
	{
		for(int j=1;j<2*i; j++)
			System.out.print("1  ");
	}
	private static void printElementBottom(int size, int i)
	{
		for(int j=1; j<4*size-2*i; j++)
			System.out.print("1  ");
	}

	public static void main(String[] args) {
		
		int size=6;
		for(int i=1; i<2*size; i++)
		{
			if(i<=size)
			{
				spaceTop(size,i);
				printElementTop(i);
			}
			else
			{
				spaceBottom(size,i);
				printElementBottom(size,i);
			}
			System.out.print("\n");
		}
	}

}
