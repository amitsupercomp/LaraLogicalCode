package app5;

public class C 
{
	
	public static void main(String[] args) {
	
		
		int l=10;
		
		for(int i=1; i<=l; i++)
		{
			for(int j=1; j<=l-i+1; j++)
			{
				if(j==10-i+1)
					System.out.print("1 ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		for(int i=2; i<=l;i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(j==i)
					System.out.print("1 ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
