package app31_40;

public class A5
{
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=4+i; j++)
				if(j<=5-i)
					System.out.print("   ");
				else
					System.out.print(i+" ");
			System.out.println();
		}
		
	}

}
