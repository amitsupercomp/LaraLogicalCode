package BootCamp_Part_II;

public class A59 
{
	public static void main(String[] args) {
		
		for(int i=4; i>=0; i--)
		{
			for(int j= i; j>=0; j--)
				if(i==4)
					System.out.print("0 ");
				else
					System.out.print(j+" ");
			System.out.println();
		}
	}

}
