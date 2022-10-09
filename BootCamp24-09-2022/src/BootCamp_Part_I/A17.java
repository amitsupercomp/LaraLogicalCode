package BootCamp_Part_I;

public class A17 
{
	public static void main(String[] args) {
		
		for(int i=0; i<=5; i++)
		{
			for(int j=i-1; j<=4+i; j++)
				if(i==0 || i==5 || j==i-1 || j==4+i)
					System.out.print("0 ");
				else
					System.out.print(j+" ");
			System.out.println();
		}
	}

}
