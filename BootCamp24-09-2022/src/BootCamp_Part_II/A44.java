package BootCamp_Part_II;

public class A44 
{
	public static void main(String[] args) {
		
		for(int i=1; i<=7; i++)
		{
			for(int j=65; j<=64+i; j++)
				System.out.print((char)j+" ");
			System.out.println();
		}
	}

}
