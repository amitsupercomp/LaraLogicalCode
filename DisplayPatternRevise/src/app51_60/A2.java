package app51_60;

public class A2 
{
	
	public static void main(String[] args) {
		
		for(int i=4; i>=1; i--)
		{
			for(int j=4, p=1; j>=1-i; j--)
				if(j>i)
					System.out.print("   ");
				else
				{
					if(p==2)
						System.out.print("  ");
					else
						System.out.print((char)(63+2*i)+" ");
					p++;
				}
			System.out.println();
		}
		
	}

}
