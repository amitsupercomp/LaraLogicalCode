package app41_50;

public class A8
{
	
	public static void main(String[] args) {
		
		for(int i=4; i>=1; i--)
		{
			for(int j=4; j>=2-i; j--)
				if(j>i)
					System.out.print("   ");
				else
					System.out.print(i+" ");
			System.out.println();
		}
		
	}

}
