package app41_50;

public class A6 
{
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int j=5, c=65; j>=2-i; j--)
				if(j>i)
					System.out.print("   ");
				else if(j<=i && j>=1)
				{
					System.out.print((char)c++ +" ");
					if(j==1)
						c=65;
				}
						
				else
					System.out.print((char)c++ +" ");
			System.out.println();
		}
		
	}

}
