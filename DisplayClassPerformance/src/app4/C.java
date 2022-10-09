package app4;

public class C 
{
	public static void main(String[] args)
	{
		
		for(int i=1;		i<=5;		i++)
		{
			for(int sp=5; sp>i; sp--)
				System.out.print("  ");
			for(int j=1; j<=i*2-1; j++)
				System.out.print("* ");
			System.out.println();
		}
		
	}

}
