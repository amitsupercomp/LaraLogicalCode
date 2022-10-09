package BootCamp_Part_II;

public class A48 
{
	public static void main(String[] args) {
		
		char c=80;
		for(int i=1; i<=6; c=(char)(80-i), i++)
		{
			for(int j=1; j<=i; j++)
				System.out.print(c+++" ");
			System.out.println();
		}
	}

}
