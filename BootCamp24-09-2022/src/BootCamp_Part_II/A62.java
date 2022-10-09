package BootCamp_Part_II;

public class A62 
{
	public static void main(String[] args) {
		char c='A';
		for(int i=5; i>=1; i--, c='A')
		{
			for(int j=i; j>=1; j--)
				System.out.print(c+++" ");
			System.out.println();
		}
	}

}
