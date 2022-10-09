package app1_10;

public class A9 {
	static void spaceTop(int size, int i)
	{
		for(; i<size; i++)
			System.out.print("   ");
	}
	
	static void spaceBottom(int size, int i)
	{
		for(;i>size;i--)
			System.out.print("   ");
	}
	
	static void printElementTop(int i, char c)
	{
		char c1='p';
		for(int j=1; j<=i; j++)
			if(j==1 || j==i)
				System.out.print(c+" ");
			else
				System.out.print(c1+++" ");
	}
	
	static void printElementBottom(int size, int i,char c)
	{
		char c1='p';
		for(int j=i; j<2*size; j++)
			if(j==i || j==2*size-1)
				System.out.print(c+" ");
			else
				System.out.print(c1+++" ");
	}
	public static void main(String[] args) {
		int size=5;
		char c='a';
		for(int i=1; i<2*size; i++, c++)
		{
			if(i<=size)
			{
				spaceTop(size,i);
				printElementTop(i,c);
			}
			else
			{
				spaceBottom(size, i);
				printElementBottom(size,i,c);
			}
			System.out.print("\n");
		}
		
	}

}
