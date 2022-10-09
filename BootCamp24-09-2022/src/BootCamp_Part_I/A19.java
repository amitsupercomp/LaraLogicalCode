package BootCamp_Part_I;

public class A19 
{
	public static void main(String[] args) {
		
		for(int i=0; i<=6; i++)
		{
			for(int j=i+4; j>=i-1; j--)
				if(i==0 || i==6 || j==i+4 || j==i-1)
					System.out.print("0 ");
				else
					System.out.print(j+" ");
			System.out.println();
		}
	}

}
