package BootCamp_Part_II;

public class A66 
{

	public static void main(String[] args) {
		
		char c='T';
		for(int i=5; i>=1; i--,c--)
		{
			for(int j=i; j>=1; j--)
				System.out.print(c+" ");
			System.out.println();
		}
	}
}
