package app51_60;

public class A3
{
	
	public static void main(String[] args) {
		
		for(int i=4; i>=1; i--)
		{
			for(int j=1, c=65; j<=3+i; j++)
				if(j<=4-i)
					System.out.print("   ");
				else
					System.out.print((char)c+++" ");
			System.out.println();
		}
		
	}

}
