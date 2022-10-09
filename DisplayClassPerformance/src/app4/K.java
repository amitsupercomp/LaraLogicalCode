
/*


	1								1
		1						1
			1				1
				1		1
					1
*/

package app4;

public class K
{
	public static void main(String[] args) 
	{
		
		for(int i=1, l=14; i<=l; i++)
		{
			for(int j=1; j<=l; j++)
			{
				if((i%2==1 && j==i)  || (i%2==1 && j==l-(i*1)))
					System.out.print("1");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		
		
	}

}
