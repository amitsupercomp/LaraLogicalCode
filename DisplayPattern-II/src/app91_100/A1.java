package app91_100;

public class A1 
{
	public static void main(String[] args) {
		
		int size=5;
			for(int i=1; i<=size*2-1; i++)
			{
				if(i<=size)
				{
					for(int j=1; j<=i; j++)
						System.out.print("1 ");
				}
				else
				{
					for(int j=2*size-i; j>=1; j--)
						System.out.print("1 ");
					
				}
				System.out.println();
			}
	}

}
