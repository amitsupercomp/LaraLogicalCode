package BootCamp_Part_I;

public class A33 
{
	public static void main(String[] args) {
		
		for(int i=5; i>=1; i--)
		{
			for(int j=5; j>=i; j--)
				System.out.print(j+" ");
			System.out.println();
		}
	}

}