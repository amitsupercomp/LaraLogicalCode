/*

						7
					7 7
				7 1 7
			7 1 2 7
		7 1 2 3 7
	7 1 2 3 4 7
7 7 7 7 7 7 7
*/




package app3;

public class A
{
	public static void main(String[] args) {
		
	for(int i=1; i<=7; i++)
	{
		for(int sp=7; sp>i; sp--)
			System.out.print("  ");
		int p=1;
		for(int n=i; n>=1; n--)
		{
			
			if(i==1 || i==7 || i==2 || n==i || n==1)
				System.out.print("7 ");
			else
			{
				System.out.print(p +" ");
				++p;
			}	
		}
		System.out.println();
	  }
	}
	

}
