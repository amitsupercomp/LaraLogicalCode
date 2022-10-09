package BootCamp_Part_II;

public class A70 
{
	public static void main(String[] args) {
		char c='A';
		for(int i=5; i>=1; i--,c='A')
		{
			for(int j=1; j<=i; j++,c++)
				System.out.print(c+" "+j+" ");
			System.out.println();
		}
	}

}
