package app41_50;

public class A2
{
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1, c=63+2*i; j<=4+i; j++ )
				if(j<=5-i)
					System.out.print("   ");
				else
					System.out.print((char)c--+" ");
			System.out.println();
				
		}
	}

}
