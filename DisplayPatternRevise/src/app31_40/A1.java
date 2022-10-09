package app31_40;

public class A1
{
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1, n=1; j<=5; j++)
				if(j<i)
					System.out.print("   ");
				else
					System.out.print(n+++" ");
			System.out.println();
		}
		
	}

}
