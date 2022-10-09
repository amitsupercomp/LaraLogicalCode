package BootCamp_Part_I;

public class A14 
{
	public static void main(String[] args) {
		
		for(int i=3; i>=1; i--)
		{
			for(int j= 4+i; j>=i; j--)
				System.out.print(j+" ");
			System.out.println();
		}
	}

}
