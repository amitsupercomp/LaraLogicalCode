package BootCamp_Part_I;

public class A13
{
	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++)
		{
			for(int j=6+i; j>=i; j--)
				System.out.print(j+" ");
			System.out.println();
		}
	}

}
