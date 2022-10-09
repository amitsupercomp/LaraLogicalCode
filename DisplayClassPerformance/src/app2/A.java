/*
        1
      1 1
    1 1 1
  1 1 1 1 
1 1 1 1 1
 */

package app2;

public class A 
{
	
	public static void main(String[] args) 
	{
		
//		for(int i=5; i>=1; i--)
//		{
//			for(int s=i-1; s>=1; s--)
//				System.out.print("   ");
//			for(int j=5; j>=i; j--)
//				System.out.print("1  ");
//			System.out.println();
//		}
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=(5-i); j++)
			 System.out.print("  ");
			for(int j=1; j<=i; j++)
				System.out.print("1 ");
			System.out.println();
		}
		
		
		
	}

}
