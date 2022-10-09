package app5;

public class A 
{
	public static void main(String[] args)
	{
		
		for(int i=9, l=9; i>=1; i--)
		{
			for(int j=1; j<=2*l-i; j++)
			{
				if(i==j || j==2*l-i)
					System.out.print("1 ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}
