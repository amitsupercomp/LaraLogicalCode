package BootCamp_Part_I;

public class A15 
{
	public static void main(String[] args) {
		
		int size = 6;
		for(int i=1; i<=size; i++)
		{
			for(int j=1; j<=size; j++)
				if(i*j==j || i*j==i || j==6 || i==6)
					System.out.print("0 ");
				else
					System.out.print("1 ");
			System.out.println();
		}
		
	}

}
