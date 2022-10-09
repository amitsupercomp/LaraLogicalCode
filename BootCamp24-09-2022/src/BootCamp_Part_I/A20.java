package BootCamp_Part_I;

public class A20
{
	public static void main(String[] args) {
		
		for(int i=1; i<=6; i++)
		{
			for(int j=7-i; j>=2-i; j--)
				if(i==1 || i==6 || j==7-i || j==2-i)
					System.out.print("0 ");
				else if(j<=1)
					System.out.print("1 ");
				else
					System.out.print(j+" ");
			System.out.println();
		}
	}

}
