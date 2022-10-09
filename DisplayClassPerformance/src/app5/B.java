package app5;

public class B 
{
	public static void main(String[] args) {
		
		for(int i=1 , l=15; i<=l; i++ )
		{
			for(int j=1; j<=l+i-1; j++)
			{
				if(j==l-i+1 ||  j==l+i-1 )
					System.out.print("1 ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
