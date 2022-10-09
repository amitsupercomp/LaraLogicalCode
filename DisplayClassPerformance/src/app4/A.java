/*
 * 				1	2	3	4	5	6	7	8	9
 * 					1	2	3	4	5	6	7
 * 						1	2	3	4	5
 * 							1	2	3
 * 								1							
 * 
 */
/*
 Logic - - - ->>>>  		(5-i)*2+1
 
 for(int i=1, j=9; i<=5; i++, j-=2)
 */

package app4;

public class A
{
	
	public static void main(String[] args) 
	{
		
		for(int i=1; i<=5; i++)
		{
			for(int sp=2; sp<=i; sp++)
				System.out.print("   ");
			for(int n=1; n<=9-(i-1)*2; n++)
				System.out.print(n+" ");
			System.out.println();
		}
		
	}

}
