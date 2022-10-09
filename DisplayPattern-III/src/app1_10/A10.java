package app1_10;

public class A10 {

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
	
	static int printElementTop(int i,int n, char c)
	{
		for(int j=1; j<=i; j++)
			if(j==1 || j==i)
				System.out.print(c+" ");
			else
				System.out.print(n+++" ");
		return n;
	}
	
	static int printElementBottom(int size, int i,int n,char c)
	{
		for(int j=i; j<2*size; j++)
			if(j==i || j==2*size-1)
				System.out.print(c+" ");
			else
				System.out.print(n+++" ");
		return n;
	}
	public static void main(String[] args) {
		int size=5,n=1;
		char c='a';
		for(int i=1; i<2*size; i++, c++)
		{
			if(i<=size)
			{
				spaceTop(size,i);
				n=printElementTop(i,n,c);
			}
			else
			{
				spaceBottom(size, i);
				n=printElementBottom(size,i,n,c);
			}
			System.out.print("\n");
		}
		
	}
}
