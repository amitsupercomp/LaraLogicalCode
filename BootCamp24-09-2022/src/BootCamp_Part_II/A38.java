package BootCamp_Part_II;

public class A38
{
	public static void main(String[] args) {
		
		for(int i=1; i<=8; i++)
		{
			for(int j=1, n=i-2; j<=i; j++)
				if(i==8 || j==i || j==1)
					System.out.print("0 ");
				else
					System.out.print(n--+" ");
			System.out.println();
		}
	}

}
