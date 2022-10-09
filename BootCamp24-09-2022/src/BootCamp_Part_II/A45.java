package BootCamp_Part_II;

public class A45 
{
	public static void main(String[] args) {
		
		for(int i=1; 	i<=6; i++)
		{
			for(int j=64+i; j>=65; j--)
				System.out.print((char)j+" ");
			System.out.println();
		}
	}

}
