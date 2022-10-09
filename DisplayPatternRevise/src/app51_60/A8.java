package app51_60;

public class A8 
{
	
	public static void main(String[] args) {
		
		for(int i=1; i<=7; i++)
		{
			if(i<=7/2+1)
			{
				for(int j=1, c=69-i; j<=i; j++)
					System.out.print((char)c+++" ");
			}
			else
			{
				for(int j=8-i, c=61+i; j>=1; j--)
					System.out.print((char)c+++" ");
			}
			System.out.println();
		}
		
	}

}
