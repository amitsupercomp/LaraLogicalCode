package BootCamp_Part_I;

public class A23 
{
	public static void main(String[] args) {
		
		for(int i=65; i<=70; i++)
		{
			for(int j=i; j<=5+i; j++)
				System.out.print((char)j+" ");
			System.out.println();
		}
	}

}
