package app1_10;

public class A4 {
	
	static void spaceTop(int size, int i)
	{
		for(; i<size; i++)
			System.out.print("   ");
	}
	
	static void spaceBottom(int size, int i)
	{
		for(;i>size; i--)
			System.out.print("   ");
	}
	
	static void printElementTop(int size, int i)
	{
		for(int j=2*size-i;j<2*size;j++)
			System.out.print(j+" ");
	}
	static void printElementBottom(int size, int i)
	{
		for(;i<2*size; i++)
			System.out.print(i+" ");
	}
	
	public static void main(String[] args) {
		
		int size=5;
		for(int i=1; i<=2*size-1; i++)
		{
			if(i<=size)
			{
				spaceTop(size,i);
				printElementTop(size,i);
			}
			else
			{
				spaceBottom(size,i);
				printElementBottom(size,i);
			}
			System.out.println();
		}
	}

}
