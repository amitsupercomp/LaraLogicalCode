package app4;

public class I 
{
	public static void main(String[] args)
	{
		for(int i=1, l=5; i<=l; i++)
		{
			for(int sp=l; sp>i; sp--)
				System.out.print(" ");
			for(int j=1; j<=i; j++)
				if(j==1 || j==i)
					System.out.print(i+" ");
				else
					System.out.print("  ");
			System.out.println();
		}
		
	}

}
