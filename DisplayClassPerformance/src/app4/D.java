package app4;

public class D 
{
	public static void main(String[] args) 
	{
		
		for(int i=1, k=11;  i<=k;  i++)
		{
			if(i<=k/2+1)
			{
				for(int j=1; j<=i; j++)
					System.out.print("* ");				
			}
			else
			{
				
				for(int j=1; j<=(k-i)+1; j++)
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}
