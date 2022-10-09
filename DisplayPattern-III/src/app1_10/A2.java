package app1_10;

public class A2 {
	
	static void spaceTop(int size, int i)
	{
		for(;i<size;i++)
			System.out.print("   ");
	}
	
	static void spaceBottom(int size, int i)
	{
		for(;i>size;i--)
			System.out.print("   ");
	}
	
	static void printElementTop(int i)
	{
		for(int j=1; j<=i; j++)
			System.out.print(i+" ");
	}
	
	static void printElementBottom(int size, int i)
	{
		for(int j=i-size; j<size; j++)
			System.out.print(i+" ");
	}
	
	public static void main(String[] args) {
		
		int size=5;
		for(int i=1; i<=2*size-1; i++)
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
