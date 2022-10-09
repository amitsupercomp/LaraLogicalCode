package Pattern;

public class B 
{
	public static void main(String[] args) 
	{
		
		
		//First Method==>>  By using 3 for loop
			for(int i=6; i>=1; i--)
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print(j+" ");
					if(j==i)
						for(int s=i-1; s>=1; s--)
							System.out.print(s+" ");
				}
				System.out.println();
			}
			
			//Second Method==>> By using 2 for loop.
			for(int i=6; i>=1; i--)
			{
				for(int j=1,n=i-1; j<=2*i-1; j++)
				{
					if(j<=i)
						System.out.print(j+" ");
					else
						System.out.print(n--+" ");
				}
				System.out.println();
			}
			
			
			//Without n variable
			for(int i=6; i>=1; i--)
			{
				for(int j=1; j<=2*i-1; j++)
				{
					if(j<=i)
						System.out.print(j+" ");
					else
						System.out.print((2*i-j)+" ");
				}
				System.out.println();
			}
		
		
	}

}
