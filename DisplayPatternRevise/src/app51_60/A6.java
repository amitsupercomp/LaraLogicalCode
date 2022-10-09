package app51_60;

public class A6 
{
	public static void main(String[] args) {
		
		for(int i=1; i<=7; i++)
		{
			if(i<=7/2+1)
			{
				for(int j=1, n=4-i; j<=i; j++)
					System.out.print(n+++" ");
			}
			else
			{
				for(int j=8-i, n=i-4; j>=1; j--)
					System.out.print(n+++" ");
			}
			System.out.println();
		}
	}
}
