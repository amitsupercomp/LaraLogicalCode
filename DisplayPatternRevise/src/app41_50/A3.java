package app41_50;

public class A3 
{
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int j=4, n=1; j>=1-i;j--)
				if(j>=i)
					System.out.print("   ");
				else if(j<=i && j>=0)
					System.out.print(j+" ");
				else
					System.out.print(n+++" ");
			System.out.println();
					
		}
		
	}

}
