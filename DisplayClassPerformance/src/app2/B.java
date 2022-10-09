/*      
			5
         4 5
      3 4 5
   2 3 4 5
1 2 3 4 5
*/


package app2;

public class B 
{
	public static void main(String[] args) 
	{
		
		for(int i=5; i>=1; i--)
		{
			for(int s=i; s>1; s--)
				System.out.print("   ");
			for(int n=i; n<=5; n++)
				System.out.print(n+" ");
			System.out.println();
		}
		
		
	}

}
