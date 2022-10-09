package BootCamp_Part_II;

public class A40 
{
	public static void main(String[] args) {
		
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=i; j++)
				if(j==i)
					System.out.print("0 ");
				else
					System.out.print(j+" ");
			System.out.println();
		}
			
	}

}
