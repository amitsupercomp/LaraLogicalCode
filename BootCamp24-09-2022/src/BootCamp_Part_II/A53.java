package BootCamp_Part_II;

public class A53
{
	public static void main(String[] args) {
		
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=7-i; j++)
				System.out.print(j+" ");
			System.out.println();
		}
	}

}
