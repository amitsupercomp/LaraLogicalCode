package BootCamp_Part_I;

public class A25
{
	public static void main(String[] args) {
		
		char c= 70;
		for(int i =1; i<=5; c=(char)(70+i), i++)
		{
			for(int j=1; j<=6; j++)
				System.out.print(c--+" ");
			System.out.println();
		}
	}

}
