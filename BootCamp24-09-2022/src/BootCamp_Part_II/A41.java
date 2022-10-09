package BootCamp_Part_II;

public class A41
{
	public static void main(String[] args) {
		
		for(int i=7; i>=1; i--)
		{
			for(int j=i; j<=7; j++)
				if(j==7)
					System.out.print("0 ");
				else
					System.out.print(j+" ");
			System.out.println();
		}
	}

}
