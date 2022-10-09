package app4;

public class E
{
	public static void main(String[] args) 
	{
		
		for(int i=1, l=11; i<=l; i++)
		{
			if(i<=l/2+1)
			{
				for(int n=1; n<=i; n++)
					System.out.print(n+" ");
			}
			else
			{
				for(int n=1; n<=(l-i)+1; n++)
					System.out.print(n+" ");
			}
			System.out.println();
		}
		
	}

}
