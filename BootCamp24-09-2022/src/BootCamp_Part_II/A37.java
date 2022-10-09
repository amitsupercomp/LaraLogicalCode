package BootCamp_Part_II;

public class A37 
{
	public static void main(String[] args) {
		
		for(int i=0; i<=7; i++)
		{
			for(int j=0; j<=i; j++)
				if(i==j || j==0 || i==7)
					System.out.print("0 ");
				else
					System.out.print(j+" ");
			System.out.println();
		}
	}

}
