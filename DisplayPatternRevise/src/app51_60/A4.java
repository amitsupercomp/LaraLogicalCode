package app51_60;

public class A4
{
	
	public static void main(String[] args) {
		
		for(int i=1; i<=7; i++)
		{
			if(i<=7/2+1)
			{
				for(int j=1; j<=i; j++)
					System.out.print("* ");
				
			}
			else
			{
				for(int j=8-i; j>=1; j--)
					System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
