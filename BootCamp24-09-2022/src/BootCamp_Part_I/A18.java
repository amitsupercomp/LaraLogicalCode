package BootCamp_Part_I;

public class A18 
{
	public static void main(String[] args) {
		
		for(int i=1; i<=7; i++)
		{
			for(int j=5; j>=0; j--)
				if(i==1 || i==7 || j==5)
					System.out.print("0 ");
				else
					System.out.print(j+" ");
			System.out.println();
		}
	}

}
