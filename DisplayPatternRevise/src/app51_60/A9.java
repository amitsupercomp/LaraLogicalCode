package app51_60;

public class A9
{
	
	public static void main(String[] args) {
		
		for(int i=1; i<=7; i++)
		{
			if(i<=7/2+1)
			{
				for(int j=4; j>=1; j--)
					if(j>i)
						System.out.print("   ");
					else
						System.out.print("* ");
			}
			else
			{
				for(int j=1; j<=4; j++)
					if(j+4<=i)
						System.out.print("   ");
					else
						System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
