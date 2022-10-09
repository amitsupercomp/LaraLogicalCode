package app6;

public class B
{
	public static void main(String[] args) 
	{
		
		for(int i=1 , l=5; i<=l; i++ )
		{
			for(int j=l, c=65; j>=2-i; j--)
			{
				if(j<=i)
				{
					if(j>0)
						System.out.print((char)c++ + " ");
					else
					{
						System.out.print((char)(c-i) + " ");
						c++;
					}
					
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}
