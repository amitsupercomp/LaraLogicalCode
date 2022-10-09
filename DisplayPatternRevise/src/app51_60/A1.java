package app51_60;

public class A1 {
	public static void main(String[] args) {
		
		for(int i=4; i>=1; i--)
		{
			for(int j=4, p=1; j>=1-i;j--)
				if(j>i)
					System.out.print("   ");
				else
				{
					if(p==2)
						System.out.print("  ");
					else
						System.out.print((char)(i+64)+" ");
					p++;
				}
			System.out.println();
					
		}
		
	}

}
