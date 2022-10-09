package BootCamp_Part_II;

public class A56 
{
	public static void main(String[] args) 
	{
		
		for(int i=6; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
				if(i==6|| j==1 || j==i)
					System.out.print("0 ");
				else
					System.out.print(j-1+" ");
			System.out.println();
		}
		
	}
}
