package app6;

public class A
{
	public static void main(String[] args) 
	{
		
		for(int i=65, l=5; i<=65+l; i++ )
		{
			for(int sp= 65+l; sp>i; sp--)
				System.out.print("  ");
			for(int j=65; j<=i; j++)
					System.out.print((char)j+" ");
			for(int j= 65; j<=i-1; j++)
				System.out.print((char)j+" ");
			System.out.println();
		}
		
	}

}


/*
 * 
 * for(int i=1; i<=6; i++)
 * {
 * 		for(int j=1; j<=(6-i); j++)
 * 			System.out.print("  ");
 * 		for(int j= 1; 
 * }
 */
