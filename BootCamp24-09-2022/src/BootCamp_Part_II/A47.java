package BootCamp_Part_II;

public class A47 
{
	public static void main(String[] args) {
		
		char c='P';
		for(int i=1; i<= 7; i++, c='P')
		{
			for(int j=1; j<=i; j++)
				System.out.print(c+++" ");
			System.out.println();
		}
	}

}
