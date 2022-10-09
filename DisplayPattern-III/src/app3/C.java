package app3;

public class C {
	
	private static void spaceTop(int size, int i)
	{
		for(;i<size; i++)
			System.out.print("   ");
	}
	private static void spaceBottom(int size, int i)
	{
		for(;i>size;i--)
			System.out.print("   ");
	}
	private static void printElementTop(int size, int i)
	{
		outer:
		for(int j=1, n=size-1; j<2*i;j++ )
			if(j==1 || j==2*i-1)
				System.out.print("1  ");
			else if(i==j)
				System.out.print(i+"  ");
			else if(i==size && j<=6)
				System.out.print(j+" ");
			else if(i==size && j>6)
				System.out.print(n--+" ");
			else
				System.out.print("   ");
	}
	private static void printElementBottom(int size,int i)
	{
		for(int j=1; j<4*size-2*i; j++)
			if(j==1 || j==4*size-2*i-1)
				System.out.print("1   ");
			else if(j==2*size-i)
				System.out.print(j+" ");
			else
				System.out.print("   ");
	}
	public static void main(String[] args) {
		
		int size=6;
		for(int i=1; i<2*size; i++)
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
