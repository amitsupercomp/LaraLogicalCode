package app51_60;

public class A5 
{
	
	public static void main(String[] args) {
		
		for(int i=1; i<=7; i++)
		{
			if(i<=7/2+1)
			{
				for(int j=1, n=3; j<=i; j++)
					System.out.print(n--+" ");
			}
			else
			{
				for(int j=8-i, n=3; j>=1; j--)
					System.out.print(n--+" ");
			}
			System.out.println();
		}
		
	}

}
