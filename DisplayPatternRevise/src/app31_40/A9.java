package app31_40;

public class A9 
{
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1, n=1; j<=4+i; j++)
				if(j<=5-i)
					System.out.print("   ");
				else
					System.out.print(n++ +" ");
			System.out.println();
		}
	}

}
