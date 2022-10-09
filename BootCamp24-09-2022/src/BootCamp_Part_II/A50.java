package BootCamp_Part_II;

public class A50 
{
	public static void main(String[] args) {
		
		char c=80;
		for(int i=1; i<=5; c=(char)(80+i), i++)
		{
			for(int j=1; j<=i ; j++,c--)
				if(j==1 || j==i)
					System.out.print(c+" ");
				else
					System.out.print("0 ");
			System.out.println();
		}
	}

}
